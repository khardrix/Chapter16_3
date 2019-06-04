/********************************************************************************************************************
 ********************************************************************************************************************
 *****                                         Chapter 16: Problem 3                                            *****
 *****__________________________________________________________________________________________________________*****
 *****          3. Create a GUI that has 5 checkboxes and every time a box is checked or unchecked,             *****
 *****             a String consisting of all of the checked boxes' labels is output via a Label.               *****
 *****               That is, checking a new box adds it to the list and unchecking removes it.                 *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****                   HINT: start the String for the label anew with each check/uncheck.                     *****
 ********************************************************************************************************************
 ********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Chapter16_3 extends Application {

    // CLASS VARIABLE(s) declaration(s)
    private CheckBox cb1, cb2, cb3, cb4, cb5;
    private Label lblOutput;
    private String output;


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage){
        // String output initialized as an empty String
        output = "";

        // Initialize and Set the Label of all the CheckBoxes
        cb1 = new CheckBox("Java");
        cb2 = new CheckBox("Chapter");
        cb3 = new CheckBox("Sixteen");
        cb4 = new CheckBox("Problem");
        cb5 = new CheckBox("Three");

        // Create and Initialize a GridPane and Add all the CheckBoxes into it at specified Columns and Rows and
            // Set the Hgap
        GridPane gP1 = new GridPane();
        gP1.add(cb1, 0, 0);
        gP1.add(cb2, 1, 0);
        gP1.add(cb3, 2, 0);
        gP1.add(cb4, 3, 0);
        gP1.add(cb5, 4, 0);
        gP1.setHgap(25);

        // Initialize the Label and Set it's initial Text
        lblOutput = new Label();
        lblOutput.setText("Initial output .... Your output will go here.");

        // Create and Initialize another GridPane and Add the Label at the specified Column and Row
        GridPane gP2 = new GridPane();
        gP2.add(lblOutput, 0, 1);

        // Create and Initialize the final GridPane (the one the user sees) and Add the other GridPanes at their
            // specified Columns and Rows and Set the Vgap
        GridPane gPane = new GridPane();
        gPane.add(gP1, 0, 0);
        gPane.add(gP2, 0, 1);
        gPane.setVgap(25);

        // Create and Initialize the Scene, Set the Title of the Stage, Set the Scene to the Stage and Show the Stage
        Scene scene = new Scene(gPane, 500, 500);
        primaryStage.setTitle("Chapter 16: Problem 3");
        primaryStage.setScene(scene);
        primaryStage.show();

        // EventHandler Nested Inner Class named "handler"
        EventHandler<ActionEvent> handler = e -> {
            // Set the String output to an empty String (clearing the output every time a CheckBox is clicked and
                // this EventHandler is called
            output = "";

            // if block to test if CheckBox 1 is selected and add the appropriate text to the String output
            if(cb1.isSelected()){
                output += "Java ";
            }
            // if block to test if CheckBox 2 is selected and add the appropriate text to the String output
            if(cb2.isSelected()){
                output += "Chapter ";
            }
            // if block to test if CheckBox 3 is selected and add the appropriate text to the String output
            if(cb3.isSelected()){
                output += "Sixteen ";
            }
            // if block to test if CheckBox 4 is selected and add the appropriate text to the String output
            if(cb4.isSelected()){
                output += "Problem ";
            }
            // if block to test if CheckBox 5 is selected and add the appropriate text to the String output
            if(cb5.isSelected()){
                output += "Three ";
            }

            // Set the Text of the String output Label
            lblOutput.setText(output);
        };

        // EventHandler calls for ActionEvents when the user clicks on a CheckBox
        cb1.setOnAction(handler);
        cb2.setOnAction(handler);
        cb3.setOnAction(handler);
        cb4.setOnAction(handler);
        cb5.setOnAction(handler);
    }
}
