/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_project_23.pkg2;

import java.util.ArrayList;

/**
 *
 * @author somat
 */
public class Houf_Kenneth_Project_232 
{
    static boolean raceFinished = false;
    static int winCountT = 0;
    static int winCountH = 0;
    /**
     * @param args the command line arguments
     */
        
    static RunnerThread tortise = new RunnerThread("Tortise", 10, 0); // TODO code application logic here
    static RunnerThread hare = new RunnerThread("Hare", 100, 90);
  
    public static void main(String[] args) 
    {
       
      
       for(int r = 1; r <= 5; r++)
       {
            raceFinished = false;
            System.out.println("Race "+ r);
            System.out.println("Get set...Go!");
            
            tortise.start();
            hare.start();
            
            while(!raceFinished)
            {
                
                
                if(hare.progress >= 1000 && tortise.progress < 1000)
                {
                    winCountH ++; 
                }
                else if(hare.progress < 1000 && tortise.progress >= 1000)
                    
                hare.isResting = true;
                tortise.isResting = true; 
                raceFinished = true;
            }
       }
       System.out.print("Hare wins: " + winCountH );
       System.out.print("Tortise wins: " + winCountT);
    }
      
}
    
