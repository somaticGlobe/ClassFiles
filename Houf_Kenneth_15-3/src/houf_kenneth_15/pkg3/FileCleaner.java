/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_15.pkg3;

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author somat
 */
public class FileCleaner 
{
    public static void main(String[] args)throws IOException
    {
      Scanner sc;
      String data;
      
      sc = new Scanner(new File(
              "This PC/Documents/CS2410-A1/Assignments/Assignment files/Module 6/Houf_Kenneth_15-3/prospects.csv"));
      
      while(sc.hasNextLine())
      {
          String str = sc.nextLine();
          data = parseData(str);
          writeToCSV(data);
      }
      sc.close();
    }
    
    private static void writeToCSV(String data) throws FileNotFoundException, IOException
    {
        FileWriter fileWriter = 
                new FileWriter("This PC/Documents/CS2410-A1/Assignments/Assignment files/Module 6/Houf_Kenneth_15-3/prospects_clean.csv", true);
        
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.write(data);
        printWriter.close();
    }
    
    private static String parseData(String str) throws FileNotFoundException
    {
        String firstName;
        String lastName;
        String email;
        String data = "";
        
        StringBuilder stringBuilder = new StringBuilder();
        
        Scanner lineScanner = new Scanner(str);
        lineScanner.useDelimiter(", ");
        
        while(lineScanner.hasNext())
        {
            firstName = lineScanner.next().replaceAll("\\s+", "");
            lastName = lineScanner.next().replaceAll("\\s+", "");
            email = lineScanner.next().replaceAll("\\s+", "");
            
            firstName = firstName.substring(0, 1).toUpperCase() 
                    + firstName.substring(1).toLowerCase();
            lastName = lastName.substring(0,1).toUpperCase()
                    + lastName.substring(1).toLowerCase();
            email = email.toLowerCase();
            
           data = data + firstName + ", " + lastName + ", " + email + "\r\n";
           
           System.out.println(""+firstName + " "+lastName+" "+email);
        }
        
        lineScanner.close();
        return data;
    }
}

