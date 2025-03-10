// Creating the Radius class to find area and circumference of circle with given radius
import java.util.Scanner;

class Computation{
      // declaring attributes
      private double radius;
      static double pi = 3.14;

      // Constructor
      public Computation(double radius){
         this.radius = radius;
      }

      // Calcuating area and circumference of circle
      public void compute(){
         
         System.out.println("Area of Circle is: " + (pi * radius * radius));
         System.out.println("Circumference of Circle is: "+ (2 * pi * radius));
      }
}

public class Radius{
   public static void main(String[] args){
       // scanner class to get input from's user
       Scanner scanner = new Scanner(System.in);

       System.out.print("Radius of circle: " );
       double radius = scanner.nextDouble();

       // Create computation objects
       Computation r1 = new Computation(radius);

        r1.compute();

       // closing the scanner 
       scanner.close();
}}


// Input:
// Radius of circle: 4

// Output:
// Area of Circle is: 50.24
// Circumference of Circle is: 25.12


