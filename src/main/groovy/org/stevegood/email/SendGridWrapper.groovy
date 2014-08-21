package org.stevegood.email

import com.sendgrid.SendGrid
import groovy.util.logging.Log
/**
 * Created by Steve on 8/20/2014.
 */
@Log
class SendGridWrapper implements MailWrapper {

    AppConfig config
    SendGrid sendGrid

    SendGridWrapper(AppConfig config) {
        this.config = config
        sendGrid = new SendGrid(config.username, config.password)
    }

    void send(Email email) {
        log.info "Sending using SendGrid ${config.smtp}"
        SendGrid.Email sgEmail = new SendGrid.Email()
        sgEmail.from = email.from
        sgEmail.to = email.to
        sgEmail.text = email.body
        sgEmail.subject = email.subject
        sendGrid.send(sgEmail)
    }

}
