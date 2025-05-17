package com.example;

import io.temporal.client.WorkflowClient;
import io.temporal.serviceclient.WorkflowServiceStubs;
import io.temporal.worker.Worker;
import io.temporal.worker.WorkerFactory;

public class HelloWorldWorker {
    public static void main(String[] args) {
        // Create a gRPC stubs wrapper that talks to the Temporal service.
        WorkflowServiceStubs service = WorkflowServiceStubs.newInstance();

        // Create a WorkflowClient to communicate with the Temporal service.
        WorkflowClient client = WorkflowClient.newInstance(service);

        // Create a WorkerFactory to manage workers.
        WorkerFactory factory = WorkerFactory.newInstance(client);

        // Create a Worker that listens on a specific task queue.
        Worker worker = factory.newWorker("HelloWorldTaskQueue");

        // Register the workflow implementation with the worker.
        worker.registerWorkflowImplementationTypes(HelloWorldWorkflowImpl.class);

        // Start the worker factory.
        factory.start();
        System.out.println("Worker started for task queue: HelloWorldTaskQueue");
    }
}