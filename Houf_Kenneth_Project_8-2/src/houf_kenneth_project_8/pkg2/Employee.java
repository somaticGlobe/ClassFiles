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
public class Employee extends Person 
{
    private String social;
    private String employeeName;
    private String part3;
    
    public Employee(String first, String last, String ssn)
    {
        super(first, last);
        Person person = new Person(first, last);
        employeeName = person.toString();
        
        social = ssn;
        part3 = social.substring(5);
    }
    
    public String getSsn()
    {
     return social;
    }
    
    public void setSsn(String ssn)
    {
        this.social = ssn;
    }
    
    @Override
       public String toString()
       {
           String customer = (employeeName+"\n"
                           + "SSN: xxx-xx-"+part3);
           return customer;
       }
       
    
}
