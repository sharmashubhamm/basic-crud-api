# 🚀 Basic CRUD API

A simple REST API built using **Java** and **Spring Boot** that performs basic CRUD (Create, Read, Update and Delete) operations on user data.

This project uses **HashMap** as an in-memory storage instead of a database and demonstrates the fundamentals of REST API development using Spring Boot.

---

# 📌 Features

- Create User
- Get All Users
- Get User by ID
- Update User
- Delete User
- UUID-based User Identification
- Input Validation
- Global Exception Handling
- Proper HTTP Status Codes
- In-Memory Storage using HashMap

---

# 🛠️ Tech Stack

- Java 25
- Spring Boot 3.5.16
- Maven
- Spring Web
- Spring Validation
- HashMap (In-Memory Storage)

---

# 📂 Project Structure

```
src
├── main
│   ├── java
│   │   └── com
│   │       └── shubham
│   │           └── basiccrudapi
│   │               ├── controller
│   │               │      └── UserController.java
│   │               ├── service
│   │               │      └── UserService.java
│   │               ├── model
│   │               │      └── User.java
│   │               ├── exception
│   │               │      ├── ResourceNotFoundException.java
│   │               │      └── GlobalExceptionHandler.java
│   │               └── BasicCrudApiApplication.java
│   │
│   └── resources
│          └── application.properties
│
└── test
```

---

# 👤 User Model

| Field |  Type   |
|-------| ------  |
| id    |  UUID   |
| name  | String  |
| email | String  |
| age   | Integer |

---

# 📡 API Endpoints

|  Method  |   Endpoint     |  Description   |
| -------- |   ----------   |  ------------- |
|   POST   |   `/users`     |  Create User   |
|   GET    |   `/users`     |  Get All Users |
|   GET    |  `/users/{id}` |  Get User by ID|
|   PUT    |  `/users/{id}` |  Update User   |
|  DELETE  |  `/users/{id}` |  Delete User   |

---

# 📥 Sample Request

### POST /users

```json
{
  "name": "Shubham Sharma",
  "email": "shubham@gmail.com",
  "age": 22
}
```

---

# 📤 Sample Response

```json
{
  "id": "56298602-2a65-4e66-bbc2-f8d74b1fba83",
  "name": "Shubham Sharma",
  "email": "shubham@gmail.com",
  "age": 22
}
```

---

# ✅ Validation

The API validates incoming requests using Spring Validation.

- Name must not be blank
- Email must be a valid email address
- Age must be greater than 0

---

# ⚠️ Exception Handling

The project includes Global Exception Handling for invalid requests.

### 400 Bad Request

Returned when validation fails.

### 404 Not Found

Returned when a user with the given ID is not found.

---

# 📌 HTTP Status Codes

| Status Code | Description |
|-------------|-------------|
| 200 OK | Request Successful |
| 201 Created | User Created Successfully |
| 400 Bad Request | Validation Failed |
| 404 Not Found | User Not Found |

---

# ▶️ Running the Project

### 1. Clone the repository

```bash
git clone https://github.com/sharmashubhamm/basic-crud-api.git
```

### 2. Open the project

Open the project using **VS Code** or **IntelliJ IDEA**.

### 3. Run the application

Run:

```
BasicCrudApiApplication.java
```

The application starts on:

```
http://localhost:8080
```

---

# 🧪 API Testing

The API was tested using **Postman**.

---

# 📈 Future Enhancements

The following improvements can be added in future versions of this project:

- Replace HashMap with MySQL database.
- Integrate Spring Data JPA for database operations.
- Add Swagger/OpenAPI documentation for API testing.

---

# 👨‍💻 Author

**Shubham Sharma**

GitHub: https://github.com/sharmashubhamm

---

⭐ If you found this project useful, consider giving it a star.
