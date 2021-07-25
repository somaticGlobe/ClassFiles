/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_project_17.pkg3;

import java.text.NumberFormat;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author somat
 */
public class Houf_Kenneth_Project_173 extends Application 
{
    private TextField investmentField;
    private TextField interestRateField;
    private TextField yearsField;
    private TextField futureValueField;
    
    Validation v = new Validation();
    
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("Future Value Calculator");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setHgap(10);
        grid.setVgap(10);
        
        Scene scene = new Scene(grid);
        
        grid.add(new Label("Monthly Investment"), 0, 0);
        investmentField = new TextField();
        grid.add(investmentField, 1, 0);
        
        grid.add(new Label("Yearly Interest Rate"),0 ,1);
        interestRateField = new TextField();
        grid.add(interestRateField, 1, 1);
        
        grid.add(new Label("Years:"), 0, 2);
        yearsField = new TextField();
        grid.add(yearsField, 1, 2);
        
        grid.add(new Label("Future Value:"), 0, 3);
        futureValueField = new TextField();
        futureValueField.setEditable(false);
        grid.add(futureValueField, 1, 3);
        
        Button calculateButton = new Button("Calculate");
        calculateButton.setOnAction(event -> calculateButtonClicked());
        
        Button exitButton = new Button("Exit");
        exitButton.setOnAction(event -> exitButtonClicked());
        
        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().add(calculateButton);
        buttonBox.getChildren().add(exitButton);
        buttonBox.setAlignment(Pos.BOTTOM_RIGHT);
        grid.add(buttonBox, 0, 4, 2, 1);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void calculateButtonClicked()
    {
        // get data from texts fields
        boolean isValidInvestment = v.isPresent(investmentField.getText(), "Investment");
        boolean isValidRate = v.isPresent(investmentField.getText(), "Interest Rate");
        boolean isValidYears = v.isPresent(investmentField.getText(), "Years");
        double futureValue = 0;
        if(isValidYears && isValidRate && isValidInvestment)
        {
            double investment = v.isDouble(investmentField.getText(), "Investment");
            double rate = v.isDouble(interestRateField.getText(), "Interest Rate");
            int years = v.isInt(yearsField.getText(), "Years");
            
                    //calculate future value
            futureValue = FinancialCalculations.calculateFutureValue(investment, 
                rate, years);
        }
      
        //set data in read-only text field
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        futureValueField.setText(currency.format(futureValue));
    }
    
    private void exitButtonClicked()
    {
        System.exit(0);
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
