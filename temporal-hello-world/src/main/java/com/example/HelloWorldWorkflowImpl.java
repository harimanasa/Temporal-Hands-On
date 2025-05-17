package com.example;

public class HelloWorldWorkflowImpl implements HelloWorldWorkflow {
    @Override
    public String getGreeting(String name) {
        return "Hello, " + name + "!";
    }
}