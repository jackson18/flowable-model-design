package com.jackson.flowablemodeldesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude = {
        SecurityAutoConfiguration.class
})
@Import({ApplicationConfiguration.class})
public class FlowableModelDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowableModelDesignApplication.class, args);
        System.out.println("--> startup...");
    }

}
