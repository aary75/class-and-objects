// Creating the class AssignMovieTicekt to assign the movie tickets to the audience
import java.util.Scanner;

class MovieTicket{
   
   // Fields(Attributes)
   private String movieName;
   private String seatNumber;
   private int price;
   private String[][] assignedTicket = new String[100][1];
  
  // Constructor
  public MovieTicket(String movieName, String seatNumber, int price){
         this.movieName = movieName;
         this.seatNumber = seatNumber;
         this.price = price;
  }

 // Assigning ticket to audience
  public void assignTicket(String name, String[] booked,int index){
      
             assignedTicket[index][0] = name;
             System.out.println("This seat with number " + seatNumber + " is assigning to " + name);
            
}
  // Displaying the ticket details
  public void display(){
          System.out.println("Movie Name: " + movieName);
          System.out.println("SeatNumber: " + seatNumber);
          System.out.println("Price: " + price);
}
}

public class AssignMovieTicket{
     public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
         
         // noOfPersons to find total number of audience have
         int noOfPersons = scanner.nextInt();
         scanner.nextLine();
         
         int index = 0;

         // Array to find which seat is booked or not
         String[] booked = new String[100];

         while(noOfPersons > 0){
         String movieName = scanner.nextLine();
         String seatNumber = scanner.nextLine();
         int price = scanner.nextInt();

          scanner.nextLine();
         String name1 = scanner.nextLine();

         // Creating object
         MovieTicket movie1 = new MovieTicket(movieName,seatNumber,price);
         
       
         int count = 0;
          
         // assign seatNumber to booked category
         for(int i = 0;i<index;i++){
              if(seatNumber.equals(booked[i])) count++;
         }

          booked[index] = seatNumber;

         // Checking seat is already is present or not
        if(count > 0) System.out.print("This seat is already booked"); 
        else{
           movie1.assignTicket(name1,booked,index);
           movie1.display();
        }

         index++;
         noOfPersons--;
}
        // closing the scanner
        scanner.close();
}
}


// Input:
// 2
// Hero
// R23
// 200
// Kedarnath
//  Output:
// This seat with number R23 is assigning to Kedarnath
// Movie Name: Hero
// SeatNumber: R23
// Price: 200

// Input:
// Bhola
// R23
// 200
// Shiv
// Output:
// This seat is already booked
