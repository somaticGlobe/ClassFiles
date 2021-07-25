/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_project_3.pkg3;

/**
 *
 * @author somat
 */

import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;
    
public class Houf_kenneth_Project_33 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        String welcome = "Welcome to the Interest Calculator";
        
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        
        while(choice.equalsIgnoreCase("y"))
        {
            BigDecimal percentConverter = new BigDecimal(100);
            
            System.out.println("Enter loan amount: ");
            BigDecimal loan = new BigDecimal(sc.nextDouble());
            
            System.out.println("Enter interest rate: ");
            BigDecimal interestRate = new BigDecimal(sc.nextDouble());
            
            // rounds interest and calculates total
            BigDecimal interestRateBD = interestRate;
            
            BigDecimal loanBD = loan
                    .setScale(2, RoundingMode.HALF_UP);
            
            // calculates interest amount
            BigDecimal interest = loanBD.multiply(interestRateBD)
                    .setScale(2, RoundingMode.HALF_UP);
            
            //formats the interest rate and interest tot
            
            NumberFormat percent = NumberFormat.getPercentInstance();
            percent.setMaximumFractionDigits(3);
            String interestRateString = percent.format(interestRateBD);
            
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            
            String loanString = currency.format(loanBD);
            String interestString = currency.format(interest);
            
            
            System.out.println();
            
            // prints results
            System.out.println("Loan amount:  "+loanString+"\n"
                              +"InterestRate: "+interestRateString+"\n"
                              +"Interest:     "+interestString);
            System.out.println("Continue ? (y/n): ");
            
            choice = sc.next();
        }
    }
}
