# Project Management System

This is a simple Project Management System implemented using Java 17 and Spring Boot. It provides CRUD (Create, Read, Update, Delete) operations for managing projects.

## Project Setup

### Prerequisites
- Java 17 installed on your system
- Maven for dependency management
- Postman or similar tool for API testing

### Steps to Setup
1. Clone the repository to your local machine:
   git clone https://github.com/yamini20-01/ProjectManagement.git

2. Navigate to the project directory in IntelliJ IDEA projectmanagement
   cd projectmanagement
3. Build the project using Maven:
   mvn clean install
4. Run the Application 
   The application will start on port 8080 by default.

### Project Structure
The project follows a typical Spring Boot application structure with the following packages:

com.example.projectmanagement.controllers: Contains REST API controllers.
com.example.projectmanagement.models: Contains entity classes representing the data model.
com.example.projectmanagement.repositories: Contains Spring Data JPA repositories.
com.example.projectmanagement.services: Contains service classes for business logic.

### REST API Endpoints
The following REST API endpoints are available:

POST /projects: Create a new project.
GET /projects: Retrieve all projects.
GET /projects/{id}: Retrieve a project by ID.
PUT /projects/{id}: Update an existing project.
DELETE /projects/{id}: Delete a project by ID.
Refer to the API documentation or use tools like Postman for detailed usage instructions .

### Testing
The application includes unit tests and integration tests to ensure the correctness of its functionalities. You can run the tests using Maven:
  mvn test

###
This README.md file provides a brief overview of the project, setup instructions, project structure, REST API endpoints, testing instructions, contribution guidelines, and license information. You can customize it further based on your specific project requirements and additional information you want to include.

