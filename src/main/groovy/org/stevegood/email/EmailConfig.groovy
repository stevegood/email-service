package org.stevegood.email

/**
 * @author <a href="http://stevegood.org">Steve Good</a>
 * @since 2014-08-16
 */
class EmailConfig {
    String smtp
    int port
    Boolean useTls = false
    Boolean useSsl = false
    String username
    String password
    Boolean needsAuth = false
    int queueSeconds = 60
}
