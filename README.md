# Project Management System

This is a simple Project Management System implemented using Java 17 and Spring Boot. 

It provides CRUD (Create, Read, Update, Delete) operations for managing projects.

## Project Setup

### Prerequisites
- Java 17 installed on your system
- Maven for dependency management
- Postman or similar tool for API testing

### Steps to Setup
1. Clone the repository to your local machine:

   git clone https://github.com/yamini20-01/ProjectManagement.git

2. Navigate to the project directory in IntelliJ IDEA projectmanagement:

   cd projectmanagement
   
3. Build the project using Maven:

   mvn clean install
   
4. Run the Application:

   The application will start on port 8080 by default.
   

### Project Structure

The project follows a typical Spring Boot application structure with the following packages:

com.sirma.projectmanagement.controller: Contains REST API controllers.

com.sirma.projectmanagement.entity: Contains entity classes representing the data model.

com.sirma.projectmanagement.repository: Contains Spring Data JPA repositories.

com.sirma.projectmanagement.service: Contains service classes for business logic.

### REST API Endpoints
The following REST API endpoints are available:

POST /projects: Create a new project.

GET /projects: Retrieve all projects.

GET /projects/{id}: Retrieve a project by ID.

PUT /projects/{id}: Update an existing project.

DELETE /projects/{id}: Delete a project by ID.

Refer to the API documentation or use tools like Postman for detailed usage instructions .


## Project Technologies and Tools

- **Java**: Programming language used for application development.
- 
- **Spring Boot**: Framework for building Java-based enterprise applications. It simplifies the development of stand-alone, production-grade Spring-based applications.
- 
- **Spring Data JPA**: Part of the larger Spring Data family, it provides an abstraction over data access technologies like JPA, allowing for easier database interaction.
- 
- **H2 Database**: An in-memory database used for data storage and management during development.
- 
- **Maven**: Build automation tool used for managing project dependencies and building the project.
- 
- **Postman**: API development environment used for testing RESTful APIs.
- 
- **JUnit 5**: Testing framework for unit testing Java applications.
- 
- **Mockito**: Mocking framework used for testing in Java applications.
- 
- **MockMvc**: Spring Framework's testing support for web applications, used for integration testing of Spring MVC controllers.
- 

## Project Dependencies

- **spring-boot-starter-data-jpa**: Starter for using Spring Data JPA with Hibernate.
- 
- **spring-boot-starter-web**: Starter for building web applications using Spring MVC.
- 
- **h2**: Dependency for the H2 in-memory database.
- 
- **lombok**: Library for reducing boilerplate code in Java applications, such as getter/setter methods, constructors, and more.
- 
- **spring-boot-starter-test**: Starter for testing Spring Boot applications, including support for JUnit and Mockito.
- 
- **jakarta.validation-api**: Jakarta Bean Validation API for data validation.
- 
- **junit-jupiter-api**: JUnit 5 API for unit testing.
- 
- **mockito-core**: Core Mockito library for mocking objects and behavior in tests.
- 
- **mockito-junit-jupiter**: Mockito extension for integration with JUnit 5.
- 
- **spring-boot-test-autoconfigure**: Auto-configuration support for Spring Boot tests.
- 
- **spring-test**: Spring Framework's testing support.
- 
- **junit**: JUnit library for unit testing.
- 

These technologies, tools, and dependencies contribute to the development, testing, and maintenance of the Spring Boot project, ensuring robustness, reliability, and ease of development.


### Testing
The application includes unit tests and integration tests to ensure the correctness of its functionalities. You can run the tests using Maven:

mvn test



###
This README.md file provides a brief overview of the project, setup instructions, project structure, REST API endpoints, testing instructions, contribution guidelines, and license information. You can customize it further based on your specific project requirements and additional information you want to include.

