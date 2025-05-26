# CodeAlpha_Task_01

# Student Grade Tracker - README

## Overview
The Student Grade Tracker is a Java application that allows users to manage and analyze student grades. It provides functionality to add students, view all students, calculate class averages, and find highest/lowest grades.

## Features
- **Add Students**: Enter student names and grades
- **View All Students**: Display a list of all students with their grades
- **Calculate Class Average**: Compute the average grade of all students
- **Find Highest Grade**: Identify the student with the highest grade
- **Find Lowest Grade**: Identify the student with the lowest grade

## How to Use
1. Clone the repository to your local machine
2. Compile the Java files: `javac StudentGradeTracker.java`
3. Run the program: `java StudentGradeTracker`
4. Follow the on-screen menu to perform various operations

## Menu Options
1. **Add Student**: Enter student name and grade
2. **View All Students**: See a list of all registered students
3. **Calculate Class Average**: View the average grade of the class
4. **Find Highest Grade**: See which student has the highest grade
5. **Find Lowest Grade**: See which student has the lowest grade
6. **Exit**: Quit the program

## GitHub Upload Instructions
1. Create a new repository on GitHub
2. Initialize a local git repository in your project folder:
   ```
   git init
   ```
3. Add all files to the repository:
   ```
   git add .
   ```
4. Commit the files:
   ```
   git commit -m "Initial commit of Student Grade Tracker"
   ```
5. Set the remote origin to your GitHub repository:
   ```
   git remote add origin [https://github.com/ravinga221/CodeAlpha_Task_01]
   ```
6. Push the files to GitHub:
   ```
   git push -u origin master
   ```

## File Structure
```
StudentGradeTracker/
├── StudentGradeTracker.java  # Main application file
├── README.md                 # This documentation file
```

## Requirements
- Java JDK 8 or later
- Git (for version control)

## Notes
- All student data is stored in memory and will be lost when the program exits
- Grades are stored as double values for precision
- The program includes input validation to prevent errors

## Example Usage
```
Student Grade Tracker
---------------------

Menu:
1. Add Student
2. View All Students
3. Calculate Class Average
4. Find Highest Grade
5. Find Lowest Grade
6. Exit
Enter your choice: 1
Enter student name: John Doe
Enter student grade: 85.5
Student added successfully!
```

## License
This project is open-source and available for anyone to use or modify.
