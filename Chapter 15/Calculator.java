// Import necessary JavaFX classes

package com.example.calculator;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

// Main class extending the Application class to create a JavaFX application
public class Calc extends Application {

    // Instance variables for calculator display, result, operator and a flag to check number input
    private TextField display = new TextField();
    private double result = 0;
    private String operator = "";
    private boolean numberInput = true;

    // Overriding the start method to define the UI
    @Override
    public void start(Stage primaryStage) {

        // Creating a GridPane layout
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setVgap(10);
        pane.setHgap(10);

        // Setting the TextField to be non-editable and adding it to the pane
        display.setEditable(false);
        pane.add(display, 0, 0, 3, 1);

        // Array of names for the buttons
        String[] names = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        // Loop to create buttons and add them to the pane
        int i = 0;
        for (int row = 1; row < 5; row++) {
            for (int col = 0; col < 4; col++) {
                // Create a button with name from the array
                Button button = new Button(names[i]);
                button.setPrefSize(50, 50);
                // Add button to the pane
                pane.add(button, col, row);
                // Attach an event handler to the button
                button.setOnAction(event -> process(button.getText()));
                i++;
            }
        }

        // Setting the scene on the stage and displaying it
        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Calc");
        primaryStage.show();
    }

    // Method to process the value of the button clicked
    private void process(String value) {
        // Checking if value is a number
        if ("1234567890.".contains(value)) {
            if (numberInput)
                // If number input is true, append the value to the display text
                display.setText(display.getText() + value);
            else {
                // If number input is false, set the display text to the value and set number input to true
                display.setText(value);
                numberInput = true;
            }
        } else {
            // If value is an operator
            if (numberInput) {
                numberInput = false;
                // Perform calculation on the current result
                calculate(Double.parseDouble(display.getText()));
                operator = value;
            } else {
                // Change the operator
                operator = value;
            }
        }
    }

    // Method to calculate the result based on the operator
    private void calculate(double value) {
        if (operator.equals("+"))
            result += value;
        else if (operator.equals("-"))
            result -= value;
        else if (operator.equals("*"))
            result *= value;
        else if (operator.equals("/"))
            result /= value;
        else
            // If no operator, set the result to the value
            result = value;
        // Display the result
        display.setText("" + result);
    }

    // Main method to launch the application
    public static void main(String[] args) {
        launch(args);
    }
}
