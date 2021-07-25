
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_project_9.pkg2;

/**
 *
 * @author somat
 */
public class SavingsAccount extends Account 
{
    private double monthlyInterestRate;
    private double monthlyInterestPayment;
    
    public void savingsAccount(double rate)
    {
        monthlyInterestRate = rate/100;
    }
    
    public double interestPayment()
    {
       monthlyInterestPayment = getMonthlyInterestPayment();
        balance = balance + monthlyInterestPayment;
        
       return balance;
    }
    
    public double getMonthlyInterestPayment()
            {
                monthlyInterestPayment = balance *monthlyInterestRate;
                return monthlyInterestPayment;
            }
                    
}
