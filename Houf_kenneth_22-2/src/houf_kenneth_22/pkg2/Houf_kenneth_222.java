/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_22.pkg2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author somat
 */
public class Houf_kenneth_222 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();
        System.out.println("Welcome to the Animal List");
        System.out.println();
        System.out.println("Type of Animal \n"
                         + "1 - Dog \n"
                         + "2 - Cat \n"
                         + "3 - Turtle");
        System.out.println();
        
        
        String continueChoice = "y";
        
        while(continueChoice.equalsIgnoreCase("y"))
        {
            int type = Console.getIntWithinRange("Choose type: ", 1, 4);
            String name = Console.getString("Enter animal's name: ");
            
           if(type == 1)
           {
               Dog d = new Dog(name);
               animals.add(d);
           }
           else if(type == 2)
           {
               Cat c = new Cat(name);
               animals.add(c);
           }
           else if(type == 3)
           {
               Turtle t = new Turtle(name);
               animals.add(t);   
           }
           
           System.out.println();
           System.out.print("Continue? (y/n): ");
           continueChoice = sc.next();
        }
        System.out.println("And now lets hear the animals "
                         + "speak");
        System.out.println("-----------------------------");
        int l = animals.size();
        System.out.println(l);
        for(int i = 0; i < animals.size(); i++)
        {
            //System.out.println("Meh");
            animals.get(i).speak();
        }
        //System.out.println("goodbye");
        
        
        // TODO code application logic here
    }
    
}
