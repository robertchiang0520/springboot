package com.river.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.river.springBoot")
@EnableAutoConfiguration
public class App {
    public static void main( String[] args ) throws Exception {
    	System.setProperty("spring.devtools.restart.enabled", "true"); // enable restart
        SpringApplication.run(App.class, args);
    }
    
}
