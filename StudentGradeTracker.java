import java.util.ArrayList;
import java.util.Scanner;

class Student 
{
    private String name;
    private double grade;
    
    public Student(String name, double grade) 
	{
        this.name = name;
        this.grade = grade;
    }
    
    public String getName() 
	{
        return name;
    }
    
    public double getGrade() 
	{
        return grade;
    }
    
    @Override
    public String toString() 
	{
        return String.format("%s: %.2f", name, grade);
    }
}

public class StudentGradeTracker 
{   
	private static void addStudent(Scanner scanner, ArrayList<Student> students) 
	{
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter student grade: ");
        double grade = scanner.nextDouble();
        scanner.nextLine();
        
        students.add(new Student(name, grade));
        System.out.println("Student added successfully!");
    }
	
	private static void displayStudents(ArrayList<Student> students)
	{
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
        
        System.out.println("\nStudent List:");
        System.out.println("-------------");
        for (Student student : students) {
            System.out.println(student);
        }
    }
	
	private static void calculateAverage(ArrayList<Student> students) 
	{
        if (students.isEmpty()) {
            System.out.println("No students to calculate average.");
            return;
        }
        
        double sum = 0;
        for (Student student : students) {
            sum += student.getGrade();
        }
        
        double average = sum / students.size();
        System.out.printf("Class average grade: %.2f\n", average);
    }
	
    public static void main(String[] args) 
	{

	}
}