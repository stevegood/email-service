package org.stevegood.email

import org.junit.After
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

/**
 * Created by steve on 8/16/14.
 */
@RunWith(SpringJUnit4ClassRunner)
@EnableAutoConfiguration
@SpringApplicationConfiguration(classes = Application)
class EmailServiceTests {

    @Autowired
    EmailService svc

    @After
    void tearDown() {
        resetQueue()
    }

    void resetQueue() {
        svc.resetQueue()
        assert svc.queueSize == 0
    }

    @Test
    void testAddItemToQueue() {
        def email = new Email(to: ['steve@stevegood.org'], from: 'steve@stevegood.org')

        assert svc.queueSize == 0
        svc.queueEmail(email)
        assert svc.queueSize == 1
    }

    @Test
    void testResetQueue() {
        def email = new Email(to: ['steve@stevegood.org'], from: 'steve@stevegood.org')
        svc.queueEmail(email)

        svc.resetQueue()
        assert svc.queueSize == 0
    }

    @Test
    void testProcessQueue() {
        def email = new Email(to: ['steve@stevegood.org'], from: 'steve@stevegood.org')
        svc.queueEmail(email)

        assert svc.queueSize == 1
        svc.processQueue()
        assert svc.queueSize == 0
    }

    @Test
    void testSendEmail() {
        def email = new Email(to: ['steve@stevegood.org'], from: 'steve@stevegood.org')
        assert svc.sendEmail(email)
    }

}
