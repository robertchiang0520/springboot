package com.river.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan
public class App {
    public static void main( String[] args ) throws Exception {
    	System.setProperty("spring.devtools.restart.enabled", "true"); // enable restart
        SpringApplication.run(App.class, args);
    }
    
    
    @RequestMapping("/") public String home() {
    	return "hello world";
    }
}
