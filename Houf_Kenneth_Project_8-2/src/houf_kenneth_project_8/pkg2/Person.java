/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_project_8.pkg2;
import java.util.Scanner;
/**
 *
 * @author somat
 */
public class Person 
{
    private String f;
    private String l;
    private String person;
    
    private static Scanner sc = new Scanner(System.in);
    
    public Person(String first, String last)
    {
        f = first;
        l = last;
        
    }
    public String getFirstName()
    {
        return f;
    }
    
    public void setFirstName(String first)
    {
        this.f = first;
    }
    
    public String getLastName()
    {
        return l;
    }
    
    public void setLastName(String last)
    {
        this.l = last;
    }
    
     @Override
       public String toString()
       {
           person = ("Name: "+f+" "+l);
           return person;
       }
}
