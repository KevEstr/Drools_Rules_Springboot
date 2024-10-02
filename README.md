# 💼 Loan Evaluation System with Business Rules (Drools)

## 📖 Project Description

This project is a credit application evaluation system 💳 that implements business rules using **Drools**, a rule engine based on **Java**. Through a set of predefined rules, various participant attributes such as credit score, income, debt, and marital status are evaluated to determine the approval or rejection of a loan, as well as the corresponding interest rate 📊.

The project is built using **Spring Boot** to facilitate the execution and scalability of the service. It includes an endpoint that receives participant information in JSON format to evaluate their loan application and return a result based on the implemented rules.

## 🛠️ Technologies Used

- **Java 11+**: Main programming language.
- **Spring Boot**: Framework for building microservices.
- **Drools**: Business rule engine for loan evaluation.
- **Postman**: Tool for testing REST service endpoints.
- **Maven**: Dependency management system.

## ⚙️ Business Rules

The system implements predefined business rules that evaluate criteria such as:

- Dependents
- Employment status
- Loan purpose
- Credit usage
- Marital status
- Existing debt
- Credit score

Based on these rules, a participant can either receive a **loan approval** or **rejection**, along with the corresponding interest rate.

## 🚀 How to Run the Project

### Prerequisites 📝
Make sure you have the following requirements installed on your system:

- **Java 11 or higher** ☕
- **Maven** 📦
- **IntelliJ IDEA** 💡 (with Spring Boot support)

### Execution Steps ⚡

1. **Clone the repository** 📂

   ```bash
   git clone https://github.com/KevEstr/Drools_Rules_Springboot.git

2. **🌐 API Endpoints**

The system exposes the following endpoint for loan evaluation:

**Evaluate Loan Application**

- **URL**: `/evaluar-prestamo`
- **Method**: `POST`
- **Description**: This endpoint evaluates a participant's loan application based on predefined business rules and returns the loan status (approved or rejected) and the corresponding interest rate.
  
- **Request Body Example** (JSON):

  ```json
  {
    "name": "John Doe",
    "age": 35,
    "creditScore": 680,
    "annualSalary": 55000,
    "existingDebt": 8000,
    "loanAmount": 15000,
    "employmentStatus": "Employed",
    "maritalStatus": "Married",
    "dependents": 2,
    "residentialStatus": "Homeowner",
    "loanPurpose": "home_improvement",
    "monthlyExpenses": 1200,
    "employmentDuration": 5,
    "creditUsage": 50,
    "usageDuration": 12
  }

### Important Files 📂
src/main/resources/rules/loan-rules.drl: Drools rule file.
src/main/java/com/udea/labFundamentos/controller/LoanController.java: REST controller that exposes the evaluation service.
src/main/java/com/udea/labFundamentos/model/Participant.java: Model representing the loan applicant.

### 📬 Testing with Postman
You can test different credit evaluation scenarios using Postman. Send different JSON payloads to see how the system applies business rules and returns the results.
