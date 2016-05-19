package com.river.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class App {
    public static void main( String[] args ) throws Exception {
        SpringApplication.run(App.class, args);
    }
    
    
    @RequestMapping("/") public String home() {
    	return "hello world";
    }
}
