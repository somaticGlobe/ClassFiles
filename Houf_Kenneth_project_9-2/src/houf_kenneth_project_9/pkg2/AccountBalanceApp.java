/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_project_9.pkg2;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author somat
 */
public class AccountBalanceApp 
{
    private String sBalanceDisplay;
    private String cBalanceDisplay;
    Scanner sc = new Scanner(System.in);
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    CheckingAccount ca = new CheckingAccount();
    SavingsAccount sa = new SavingsAccount();
    
    public void accountBalanceApp()
    {      
        sa.Account();
        ca.Account();
        // get choices from user (checking / savings) and (deposit/ Withdrawl)
        // if deposit: deposit method( and apply 
        // if withdrawl: 
        
        String continueChoice = "y";
        
        while(continueChoice.equalsIgnoreCase("y"))
        {
            String choice;
            System.out.print("Withdrawl or deposit? (w/d): ");
            choice = sc.next();
            sc.nextLine();

            //validates user input and runs appropriate withdraw/deposit method 
            // from the appropriate account
            boolean isValid = false;
            while(!isValid)
            {
                if(choice.equalsIgnoreCase("w"))
                {  
                    double d;
                    boolean isValid1 = false;

                    while(!isValid1)
                    {
                        String nextChoice;
                        System.out.print("Cheking or Savings? (c/s): ");
                        nextChoice = sc.next();
                        sc.nextLine();
                        if(nextChoice.equalsIgnoreCase("c"))
                        {
                          d = Console.getDoubleWithinRange("Amount?: ", 0, ca.balance);
                          
                          ca.withdraw(d);

                          isValid1 = true;

                        }
                        else if(nextChoice.equalsIgnoreCase("s"))
                        {
                           d = Console.getDoubleWithinRange("Amount?: ", 0,sa.balance);
                           sa.withdraw(d);

                           isValid1 = true;
                        }
                        else
                        {
                            System.out.println("Please enter either c for checking or s for savings.");
                        }
                    }
                    isValid = true;
                }
                else if(choice.equalsIgnoreCase("d"))
                {
                    double d;
                    boolean isValid1 = false;

                    while(!isValid1)
                    {
                        String nextChoice;
                        System.out.print("Cheking or Savings? (c/s): ");
                        nextChoice = sc.next();
                        sc.nextLine();
                        if(nextChoice.equalsIgnoreCase("c"))
                        {
                          d = Console.getDouble("Amount?: ");
                          ca.deposit(d);

                          isValid1 = true;

                        }
                        else if(nextChoice.equalsIgnoreCase("s"))
                        {
                           d = Console.getDouble("Amount?: ");
                           sa.deposit(d);

                           isValid1 = true;
                        }
                        else
                        {
                            System.out.println("Please enter either c for checking or s for savings.");
                        }
                    }
                    isValid = true;
                }
                else
                {
                    System.out.println("Please enter either w for withdrawl or d for deposit");
                }  
            }
            System.out.print("Continue? (y/n): ");
            continueChoice = sc.next();
            if(!continueChoice.equalsIgnoreCase("y")&& !continueChoice.equalsIgnoreCase("n"))
            {
                System.out.println("Please enter either y to continue or n to end");
            }
        }
    }
    
    // applies monthly fees
   public void fees(CheckingAccount ca)
   {
       Double fee = Console.getDoubleWithinRange("Checking fee: ", 0, ca.balance);
       ca.checkingAccount(fee);// sets ca.monthlyFee to the arguement
       ca.applyFee();
   }
   
   //applies interest rate
   public void interest(SavingsAccount sa)
   {
       Double interestRate = Console.getDouble("Savings interest payment: ");
       sa.savingsAccount(interestRate);
       sa.balance = sa.interestPayment();
   }
   
    //gets and sets for the different balance values
    public void setCBalanceDisplay(Account a)
    {
        this.cBalanceDisplay = currency.format(a.balance);   
    }
    
      public void setSBalanceDisplay(Account a)
    {
        this.sBalanceDisplay = currency.format(a.balance);
    } 
      
    public String getSBalanceDisplay()
    {
        return sBalanceDisplay;
    }
    
    public String getCBalanceDisplay()
    {
        return cBalanceDisplay;
    }
    
      public void paymentsAndFees(CheckingAccount ca, SavingsAccount sa)
        {
            System.out.println("Monthly Payments and Fees");
            fees(ca);
            System.out.println();
            interest(sa);

            System.out.println("Final Balances");
            System.out.println("Checking: "+ca.balance);
            System.out.println("Savings: "+sa.balance);
        }
}
