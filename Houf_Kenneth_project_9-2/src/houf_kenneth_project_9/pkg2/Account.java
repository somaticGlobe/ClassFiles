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
public class Account implements Balanceable,Depositable,Withdrawable
{
    double balance;
    
    public void Account()
    {
        balance = 1000.00;
    }
    
    @Override
    public double getBalance()
    {
        return balance;
    }
    
    @Override
    public void setBalance(double amount)
    {
        this.balance = amount;
    }
    
    @Override
    public void deposit(double amount)
    {   
        balance = balance + amount;
    }
    
    @Override
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
}
