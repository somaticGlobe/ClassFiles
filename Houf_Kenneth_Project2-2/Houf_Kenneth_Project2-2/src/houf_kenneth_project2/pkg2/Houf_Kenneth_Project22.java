/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_project2.pkg2;

/**
 *
 * @author somat
 */

import java.util.Scanner;

public class Houf_Kenneth_Project22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String welcome = "Welcome to the Letter Grade Converter";
        
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        
        String grade = "";
        while(choice.equalsIgnoreCase("y"))
        {
            System.out.println(welcome);
            
            System.out.println("Enter Numerical Grade: ");
            
            int testScore = sc.nextInt();
            
            if(testScore >= 88)
            {
                grade = "A";
            }
            else if(testScore < 88 && testScore >= 80)
            {
                grade = "B";
            }
             else if(testScore < 80 && testScore >= 67)
            {
                grade = "C";
            }
             else if(testScore < 67 && testScore >= 60)
            {
                grade = "D";
            }
             else if(testScore < 60)
            {
                grade = "F";
            }
            
            System.out.println("Letter Grade: "+ grade);
         
            System.out.println("Continue? (y/n)");
            
            choice = sc.next();
        }
        // TODO code application logic here
        
    }
    
}
