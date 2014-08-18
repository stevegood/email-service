Email Service
=============

This is a micro-service designed to integrate with a message queue (like amqp and rabbitmq) to coordinate sending and receiving email.  It uses a nosql store to queue emails for sending and disposition (bounce, success, etc).  It is expected that this service will run in a Cloud Foundry environment.

Dependencies
------------

- [Spring Boot](http://projects.spring.io/spring-boot/)
- [Redis](http://redis.io/)
- [AMQP](http://www.amqp.org/)
- [Cloud Foundry](http://cloudfoundry.org/index.html)


License
-------

[Apache v2.0](http://www.apache.org/licenses/LICENSE-2.0)

```
Copyright 2014 Steve Good

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```