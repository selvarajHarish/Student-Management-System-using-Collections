# Student-Management-System-using-Collections

## Overview
The Student Management System is a Core Java project that manages student records using CRUD operations (Create, Read, Update, Delete). It uses ArrayList for data storage and applies the MVC (Model-View-Controller) pattern to separate concerns. The project supports adding students, viewing details, updating student information, updating placement status, and removing student records.

## Features
- Add new student records (Create)
- Display student details (Read)
- Update student phone number or placement status (Update)
- Remove student records (Delete)
- Simple console-based menu for easy interaction
- Uses Date to store the date of joining

## Technologies Used
- Java (Core Java)
- Java Collections (ArrayList)
- Scanner for user input
- MVC Pattern(Model,View,Controller)

## Steps to Implement
## 1.Create the Project Structure
- Package: collection.Students.com
* Classes:
- Student.java → Model class
- StudentController.java → Controller class
- StudentView.java → View class (main method)

 ## 2.Implement the Model Class (Student.java)
- Define student attributes like name, phone, email, gender, degree, stream, year of passing, CGPA, placement status, and date of joining.
- Provide getter, setter methods and override toString().

## 3.Implement the Controller Class (StudentController.java)
- Add student (addStudents())
- Display student (displayStudent())
- Update student (updateStudent())
- Remove student (removeStudent())
- Update placement status (updatePlacementStatus())
- Use ArrayList<Student> to manage student records.

## 4.Implement the View Class (StudentView.java)
- Provide a menu-driven interface using while loop and switch-case.
- Call controller methods based on user input.
  
## 5.Test the Application
- Add sample students.
- Display and check student details.
- Update and remove records.
- Verify correct behavior for valid and invalid inputs.  

## Note
- This project focuses on Core Java concepts only.
- It does not use any external database — all data is stored in-memory using ArrayList.

