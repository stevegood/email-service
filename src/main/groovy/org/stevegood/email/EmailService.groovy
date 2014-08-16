package org.stevegood.email

import org.springframework.stereotype.Service

/**
 * A simple email queuing and sending service
 * @author <a href="http://stevegood.org">Steve Good</a>
 * @since 2014-08-16
 */
@Service
class EmailService {

    protected LinkedList<Email> queue

    /**
     * Automatically calls {@link #resetQueue()}
     */
    EmailService() {
        resetQueue()
    }

    /**
     * Returns the current {@link #queue} size
     * @return int
     */
    int getQueueSize() {
        queue?.size() ?: 0
    }

    /**
     * Initializes the {@link #queue}, removing anything that was already in the previous instance
     */
    void resetQueue() {
        this.queue = new LinkedList<Email>()
    }

    /**
     * Adds an {@link Email} to the {@link #queue}
     * @param email
     * @see Email
     */
    void queueEmail(Email email) {
        // Put the email in the queue for sending
        this.queue.add(email)
    }

    /**
     * Interates through the {@link #queue} and sends each {@link Email} instance through {@link #sendEmail(org.stevegood.email.Email)}
     */
    void processQueue() {
        // process the queue of emails
        Iterator iterator = this.queue.iterator()
        while (iterator.hasNext()) {
            sendEmail(iterator.next())
        }
        resetQueue()
    }

    /**
     * Sends an {@link Email} to the configured SMTP
     * @param email
     * @return
     */
    boolean sendEmail(Email email) {
        // TODO: send the email
        try {
            println "Sending mail to $email.to"
        } catch(e) {
            e.printStackTrace()
            return false
        }

        return true
    }

}
