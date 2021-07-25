/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_14.pkg1;
import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author somat
 */
public class Houf_Kenneth_141 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        boolean endGame = false;
        String continueChoice;
        Scanner sc = new Scanner(System.in);
        LocalDate arrivalDate = LocalDate.now();
        boolean isValid = false;
        LocalDate newDate = LocalDate.now();
        
        while(!endGame)
        {
            Reservation newRes = new Reservation();
            System.out.println("Reservation Calculator");
            System.out.println();
           
            System.out.print("Enter arrival month (1-12): ");
            newDate = newDate.withMonth(sc.nextInt());
            
            System.out.print("Enter arrival day (1-31): ");
            newDate = newDate.withDayOfMonth(sc.nextInt());
            
            System.out.print("Enter arrival year: ");
            newDate = newDate.withYear(sc.nextInt());
            newRes.setArrivalDate(newDate);
            
            System.out.print("Enter the departure month (1-12): ");
            newDate = newDate.withMonth(sc.nextInt());
            
            System.out.print("Enter the departure day (1-31): ");
            newDate.withDayOfMonth(sc.nextInt());
            
            System.out.print("Enter the departure year: ");
            newDate.withYear(sc.nextInt());
            
            newRes.setDepartureDate(newDate);
            String price = newRes.getPricePerNightFormatted();
            
            System.out.println();
            System.out.println("Arrival Date: "+newRes.getArrivalDateFormatted());
            System.out.println("Departure Date: "+newRes.getDepartureDateFormatted());
            System.out.println("Price: "+newRes.getPricePerNightFormatted());
            System.out.println("Total price: "+newRes.getTotalPriceFormatted()+" for "
                             +newRes.getNumberOfNights()+" nights");   
            
            System.out.println();
            System.out.print("Continue? (y/n): ");
            continueChoice = sc.next();
            
            if(continueChoice.equalsIgnoreCase("y"))
            {
                System.out.println();
                System.out.println("Bye!");
                endGame = true;
            } 
        }
    } 
}
