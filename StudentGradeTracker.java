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
    public static void main(String[] args) 
	{

	}
}