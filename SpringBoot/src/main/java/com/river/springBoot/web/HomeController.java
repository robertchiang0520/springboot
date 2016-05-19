package com.river.springBoot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller
@RestController
public class HomeController {

    @RequestMapping("/home") public String home() {
    	return "hello world";
    }
}
