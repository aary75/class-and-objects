import java.util.Scanner;

class BankAccount {
     
     Scanner scanner = new Scanner(System.in);

     private String accountHolder;
     private int accountNumber;
     private int balance;

     private int amountAfterDeposit;
     public int amountAfterWithDraw;

     public BankAccount(String accountHolder, int accountNumber, int balance){
          this.accountHolder = accountHolder;
          this.accountNumber = accountNumber;
          this.balance = balance;
     }

     public void depositMoney(){

            System.out.print("Amount deposit in account: ");
            int money = scanner.nextInt();
            balance += money;
     }

     public void withdraw(){

             System.out.print("Money withdram from account: ");
             int money = scanner.nextInt();

             if(money > balance) System.out.print("Insufficient amount. You cannot withdram money");
             else{

                balance -= money;
               }
     }

     public void currentbalance(){
           System.out.print("Remaining balance in account is: "+ balance);
      }
}

public class StimulateATM {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         
         System.out.print("Account's holder name: ");
         String accountHolder = scanner.nextLine();

         System.out.print("Account's number: ");
         int accountNumber = scanner.nextInt();
         
         System.out.print("Balance in bank account: ");
         int currentBalance = scanner.nextInt();

         BankAccount customer = new BankAccount(accountHolder, accountNumber, currentBalance);


         customer.depositMoney();

         customer.withdraw();

         customer.currentbalance();

         scanner.close();
}}

         

// Input:
// Account's holder name: Aaryan
// Account's number:456
// Balance in bank account: 45000
// Amount deposit in account: 23000
// Money withdram from account: 0

// Output:
// Remaining balance in account is: 68000
