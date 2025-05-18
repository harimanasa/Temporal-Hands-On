# Temporal Hello World

This project is a simple Java application that demonstrates the basic structure of a Java project using Maven. The application prints "Hello, World!" to the console.

## Project Structure

```
temporal-hello-world
├── src
│   ├── main
│   │   ├── java
│   │   │   └── HelloWorld.java
│   └── test
│       └── java
│           └── HelloWorldTest.java
├── pom.xml
└── README.md
```

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven

## Building the Project

To build the project, navigate to the project directory and run the following command:

```
mvn clean install
```

## Running the Application

After building the project, you can run the application using the following command:

```
mvn exec:java -Dexec.mainClass="HelloWorld"
```

## Running Tests

To run the unit tests, use the following command:

```
mvn test
```

## License & Copyrights

This project is created and owned by Manasa Hari.