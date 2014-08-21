package org.stevegood.email

import groovy.util.logging.Log
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.cloud.CloudFactory
import org.springframework.cloud.service.common.SmtpServiceInfo
import org.springframework.context.ApplicationListener
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled

@Log
@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableScheduling
class Application implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    AppConfig config
    @Autowired
    EmailService emailService

    @Value('${cf.sendmail.service.name}')
    String sendmailServiceName

    static void main(String[] args) {
        SpringApplication.run Application, args
    }

    void onApplicationEvent(ContextRefreshedEvent e) {
        log.info 'Checking for Cloud Foundry config and setting values in config'
        def cloud
        try {
            cloud = new CloudFactory().cloud
        } catch(ex) {}

        if (cloud) {
            SmtpServiceInfo mailInfo = cloud.getServiceInfo(sendmailServiceName)
            config.smtp = mailInfo.host
            config.username = mailInfo.userName
            config.password = mailInfo.password
            emailService.mailWrapper = new SendGridWrapper(config)
        } else {
            emailService.mailWrapper = new JavaMailWrapper(config)
        }

        log.info 'Sending startup email'
        def email = new Email(
                to: config.serverAdmins.split(';'),
                from: 'alerts@stevegood.org',
                subject: 'Email service started',
                body: "The email service finished starting up at ${new Date()}."
        )
        emailService.queueEmail(email)
    }

    @Scheduled(fixedRate = 5000L)
    void processQueueTask() {
        if (!emailService.processing && emailService.queueSize) {
            log.info "Starting to process email queue (${emailService.queueSize} messages)"
            emailService.processQueue()
            log.info 'Finished processing queue.'
        }
    }
}
