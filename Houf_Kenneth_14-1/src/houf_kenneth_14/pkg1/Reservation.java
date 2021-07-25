/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_14.pkg1;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.text.NumberFormat;
/**
 *
 * @author somat
 */
public class Reservation 
{
    private LocalDate aDate;
    private String arrivalDateFormatted;
    private LocalDate dDate;
    private String departureDateFormatted;
    private long numberOfNights;
    private double pricePerNight;
    private String pricePerNightFormatted;
    private double totalPrice;
    private String totalPriceFormatted;
    
    DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    public void Reservation()
    {
        pricePerNight = 145.00;
    }
    public LocalDate getArrivalDate()
    {  
        return this.aDate;
    }
    public String getArrivalDateFormatted()
    {
        arrivalDateFormatted = dtf.format(aDate);
        return arrivalDateFormatted;
    }
    public void setArrivalDate(LocalDate arrivalDate)
    {
        aDate = arrivalDate;
    }
    
    public LocalDate getDepartureDate()
    {
        return this.dDate;
    }
    
    public String getDepartureDateFormatted()
    {
        departureDateFormatted = dtf.format(dDate);
        return departureDateFormatted;
    }
    
    public void setDepartureDate(LocalDate departureDate)
    {
        dDate = departureDate;
    }
    
    public long getNumberOfNights()
    {
        numberOfNights = ChronoUnit.DAYS.between(aDate, dDate); 
        return numberOfNights;
    }
    
    public String getPricePerNightFormatted()
    {
        numberOfNights = getNumberOfNights();
        pricePerNightFormatted = currency.format(pricePerNight);
        return pricePerNightFormatted;
    }
    
    public double getTotalPrice()
    {
        totalPrice = this.numberOfNights * pricePerNight;
        return totalPrice;
    }
    
    public String getTotalPriceFormatted()
    {
        totalPrice = getTotalPrice();
        totalPriceFormatted = currency.format(totalPrice);
        return totalPriceFormatted;
    }
}
