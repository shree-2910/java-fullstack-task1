# Task 2 - Contact Form with MySQL Integration (Spring Boot)

## 📌 Project Overview
This project is a simple Contact Form application built using Spring Boot.  
It allows users to submit their name, email, and message, which are stored in a MySQL database using Spring Data JPA.

---

## 🚀 Features
- Contact Form (Name, Email, Message)
- Spring Boot Backend
- MySQL Database Integration
- Spring Data JPA for database operations
- Stores form data in `contacts` table
- Endpoint to view all stored contacts

---

## 🛠️ Technologies Used
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- HTML / CSS
- Maven

---

## 🗄️ Database Configuration

Update your `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/contactdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
