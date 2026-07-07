Employee-Management-API

A RESTful Employee Management API built with Spring Boot that demonstrates CRUD operations following industry-standard layered architecture. The project uses DTOs for clean data transfer, request validation for data integrity, and MySQL for persistent storage.

Features

- Create a new employee
- Retrieve all employees
- Retrieve an employee by ID
- Update an employee using PUT
- Partially update an employee using PATCH
- Delete an employee
- Request validation using Jakarta Validation
- DTO-based request and response handling
- Layered architecture (Controller → Service → Repository)

Tech Stack

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Lombok
- ModelMapper
- Spring Boot Validation
- Spring Boot DevTools

Project Structure

src
├── controller
├── dto
├── entity
├── repository
├── service
└── config

API Endpoints

Method| Endpoint| Description
POST| "/employees"| Create a new employee
GET| "/employees"| Get all employees
GET| "/employees/{id}"| Get employee by ID
PUT| "/employees/{id}"| Replace an existing employee
PATCH| "/employees/{id}"| Partially update an employee
DELETE| "/employees/{id}"| Delete an employee
