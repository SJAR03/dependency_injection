package com.sjar.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet() {
        return "Hello from the base service";
    }
}
