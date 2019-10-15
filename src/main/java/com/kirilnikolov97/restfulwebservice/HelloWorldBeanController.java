package com.kirilnikolov97.restfulwebservice;

public class HelloWorldBeanController {

    private String message;

    public HelloWorldBeanController(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
