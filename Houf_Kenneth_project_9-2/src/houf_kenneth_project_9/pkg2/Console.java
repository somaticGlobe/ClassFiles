/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_project_9.pkg2;

import java.util.Scanner;
/**
 *;
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
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid Integer. Try Again.");
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
            if(i <= min)
            {
                System.out.println("Error! number must be greater than "+min+".");
            }
            else if(i >= max)
            {
                System.out.println("Error! number must be less than "+max+".");
            }
            else 
            {
                isValid = true;
            }
        }
        return i;
    }
    
    public static double getDouble(String prompt)
    {
           double d = 0;
        boolean isValid = false;
        while(!isValid)
        {
            System.out.print(prompt);
            if(sc.hasNextDouble())
            {
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid number. Try Again.");
            }
            sc.nextLine();
        }
        return d;
    }
    
    public static double getDoubleWithinRange(String propmt, double min, double max)
    {
            double d = 0;
        boolean isValid = false;
        while(!isValid)
        {
            if(d <= min)
            {
                System.out.println("Error! number must be greater than "+min+".");
            }
            else if(d >= max)
            {
                System.out.println("Error! number must be less than "+max+".");
            }
            else 
            {
                isValid = true;
            }
        }
        return d;
    }
}
