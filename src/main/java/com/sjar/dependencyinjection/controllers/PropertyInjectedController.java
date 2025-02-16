package com.sjar.dependencyinjection.controllers;

import com.sjar.dependencyinjection.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
     return greetingService.greet();
    }

}
