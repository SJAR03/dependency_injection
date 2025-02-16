package com.sjar.dependencyinjection.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet() {
        return "Hello from the base service";
    }
}
