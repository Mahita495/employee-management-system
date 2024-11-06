Employee Management System is a Spring Boot React Full Stack Application consists of 2 sections. Employee Management and Department Management.  

Requirements:  

-> Build CRUD REST API's for Employee Management Module  
-> Build Frontend React App for Employee Management Module  
-> Build CRUD REST API's for Department Management Module  
-> Build Frontend React App for Department Management Module  

Spring Boot React Full Stack Architecture:  
It consists of 

->SpringBoot Backend App- Spring Boot exposes REST API's  

    1. Spring rest controller - Spring RestController takes care of mapping request data to the defined request handler method. Once response body is generated from the handler method, it converts it to JSON or XML response.  
    2. Presentation/Controller Layer - Handles user requests and gives response back to client, has MVC spring controllers  
    3. Service layer - Consists of businsess logic of application, has all classes and interfaces related to this logic  
    4. DAO Layer - connected to database, responsible to talk to datatbase. Contains all spring data JPA's  
    
->React Frontend App - React consumes REST API's

    1. Router  
    2. Components  
    3. Services  
    4. Axios Http Library - 3rd party http library to make rest api calls
    Router, component and service layer are interconnected to each other  

Both modules are loosely coupled (independent of each other)  


Tech Stack used:  
1. Spring Boot  - Spring Boot provides a simplified approach to developing Java applications by leveraging the Spring framework. It also includes built-in autoconfiguration capabilities that initialize applications with pre-set dependencies to help avoid errors. Used to develop restful api's.  Spring initializer is a web tool used to create spring boot application with required dependencies.  
2. Spring Data JPA Hibernate  - JPA(Java persistance api) is a standard way of interacting with daatabases in java. Provides object relational mapping (ORM) allows to map java objects to DB tables. Spring Data Jpa is a module in spring framework that spimplifies working with jpa. Hibernate is populat implementation of JPA. Open source framework orm implements jpa interfaces and provides additional features beyond jpa standard.  Spring data jpa builds in top of hibernate provides high level abstraction. Renders boilerplate code required for data access. Provides features like repository interfaces, query methods, transaction management.  
3. My SQL Database
4. IntelliJ IDEA  
5. Maven  
6. Postman Client  
7. React JS  
8. Vite JS  
9. Bootstrap CSS  
10. JavaScript  
11. NPM-  a library and registry for JavaScript software packages  
12. VS Code  
13. Axios



