/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_project_17.pkg3;
import javafx.scene.control.Alert;
/**
 *
 * @author somat
 */
public class Validation 
{
    public String lineEnd;
    
    public Validation()
    {
        this.lineEnd = "\n";
    }
    
    public Validation(String lineEnd)
    {
        this.lineEnd = lineEnd;
    }
    
    public Boolean isPresent(String value, String name)
    {
        boolean isValid = true;
        String msg = "";
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Invalid Entry");
        
        if(value.isEmpty())
        {
            msg = name + "is required." + lineEnd;
            alert.setContentText(msg);
            alert.showAndWait();
            isValid = false;
        }
        return isValid;
    }
    
    public double isDouble(String value, String name)
    {
        double d = 0;
        String msg;
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Invalid Entry");
        try
        {
            d = Double.parseDouble(value);
        }
        catch(NumberFormatException e)
        {
            msg = name + "must be a valid number." + lineEnd;
            alert.setContentText(msg);
            alert.showAndWait();
        }
        return d;
    }
    
        public int isInt(String value, String name)
    {
        int i = 0;
        String msg;
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Invalid Entry");
        try
        {
            i = Integer.parseInt(value);
        }
        catch(NumberFormatException e)
        {
            msg = name + "must be a valid number." + lineEnd;
            alert.setContentText(msg);
            alert.showAndWait();
        }
        return i;
    }
}
