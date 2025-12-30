---

# Teacher Management System – CRUD Operations

## Overview

The **Teacher Management System** is a Spring Boot–based web application designed to perform **CRUD (Create, Read, Update, Delete)** operations on teacher records.
This project demonstrates a clean implementation of **RESTful web services** using **Spring Boot**, **Spring Data JPA**, and **Hibernate**, following layered architecture and best practices.

The application is intended for learning and demonstration purposes, showcasing backend development concepts such as MVC architecture, dependency injection, REST APIs, and database connectivity.

---

## Features

* Create new teacher records
* Retrieve all teachers or a teacher by ID
* Update existing teacher information
* Delete teacher records
* RESTful API design using HTTP methods
* Layered architecture (Controller, Service, Repository)
* Database integration using JPA and Hibernate

---

## Technology Stack

* **Language:** Java
* **Framework:** Spring Boot
* **Architecture:** MVC (Model–View–Controller)
* **ORM:** Hibernate / Spring Data JPA
* **Database:** MySQL (can be replaced with H2)
* **Build Tool:** Maven
* **Server:** Embedded Apache Tomcat
* **IDE:** IntelliJ IDEA

---

## Project Structure

```
Teacher_Management_CRUD_Operations
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.teachermanagement
│   │   │       ├── controller
│   │   │       ├── service
│   │   │       ├── repository
│   │   │       ├── model
│   │   │       └── TeacherManagementApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   └── test
│
├── pom.xml
└── README.md
```

---

## Architecture Explanation

* **Controller Layer**
  Handles HTTP requests and maps them to service methods using REST controllers.

* **Service Layer**
  Contains business logic and acts as an intermediary between controllers and repositories.

* **Repository Layer**
  Interacts with the database using Spring Data JPA.

* **Model Layer**
  Defines entity classes mapped to database tables.

---

## REST API Endpoints

| HTTP Method | Endpoint         | Description            |
| ----------- | ---------------- | ---------------------- |
| POST        | `/teachers`      | Create a new teacher   |
| GET         | `/teachers`      | Get all teachers       |
| GET         | `/teachers/{id}` | Get teacher by ID      |
| PUT         | `/teachers/{id}` | Update teacher details |
| DELETE      | `/teachers/{id}` | Delete teacher         |

---

## Sample Request (POST)

```json
{
  "name": "John Doe",
  "subject": "Mathematics",
  "email": "john.doe@example.com"
}
```

---

## Configuration

### application.properties (Example)

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/teacher_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

server.port=8080
```

---

## How to Run the Project

### Prerequisites

* Java 17 or later
* Maven
* MySQL (optional if using H2)
* IntelliJ IDEA or any Java IDE

### Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/01-YATHARTH/Teacher_Management_CRUD_Operations.git
   ```

2. Open the project in IntelliJ IDEA.

3. Configure database credentials in `application.properties`.

4. Run the application:

   ```bash
   mvn spring-boot:run
   ```

5. Access APIs using:

   * Browser
   * Postman
   * Curl

Base URL:

```
http://localhost:8080
```

---

## Future Enhancements

* Add frontend using Thymeleaf or React
* Implement validation and exception handling
* Add authentication and authorization
* Pagination and sorting support
* Swagger API documentation

---

## Learning Outcomes

* Understanding Spring Boot project structure
* Building RESTful APIs
* Implementing CRUD operations
* Working with Spring Data JPA and Hibernate
* Applying MVC architecture
* Using Maven for dependency management

---

## Author

**Yatharth**

GitHub: [https://github.com/01-YATHARTH](https://github.com/01-YATHARTH)

---

## License

This project is created for educational purposes and is open for learning and reference.

---
