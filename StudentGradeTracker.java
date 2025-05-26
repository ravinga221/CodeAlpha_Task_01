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
	private static void findHighestGrade(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
        
        Student highest = students.get(0);
        for (Student student : students) {
            if (student.getGrade() > highest.getGrade()) {
                highest = student;
            }
        }
        
        System.out.println("Student with highest grade:");
        System.out.println(highest);
    }
    
    private static void findLowestGrade(ArrayList<Student> students) 
	{
        if (students.isEmpty()) 
		{
            System.out.println("No students in the system.");
            return;
        }
        
        Student lowest = students.get(0);
        for (Student student : students) 
		{
            if (student.getGrade() < lowest.getGrade()) 
			{
                lowest = student;
            }
        }
        
        System.out.println("Student with lowest grade:");
        System.out.println(lowest);
    }
	
    public static void main(String[] args) 
	{
			Scanner scanner = new Scanner(System.in);
			ArrayList<Student> students = new ArrayList<>();
			
			System.out.println("Student Grade Tracker");
			System.out.println("---------------------");
			
			while (true) 
			{
				System.out.println("\nMenu:");
				System.out.println("1. Add Student");
				System.out.println("2. View All Students");
				System.out.println("3. Calculate Class Average");
				System.out.println("4. Find Highest Grade");
				System.out.println("5. Find Lowest Grade");
				System.out.println("6. Exit");
				System.out.print("Enter your choice: ");
				
				int choice = scanner.nextInt();
				scanner.nextLine(); // consume newline
				
				switch (choice) 
				{
					case 1:
						addStudent(scanner, students);
						break;
					case 2:
						displayStudents(students);
						break;
					case 3:
						calculateAverage(students);
						break;
					case 4:
						findHighestGrade(students);
						break;
					case 5:
						findLowestGrade(students);
						break;
					case 6:
						System.out.println("Exiting program...");
						scanner.close();
						return;
					default:
						System.out.println("Invalid choice. Please try again.");
				}
			}
		}
	}