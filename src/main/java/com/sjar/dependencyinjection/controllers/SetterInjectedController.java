package com.sjar.dependencyinjection.controllers;

import com.sjar.dependencyinjection.services.GreetingService;
import com.sjar.dependencyinjection.services.GreetingServiceImpl;

public class SetterInjectedController {

    private GreetingService greetingService;

    public void GreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.greet();
    }

}
