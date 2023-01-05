package com.co.ragazza.backend.ragazza.infrastructure.config.spring;

import com.co.ragazza.backend.ragazza.infrastructure.config.spring.RagazzaApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RagazzaApplication.class);
    }

}
