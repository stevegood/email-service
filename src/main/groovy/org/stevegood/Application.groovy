package org.stevegood

import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@EnableAutoConfiguration
@ComponentScan('org.stevegood')
class Application {
    static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args)
    }
}