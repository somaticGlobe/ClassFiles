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
public class Houf_Kenneth_Project_82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        String choice = "y";
        Scanner sc = new Scanner(System.in);
        
        String first;
        String last;
        String num;
        String ssn;
        
        
        String personChoice;
        
        while(choice.equalsIgnoreCase("y"))
        {
            boolean isValid = false;
            
            System.out.println("Welcome to the Person Manager");
            
            System.out.println();
            while(!isValid)
            {
               
                
                System.out.println("Create customer or employee (c/e)");
            
                personChoice = sc.next();
            
            
                // creates a customer if 'c' or "C" is entered
                if(personChoice.equalsIgnoreCase("c"))
                {
                    System.out.print("First Name: ");
                    first = sc.next();
                
                    System.out.print("Last Name: ");
                    last = sc.next();
                    
                    System.out.print("Customer Number: ");
                    num = sc.next();
                
                    Customer newPerson = new Customer(first, last, num);
                
                    System.out.println("You Entered a new Customer:");
                    System.out.println(newPerson.toString());
                    isValid = true;
                }
                else if(personChoice.equalsIgnoreCase("e"))
                {
               
                    System.out.print("First Name: ");
                    first = sc.next();
                
                    System.out.print("Last Name: ");
                    last = sc.next();
                
                    String prompt = "SSN: ";
                
                    // tests the input for SSN (requires an int)
                    int i = Console.getIntWithinRange(prompt,99999999, 1000000000);
                
                    //converts the int returned by getIntWithinRange to a string
                    ssn  = Integer.toString(i);
                    Employee newPerson = new Employee(first, last, ssn);
                
                    System.out.println("You entered a new employee: ");
                    System.out.println(newPerson.toString());
                    isValid = true;
                }
                else
                {
                    System.out.println("Error! Entry must be 'c' or 'e'.\n"
                                     + " Try again.");
                }  
            }
            System.out.println("Continue? (y/n)");
            choice = sc.next();
        }
    }
}
