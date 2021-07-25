/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_22.pkg2;
import java.util.Scanner;

/**
 *
 * @author somat
 */
public class Console 
{
    private static Scanner sc = new Scanner(System.in);
    
    public static String getString(String prompt)
    {
        System.out.print(prompt);
        String s = sc.next();
        sc.nextLine();
        return s; 
    }
    
    public static int getInt(String prompt)
    {
        int i = 0; 
        boolean isValid = false;
        while(!isValid)
        {
            System.out.print(prompt);
            if(sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid integer. Try Again.");
            }
            sc.nextLine();
        }
        return i;
    }
    
    public static int getIntWithinRange(String prompt, int min, int max)
    {
        int i = 0;
        boolean isValid = false;
        while(!isValid)
        {
            i = getInt(prompt);
            if(i < min)
            {
                System.out.println("Error! Number must be greater than "+min); 
               
            }
            else if (i > max)
            {
               System.out.println("Error! NUmber must be less than "+max);
            }  
            else
            {
                isValid = true;
            }
        }
        return i;
    }
}
