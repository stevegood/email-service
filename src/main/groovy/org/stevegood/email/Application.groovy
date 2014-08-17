package org.stevegood.email

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.data.redis.core.ValueOperations

@Configuration
@ComponentScan
@EnableAutoConfiguration
class Application implements CommandLineRunner {

    @Autowired
    EmailService emailService
    @Autowired
    private StringRedisTemplate template

    @Override
    public void run(String... args) {
        ValueOperations<String, String> ops = template.opsForValue()
        String key = 'spring.boot.redis.test'
        if (!template.hasKey(key)) {
            ops.set(key, 'foo')
        }
        println "Found key $key, value=${ops.get(key)}"
    }

    static void main(String[] args) {
        SpringApplication.run Application, args
    }
}
