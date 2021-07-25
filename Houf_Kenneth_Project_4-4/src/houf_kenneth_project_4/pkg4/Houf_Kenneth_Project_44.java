/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_project_4.pkg4;

import java.util.Scanner;
/**
 *
 * @author somat
 */
public class Houf_Kenneth_Project_44 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
      // TODO code application logic here
      //subtract x repeatedly from y until y < x
      //swap the values of x and y
      // Repeat steps 1 and 2 until x = 0
      // y is the greatest common divisor of the two numbers
        
        Scanner sc = new Scanner(System.in);
        
        int x;
        int y;
        String choice = "y";
        
        String endMessage = "Continue? (y/n)";
        while(choice.equalsIgnoreCase("y"))
        {
            System.out.println("Please enter a number.");
        
            x = sc.nextInt();
        
            System.out.println("please enter another number.");
        
            y = sc.nextInt();
       
            while( y>0 )
            {
                int rem = x % y;
                x = y;
                y = rem;
            }
        
            System.out.println("Greatest common divisor: "+x);
        
            System.out.println("");
            System.out.println(endMessage);
            
            choice = sc.next();
        }
    }
    
}
