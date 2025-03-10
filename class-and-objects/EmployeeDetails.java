// Creating the EmployeeDetails to get record of an employee
import java.util.Scanner;

// Creating the EmployeeRecord class to get and display of record of employee's data
class EmployeeRecord {

   // Creating variables for data
   private String name;
   private int id;
   private int salary;

   //Constuctor
   public EmployeeRecord(String name,int id,int salary){
       this.name = name;
       this.id = id;
       this.salary = salary;
  }

   // Method to display employee details
   public void displayDetails(){
       System.out.println("Name of employee: " + name);
       System.out.println("Id of employee: " + id);
       System.out.print("Salary of employee: " + salary);
   }}


public class EmployeeDetails{
  public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       // Getting details of employee
       String name = scanner.next();
       int id = scanner.nextInt();
       int salary = scanner.nextInt();

       // Create EmployeeRecod class
       EmployeeRecord e1 = new EmployeeRecord(name,id,salary);

       // Display the details of employee
       System.out.println("Details of employee is: ");

         e1.displayDetails();

         // Closing the scanner.class
         scanner.close();

    }
}

// Input:
// Aaryan
// 23
// 100000

// Output:
// Details of employee is:
// Name of employee: Aaryan
// Id of employee: 23
// Salary of employee: 100000
