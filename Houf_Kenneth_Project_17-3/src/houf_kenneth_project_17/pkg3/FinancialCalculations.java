/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_project_17.pkg3;

/**
 *
 * @author somat
 */
public class FinancialCalculations 
{
   public static double calculateFutureValue(double investment, double rate, int years)
   {
       double futureValue = 0;
       for(int i = 0; i < years; i++)
       {
           for(int j = 0; j < 12; j++)
           {
                futureValue = futureValue + investment;
           }
            futureValue = futureValue*(1 + rate);
       }
       return futureValue;
   }
}
