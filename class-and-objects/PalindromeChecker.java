// Creating the PalindromeChecker class to find that the string is palindrome or not
import java.util.Scanner;

class Palindrome {

   // Fields(Attributes)
   private String text;

   // Constructors
   public Palindrome(String text){
        this.text = text;
   }

   // Checking string is palindromic or not
   public boolean checking(){
         int start = 0;
         int end = text.length() - 1;

         while( start < end){
           if(text.charAt(start) != text.charAt(end)) return false;

            start++;
            end--;
         }

        return true;
   }
}


public class PalindromeChecker{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Get user's input

        String str = scanner.nextLine();  // Getting string from user


        // Creating object for checking
        Palindrome s1 = new Palindrome(str.toLowerCase());


        if(s1.checking()){
           System.out.print("This is a palindromic string");
        }
       else{
           System.out.print("This is not a palindromic string");
       }
       
       // Close the scanner
       scanner.close();
}
}

// Input:
// Madam

// Output:
// This is a palindromic string
