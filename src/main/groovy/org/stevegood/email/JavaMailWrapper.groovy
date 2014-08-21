package org.stevegood.email

import groovy.util.logging.Log

/**
 * Created by Steve on 8/20/2014.
 */
@Log
class JavaMailWrapper implements MailWrapper {

    AppConfig config

    JavaMailWrapper(AppConfig config) {
        this.config = config
    }

    void send(Email email) {
        log.info "Sending using JavaMail ${config.smtp}"
    }

}
