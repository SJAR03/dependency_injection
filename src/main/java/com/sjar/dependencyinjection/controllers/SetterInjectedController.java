package com.sjar.dependencyinjection.controllers;

import com.sjar.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Autowired
    public void GreetingService(GreetingService greetingService) {
        System.out.println("SetterInjectedController");
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.greet();
    }

}
