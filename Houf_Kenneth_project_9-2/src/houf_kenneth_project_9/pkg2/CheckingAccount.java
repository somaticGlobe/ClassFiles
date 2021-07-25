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
public class CheckingAccount extends Account 
{
    private double monthlyFee;
    
    public void checkingAccount(double value)
    {
        monthlyFee = value;
    }
    
    public void applyFee()
    {
        withdraw(monthlyFee);   
    }
    
    public double getMonthlyFee()
    {
        return monthlyFee;
    }
}
