Email Service
=============

This is a micro-service designed to integrate with a message queue (like amqp and rabbitmq) to coordinate sending and receiving email.  It uses a nosql store to queue emails for sending and disposition (bounce, success, etc).

Dependencies
------------

- Spring Boot
- Redis
- AMQP


License
-------

Apache v2.0