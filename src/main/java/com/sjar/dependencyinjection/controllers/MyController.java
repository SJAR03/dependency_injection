package com.sjar.dependencyinjection.controllers;

import com.sjar.dependencyinjection.services.GreetingService;
import com.sjar.dependencyinjection.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }


    public String sayHello() {
        System.out.println("I am in the controller");

        return greetingService.greet();
    }

}
