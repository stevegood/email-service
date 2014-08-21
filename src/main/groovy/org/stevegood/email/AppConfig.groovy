package org.stevegood.email

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

/**
 * @author <a href="http://stevegood.org">Steve Good</a>
 * @since 2014-08-16
 */
@Component
class AppConfig {
    @Value('${app.admins}')
    String serverAdmins

    @Value('${app.smtp}')
    String smtp

    @Value('${app.port}')
    int port

    @Value('${app.useTls}')
    Boolean useTls = false

    @Value('${app.useSsl}')
    Boolean useSsl = false

    @Value('${app.username}')
    String username

    @Value('${app.password}')
    String password

    @Value('${app.needsAuth}')
    Boolean needsAuth = false
}
