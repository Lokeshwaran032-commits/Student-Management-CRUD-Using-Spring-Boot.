# 🚀 Spring Boot Student CRUD API

This is a simple **Spring Boot REST API** project that performs **CRUD operations** (Create, Read, Update, Delete) on Student data using **MySQL database**.

---

## 📌 Project Overview

This project demonstrates how to build a backend application using:
- Spring Boot
- Spring Data JPA
- MySQL database

It follows a clean **layered architecture**:
Controller → Service → Repository → Database

---

## ⚙️ Tech Stack

- Java ☕
- Spring Boot 🚀
- Spring Data JPA 🧠
- MySQL 🛢️
- Maven 📦

---

## 🧩 Features

✅ Add a student  
✅ Get all students  
✅ Get student by ID  
✅ Update student  
✅ Delete student  

---

## 🔄 API Endpoints

| Method | Endpoint | Description |
|--------|---------|-------------|
| POST | `/students` | Create a new student |
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get student by ID |
| PUT | `/students/{id}` | Update student |
| DELETE | `/students/{id}` | Delete student |

---

## 📸 Screenshots

1.Post Request:
<img width="1911" height="1003" alt="image" src="https://github.com/user-attachments/assets/537b9a4d-9bd1-4597-a3b3-924d0b4e815a" />



2.Get Request:
<img width="1908" height="994" alt="image" src="https://github.com/user-attachments/assets/5b973a9b-6b8b-4729-900c-89265f6990ac" />



3.Delete Request:
<img width="1917" height="1010" alt="image" src="https://github.com/user-attachments/assets/4b62975b-0ea5-4e87-b18b-ea72d8860be0" />



4.Database Table:
<img width="1625" height="1009" alt="image" src="https://github.com/user-attachments/assets/6ebe3a9a-a217-40cb-bfce-20ee3d150bd2" />





---

## 🛠️ How to Run the Project

### ✅ 1. Clone the repository


git clone https://github.com/Lokeshwaran032-commits/Student-Management-CRUD-Using-Spring-Boot./tree/main

---

### ✅ 2. Open in IDE

- IntelliJ / Eclipse / VS Code

---

### ✅ 3. Configure MySQL

Create database:


CREATE DATABASE student_db;

Update `application.properties`:


spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=Ls@7010421449

---

### ✅ 4. Run the application

Run:


SmSystemApplication.java

Server starts at:

http://localhost:8080

---

## 🧪 Testing the API

Use:
- Insomnia
- Postman
- Browser (GET APIs)

---

### ✅ Example Request

POST `/students`


{
"name": "Ram"
}

---

### ✅ Example Response


{
"id": 1,
"name": "Ram"
}

---

## 🧠 Key Concepts Learned

- REST API development with Spring Boot  
- JSON ↔ Java object conversion (Jackson)  
- Database integration using JPA  
- Dependency Injection  
- Layered Architecture  

---

## 🚀 Future Improvements

- Add validation (`@Valid`)  
- Add exception handling  
- Implement authentication (Spring Security)  
- Build frontend UI  

---

## 👨‍💻 Author

- Lokeshwaran P

---

## ⭐ Support

If you like this project, consider giving it a ⭐ on GitHub!
