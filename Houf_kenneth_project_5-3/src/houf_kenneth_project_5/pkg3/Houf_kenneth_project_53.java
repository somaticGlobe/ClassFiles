/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /**
Specifications
If the user's guess is higher than the random number, the application should display, 
'Too high!'

If the user's guess is lower than the random number, the application should display, 
'Too low!'

If the user's guess is more than 10 higher or 10 lower than the random number, 
the application should display, 'Way too high!' or 'Way too low!'

The message that's displayed when the user gets the number should vary depending 
on the number of guesses. For example:

Number of guesses      Message
=================      =======
<=3                    Great work! You are a mathematical wizard.
>3 and <=7             Not too bad! You've got some potential.
>7                     What took you so long? Maybe you should take
                       some lessons.

When the user guesses a number, the application should only accept numbers from 
1 to 100.

When the user responds to the  Try Again?  prompt, the application should only 
 accept a value of  y  or  n .

If the user enters invalid data, the application should display an appropriate 
 error message and prompt the user again until the user enters valid data.

The code that's used to validate data should be stored in separate methods. For example:

public static double getDoubleWithinRange(Scanner sc, String prompt,
    double min, double max)

public static int getIntWithinRange(Scanner sc, String prompt,
    int min, int max)

The code that's used to run the application should also be stored in separate methods.

Use the random() method of the java.lang.Math class to generate a random number.
     */
package houf_kenneth_project_5.pkg3;
import java.util.Scanner;
/**
 *
 * @author somat
 */


public class Houf_kenneth_project_53 
{
    // verifies that the entry is the correct data type
    public static int getInt(Scanner sc, String prompt)
    {
        int d = 0;
        boolean isValid = false;
    
        while(!isValid)
        {
            System.out.println(prompt);
             if(sc.hasNextInt())
            {
                d = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid number. Try Again");
            }
            sc.nextLine();
        }
        return d;
    }
    
    // verifies that the entry is withjin the designated range
    public static int getIntWithinRange(Scanner sc, String prompt,int min, int max)
    {
        int d = 0;
        boolean isValid = false;
        
        while(!isValid)
        {
            d = getInt(sc, prompt);
            
            if(d < min)
            {
                System.out.println("Error! Number must be greater than "+ min +".");
            }
            else if(d > max)
            {
                System.out.println("Error! Number must be less than "+max+".");
            }
            else
            {
                isValid = true;
            }
        }
        return d;
    }
    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int guess = 0;
        String tryAgain = "y";
        Scanner sc = new Scanner(System.in);
        String prompt = "Enter a number.";
        
        while(tryAgain.equalsIgnoreCase("y"))
        {
            // set the "correct" answer between 1 and 100 
            double x = Math.random()*99 + 1;
            int answer = (int)x;
            
            System.out.println("Welcome to the Guess the Number Game."
                             + "+++++++++++++++++++++++++++++++++++++");
            
            System.out.println();
            System.out.println("I'm thinking of a number from 1 to 100\n"
                             + "Try to guess it.");
            
            System.out.println();
            
            guess = getIntWithinRange(sc, prompt, 1, 100);
            int counter = 0;
            
            while(guess != answer)
            {
              counter ++;
              
              int difference = Math.abs(answer - guess);
              
              // guess statements
              if(guess < answer && difference <= 10 )
              {
                  System.out.println("To Low!");
              }
              else if(guess > answer && difference <= 10)
              {
                  System.out.println("To high");
              }
              else if(guess < answer && difference > 10)
              {
                  System.out.println("Way too low");
              }
              else if(guess > answer && difference > 10)
              {
                  System.out.println("Way too high");
              }
               
              // collects new guess
               System.out.println();
               System.out.println("Enter number");
            
               guess = sc.nextInt();
            }
            String message = "";
            
            if(counter <= 3)
            {
                message = "Great work! you are a mathematical wizard.";
            }
            else if ( counter > 3 && counter <= 7)
            {
                message = "Not to bad, you've got some potential.";
            }
            else if(counter > 7)
            {
                message = "What took you so long? Maybe you should take\n" +
                          "some lessons.";
            }
            
            System.out.println("You go it in "+counter+" tries");
            System.out.println(message);
            
            System.out.println("Continue (y/n)");
            tryAgain = sc.next();
        }
        
        System.out.println("Bye - Come back soon");
    }
}
