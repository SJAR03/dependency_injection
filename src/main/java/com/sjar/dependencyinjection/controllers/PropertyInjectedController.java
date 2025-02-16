package com.sjar.dependencyinjection.controllers;

import com.sjar.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    GreetingService greetingService;

    public String sayHello() {
     return greetingService.greet();
    }

}
