package com.kirilnikolov97.restfulwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello world!";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBeanController helloWorldBean() {
        return new HelloWorldBeanController("Hello from bean!");
    }

}
