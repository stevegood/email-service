package org.stevegood.email

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan
@EnableAutoConfiguration
class Application {

    @Autowired
    EmailService emailService

    static void main(String[] args) {
        SpringApplication.run Application, args
    }
}
