// Creating a BookRecord class to display book's display
import java.util.Scanner;

class BookRecord {

     // Field(Attributes)
     private String title;
     private String author;
     private int price;

     // Constructor
     public BookRecord(String title,String author, int price){
         this.title = title;
         this.author = author;
         this.price = price;
     }

     // Displaying the result
     public void display(){
        System.out.println("The title of book is: " + title);
        System.out.println("The author of this book is: " + author);
        System.out.println("The price of this book is: " + price);

    }
}

public class BookDetails{
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Give book details
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();

        // Creating the book1 object
        BookRecord book1 = new BookRecord(title, author, price);

       // Calling the function to display book details
       book1.display();

       // closing the scanner 
       scanner.close();

}}

// Input:
// Godan
// Premchand Munshi
// 1000

// Output:
// The title of book is: Godan
// The author of this book is: Premchand Munshi
// The price of this book is: 1000
