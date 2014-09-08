Email Service
=============

This is a micro-service designed to integrate with a message queue (rabbitmq) to coordinate sending and receiving email.  It uses an in-memory queue emails for sending and disposition (bounce, success, etc).  It is expected that this service will run in a CloudFoundry environment.

Status
------

[![Codeship Status for stevegood/blog](https://codeship.io/projects/201cae00-1931-0132-3deb-469181d2b293/status)](https://codeship.io/projects/34337)

Dependencies
------------

- [Spring Boot](http://projects.spring.io/spring-boot/)
- [AMQP](http://www.amqp.org/)
- [CloudFoundry](http://cloudfoundry.org/index.html)


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
