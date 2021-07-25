/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_project_23.pkg2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author somat
 */
public class RunnerThread extends Thread
{
    private final String name;
    public boolean isResting;
    private final int restChance;
    private final int speed;
    public int progress;
    
    RunnerThread(String name, int speed, int restChance)
    {
        isResting  = false;
        this.restChance = restChance;
        this.name = name;
        this.speed = speed;
        
    }
    
    @Override
    public void run()
    {   
        
        Thread ct = Thread.currentThread();
        ct.setName(name);
        
        while(progress < 1000)
        {
            double d = Math.random()*100;
            
            if(d > restChance)
            {
                isResting = false;
            }
            else
            {
                isResting = true;
            }
            
            if(!isResting)
            {
                progress = progress + this.speed;
                System.out.println(this.name + ": " + progress);
            }
            else
            {
                try 
                {
                    sleep(10);
                } 
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(RunnerThread.class.getName()).log(Level.SEVERE, null, ex);
                }  
            }            
        }
        System.out.println(this.name + ": I finished");
    }    
}
