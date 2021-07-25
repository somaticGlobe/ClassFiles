/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_project_8.pkg2;

/**
 *
 * @author somat
 */
public class Customer extends Person
{
    private String customerName;
    private String n ;
    
    public Customer(String first, String last, String number)
    {
        super(first, last);
        n = number;
        Person person = new Person(first, last);
        customerName = person.toString();
    }
    
    public String getCustomerNumber()
    {
       return n;  
    }
    
    public void setCustomerNumber(String number)
    {
        this.n = number;
    }
    
      @Override
       public String toString()
       {
           String customer = (customerName+"\n"
                           + "Customer Number: "+n);
           return customer;
       }
}
