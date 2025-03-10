// Creating the TrackInventory to display items details and total cost of all pieces
import java.util.Scanner;

class trackItems{

    // Fields(Attributes)
    private String itemCode;
    private String itemName;
    private int price;

    // Constructor
    public trackItems(String itemCode,String itemName, int price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
   }

   // Printing of items's details
   public void details(){
       System.out.println("The code of this item is: " + itemCode);
       System.out.println("The name of this item is: " + itemName);
       System.out.println("The price of this item is: " + price);
   }

    // printing total cost for given quantiry
    public void totalCost(int pieces){
        System.out.print("The total cost for " + pieces + " pieces is: " + (pieces * price));
    }
}



public class TrackInventory{
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         
         // Getting input from user
         String itemCode = scanner.nextLine();
         String itemName = scanner.nextLine();
         int price = scanner.nextInt();

         // Getting the number of pieces of item we bought
         int pieces = scanner.nextInt();

         // creating the object
         trackItems item1 = new trackItems(itemCode,itemName,price);
                
         // Calling function to display details
         item1.details();

          // function for calculaing total Cost of given quantity
          item1.totalCost(pieces);

         // Closing the scanner class  
         scanner.close();
}}


// Input:
// 34F3
// Toothpaste
// 32
// 4

// Output:
// The code of this item is: 34F3
// The name of this item is: Toothpaste
// The price of this item is: 32
// The total cost of 4 pieces is: 128
