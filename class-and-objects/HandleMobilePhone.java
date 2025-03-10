// Creating the HandleMobilePhone class to display mobile details
import java.util.Scanner;

class MobilePhone{

    // Fields(Attributes)
    private String brand;
    private String model;
    private int price;

    // Constructor
    public MobilePhone(String brand, String model, int price){
        this.brand = brand;
        this.model= model;
        this.price = price;
   }

  // displaying the mobile details
  public void display(){
      System.out.println("The brand of the mobile: " + brand);
      System.out.println("The model of the mobile: " + model);
      System.out.println("The price of this mobile is: " + price);
  }
}

public class HandleMobilePhone{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       // getting input from user
       String brand = scanner.nextLine();
       String model = scanner.nextLine();
       int price = scanner.nextInt();

       // Creating object for mobile
       MobilePhone mobile1 = new MobilePhone(brand, model, price);

      // call the function to display details
      mobile1.display();

      // Closing the scanner
      scanner.close();
}}

// Input: 
// Samsumg
// Samsumg Galaxy S23
// 40000

// Output:
// The brand of the mobile: Samsumg
// The model of the mobile: Samsumg Galaxy S23
// The price of this mobile is: 40000

