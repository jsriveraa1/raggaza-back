package com.co.ragazza.backend.ragazza.infrastructure.config.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.co.ragazza.backend.ragazza.infrastructure")
@EntityScan(basePackages = "com.co.ragazza.backend.domain")
public class RagazzaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RagazzaApplication.class, args);
    }

}
