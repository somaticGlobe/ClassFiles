/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_22.pkg2;

/**
 *
 * @author somat
 */
public class Turtle extends Animal
{
       public Turtle(String name)
    {
        super(name);
        type = "turtle";
        voice = "'Wave!' (turtles don't have vocal cords)";
    }
    
   @Override
    public void speak()
    {
        //super.speak(c -> System.out.println(c.getNameAndType() + voice));
        // I have tried to apply lambda but I can't seem to get it. after a 
        //substantial amount of time staring at this, I may have fudged it to make the program work
        System.out.println(this.getNameAndType()+voice);
    }
}
