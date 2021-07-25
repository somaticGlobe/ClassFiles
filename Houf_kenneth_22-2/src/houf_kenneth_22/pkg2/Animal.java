/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_22.pkg2;
import java.util.List;
import java.util.function.Consumer;
/**
 *
 * @author somat
 */
public abstract class Animal
{    
    private String name;
    protected String type;
    protected String voice;
    
    public Animal(String name)
    {
        this.name = name;
        
    }
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    //Returns the animal's name concatenated with 'the' 
    //and the type of the class
    public String getNameAndType()
    {
        String nameAndType = this.name + " the " + this.type +" ";
        return nameAndType;
    }    
    public abstract void speak();
    protected void speak(Consumer<Animal> consumer)
    {

    }
}
