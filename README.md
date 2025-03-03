# FamilyFinance

A comprehensive web application built using **Java**, **Spring Boot**, **SQL**, and **Hibernate** for managing personal and family finances. The FamilyFinance application allows users to track their income, expenses, set financial goals, and generate reports to analyze their financial health.

## Features

- **User Authentication**: Secure login and registration functionality with user roles and permissions.
- **Income & Expense Management**: Track income and expenses with categories, dates, and amounts.
- **Financial Goal Setting**: Set and track progress toward financial goals like saving for a vacation or paying off debt.
- **Reports & Analytics**: Generate reports that provide insights into financial trends and patterns.
- **Database Management**: Persistent storage using SQL and Hibernate for ORM.

## Tech Stack

- **Java 11** (or higher)
- **Spring Boot** for the backend framework
- **Hibernate** for ORM (Object-Relational Mapping)
- **MySQL** or **PostgreSQL** as the relational database
- **Thymeleaf** for server-side rendering of HTML templates
- **Spring Security** for authentication and authorization
- **Maven** for build automation
- **RESTful APIs** for data exchange

## Prerequisites

To run this project locally, ensure you have the following installed:

- **Java 11+**
- **Maven** for managing dependencies and building the project
- **MySQL** database installed and running
- **IDE** like IntelliJ IDEA or Eclipse (optional but recommended)

## Setup Instructions

1. **Clone the repository**:
   bash
   git clone https://github.com/yourusername/FamilyFinance.git
   cd FamilyFinance


## Configure the database(Application.properties)

spring.datasource.url=jdbc:mysql://localhost:3306/familyfinance
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update

## Build and Run the Application

mvn spring-boot:run

## Access the application: Open your browser and navigate to http://localhost:8080 to access the FamilyFinance application.

## Endpoints

POST /api/register: Register a new user
POST /api/login: Authenticate a user
GET /api/transactions: Get a list of income/expense transactions
POST /api/transactions: Add a new income/expense transaction
GET /api/goals: Get financial goals
POST /api/goals: Set a new financial goal

## Contributing

Contributions are welcome! If you find any issues or want to add new features, feel free to create an issue or submit a pull request.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgements
Spring Boot
Hibernate ORM
MySQL
PostgreSQL
Thymeleaf
