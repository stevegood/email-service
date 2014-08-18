Email Service
=============

This is a micro-service designed to integrate with a message queue (like amqp and rabbitmq) to coordinate sending and receiving email.  It uses a nosql store to queue emails for sending and disposition (bounce, success, etc).  It is expected that this service will run in a Cloud Foundry environment.

Dependencies
------------

- Spring Boot
- Redis
- AMQP
- Cloud Foundry


License
-------

Apache v2.0