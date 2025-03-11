//Creating the CartItem class to add and remove items from cart
import java.util.Scanner;

 class Items{
     
     // Fields(Attributes)
     private String itemName;
     private int price;
     private int quantity;

     // constructor
     public Items(String itemName, int price,int quantity){
       this.itemName = itemName;
       this.price = price;
       this.quantity = quantity;
    }

     // Adding the items into cart
     public void add(int[][] cart,int price, int quantity,int number){
        cart[number][1] = price;
        cart[number][2] = quantity;

    }

    // Removing the items from cart
    public void remove(int[][] cart,String[] itemName,String nameToRemove){
          
         for(int i = 0; i< itemName.length; i++){
              if(itemName[i] != null && itemName[i].equals(nameToRemove)){
                  cart[i][2] = 0;
                  break;
              }
        }

}       
}
public class CartItem{
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // scanner class to get input from user

        String[] itemName = new String[100]; // Array to add item's names

        int[][] cart = new int[100][3]; // Array to add price and quantity of items

        int numberOfItems = scanner.nextInt();
        scanner.nextLine();        
        int number = 0;
        int totalCost = 0;

        while(numberOfItems > 0){
           // Details of items
           String name = scanner.nextLine();
           int price = scanner.nextInt();
           int quantity = scanner.nextInt();

           // Creating object for items
           Items item1 = new Items(name, price, quantity);

           itemName[number++] = name;

            // Adding items in cart
            item1.add(cart,price,quantity,number - 1);
           
            scanner.nextLine();

            // Asking we want to remove any item or not
            System.out.println("Do you want to remove an item? (yes/no)");

        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter item name to remove:");
            String nameToRemove = scanner.nextLine();
            
             // removing the item
            item1.remove(cart, itemName, nameToRemove);
        }
         System.out.println(); 
          numberOfItems--;
}

        // Calculating and printing the totalCost after adding and removing the elements from cart
       for(int i = 0; i<number;i++){
             totalCost += cart[i][1] * cart[i][2];
          }

       System.out.print("Total cost is: " + totalCost);
}
}


// Input:
// Number of items: 2

// Itemname: oil
// Price: 20
// Quantity: 3
// Do you want to remove an item? (yes/no)
// yes
// Enter item name to remove:
// none

// Itemname: soap
// Price: 40
// Quantity: 3
// Do you want to remove an item? (yes/no)
// yes
// Enter item name to remove:
// oil

// Output:
// Total cost is: 120
