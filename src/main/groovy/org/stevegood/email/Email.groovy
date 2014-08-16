package org.stevegood.email

/**
 * A simple email container
 * @author <a href="http://stevegod.org">Steve Good</a>
 * @since 2014-08-16
 */
class Email implements Serializable {
    String[] to
    String from
    String[] cc
    String[] bcc
    String subject
    String body
}
