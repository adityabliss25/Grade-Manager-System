#  Student Grade Management System Documentation

## 1. Project Overview and Objectives
The objective of this project was to move beyond simple variable storage and implement Control Flow and Arrays to manage a collection of academic data. This system allows a user to manage marks for multiple students across various subjects and generate analytical performance reports.

### Technical Requirements Met
* **Primitive Data Types:** Used `int`, `double`, and `String` to manage data effectively.
* **Control Flow:** Implemented `if-else` blocks and `switch` statements for decision-making logic.
* **Input/Output:** Utilized the `java.util.Scanner` class to capture real-time user input from the console.

---

## 2. Setup and Installation Instructions
1. **JDK Version:** Developed using JDK 11+.
2. **IDE:** Project can be opened in IntelliJ IDEA or Eclipse.
3. **Execution:** Run the `GradeManager.java` file. Enter data into the console when prompted by the program.

---

## 3. Code Structure Explanation
The program is structured within a single main class to demonstrate procedural logic within an Object-Oriented environment.

| Component | Responsibility |
| :--- | :--- |
| **Scanner Input** | Captures user data (e.g., Student Names, Marks, or Numbers). |
| **Logic Engine** | Processes the input (e.g., calculating averages or performing arithmetic). |
| **Output Formatter** | Displays the final result to the user in a clean, readable format. |

Grading Criteria
The system automatically assigns categories based on the calculated average:A: $\ge 90\%$ (Excellent)B: $80\% - 89\%$ (Very Good)C: $70\% - 79\%$ (Good)D: $60\% - 69\%$ (Satisfactory)F: $< 60\%$ (Fail)

---

## 4. Data Format Specification
For this basic implementation, data is handled in-memory during runtime.
* **Input Format:** Numerical values (0-100) and String identifiers.
* **Output Format:** Formatted strings printed to the console (e.g., "Final Grade: A").

---


## 5. Project Workflows
The program follows a linear execution path:
1. **Prompt:** The system asks the user for a specific input.
2. **Read:** The `Scanner` captures the keyboard input.
3. **Validate:** The program checks if the input is within valid ranges (e.g., marks between 0-100).
4. **Calculate:** Logic is applied to determine the outcome.
5. **Display:** The final result is printed to the console.

---

## 6. Screenshots & Diagrams

### Logic Flowchart/UML

![Logic Diagram](https://github.com/adityabliss25/Grade-Manager-System/blob/master/docs/images/UML%20Class%20Diagram%20-%20Grade%20Manager%20System.png)

### Console Execution
![Output](https://github.com/adityabliss25/Grade-Manager-System/blob/master/docs/images/Console%20Output.png)
