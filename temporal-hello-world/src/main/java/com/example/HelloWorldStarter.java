package com.example;

import io.temporal.client.WorkflowClient;
import io.temporal.client.WorkflowOptions;
import io.temporal.serviceclient.WorkflowServiceStubs;


public class HelloWorldStarter {
    public static void main(String[] args) {
        WorkflowServiceStubs service = WorkflowServiceStubs.newInstance();
        WorkflowClient client = WorkflowClient.newInstance(service);
        HelloWorldWorkflow workflow = client.newWorkflowStub(
            HelloWorldWorkflow.class,
            WorkflowOptions.newBuilder()
                .setTaskQueue("HelloWorldTaskQueue")
                .build()
        );

        String greeting = workflow.getGreeting("Temporal");
        System.out.println(greeting);
    }
}