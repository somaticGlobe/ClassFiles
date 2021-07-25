/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_project_11.pkg1;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author somat
 */
public class Houf_Kenneth_Project_111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        NumberFormat average = NumberFormat.getNumberInstance();
        average.setMinimumFractionDigits(3);
        average.setMaximumFractionDigits(3);
        
        // TODO code application logic here
        boolean endApp = false; // checks to end application
        String anotherPlayer; // used to loop for another player
        int numberOfAtBats; // used to instantiate array of correct size 
        double numberOfBases = 0; // holds total number of bases
        double numberOfHits = 0; // number of times a base was taken
        double battingAverage;// holds batting average
        double slugPercentage;// Holds Slugging Percentage
        //Start
        System.out.println("Welcome to the Batting Average Calculator ");
        while(!endApp)
        {
            System.out.println();
            numberOfAtBats = Console.getIntWithinRange("Enter number of times at bat: ",0,31);
            
            int[] battingAverageArray = new int[numberOfAtBats];  
            
            System.out.println("0 = out, 1 = single, 2 = double,\n"
                             + "3 = triple, 4 = home run");
            
            for(int i = 0; i <battingAverageArray.length; i++)
            {
                int atBat = i + 1;
                
                battingAverageArray[i] = Console.getIntWithinRange("Result for at-bat "
                                                                    +atBat+": ", -1, 5);
                numberOfBases += battingAverageArray[i];
                
                if(battingAverageArray[i] > 0)
                {
                    numberOfHits++;
                }
            }
            
            System.out.println();
            
            battingAverage = numberOfHits/numberOfAtBats;
            slugPercentage = numberOfBases/numberOfAtBats;
            
            String battingAverageString = average.format(battingAverage);
            String slugPercentageString = average.format(slugPercentage);
            
            System.out.println("Batting average: "+battingAverageString);
            System.out.println("Slugging percent: "+slugPercentageString);
            
            System.out.println();
            
            System.out.print("Another player? (y/n)");
            anotherPlayer = sc.next();
            
            if(!anotherPlayer.equalsIgnoreCase("y"))
            {
                endApp = true;
                System.out.println("Bye!");
            }
        }   
    }
}
