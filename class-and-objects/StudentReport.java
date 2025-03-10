// Creating the StudentReport class to prepare student's report card
import java.util.Scanner;

class Student{
   // Fields(Attributes)
   private String name;
   private int rollNumber;
   private int marks;
   private char grade;

   // Constructor
   public Student(String name,int rollNumber,int marks){
       this.name = name;
       this.rollNumber = rollNumber;
       this.marks = marks;
   }

   // calculate grade
   public void calculateGrade(){
       if(marks >= 90) grade = 'A';
       else if (marks >= 80) grade = 'B';
       else if(marks >= 70) grade = 'C';
       else if(marks >= 60) grade = 'D';
       else grade = 'E';
   }

  // Displaying the student details and grade gained
  public void display(){
       System.out.println("Name of student: " + name);
       System.out.println("Roll Number: " + rollNumber);
       System.out.println("Marks: " + marks);
       System.out.println("Grade gain: " + grade);
  }
}

public class StudentReport{
      public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);

          // Getting input from user
          String name = scanner.nextLine();
          int rollNumber = scanner.nextInt();
          int marks = scanner.nextInt();

          // Creating object
          Student s1 = new Student(name, rollNumber, marks);

          // Call the function to calculate grade
          s1.calculateGrade();

          // Call the function to display student details 
          s1.display();

         // Closing the scanner
          scanner.close();

}}

// Input:
// Aaryan
// 23
// 98

// Output:
// Name of student: Aaryan
// Roll Number: 23
// Marks: 98
// Grade gain: A

