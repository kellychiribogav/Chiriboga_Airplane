//Author Name: Kelly Chiriboga
//Date: 13/01/2019
//Program Name: Chiriboga_Airplane
//Purpose: Simulation using "call" button, call attendant

package chiriboga_airplane;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.geometry.Pos;
import javafx.scene.text.Font;

/**
 *
 * @author Kelly Chiriboga
 */
public class Chiriboga_Airplane extends Application {

    /**
     *  
     * @param args
     */
    public static void main(String[] args) {
		Application.launch (args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Label Objects 
		Label lblHeading = new Label("'Call Flight Attendant' Simulator");
                Label lblSeats = new Label("Seats");
                Label lblSeat1 = new Label("A7");
                Label lblSeat2 = new Label("B10");
                Label lblSeat3 = new Label("C15");
                Label lblSeat4 = new Label("D22");
                Label lblSeat5 = new Label("E25"); 
                Label lblAttendant = new Label("Flight Attendant");   
                Label lblCalls = new Label("Passenger Calls");
    
                // Font Objects
                Font headingFont = new Font ("Georgia", 24);
                Font subheadingFont = new Font ("Georgia", 18);
                Font seatFont = new Font ("Georgia", 14);
                
                // Adds fonts to labels
                lblHeading.setFont(headingFont);  
                lblSeats.setFont(subheadingFont);
                lblAttendant.setFont(subheadingFont);
                lblCalls.setFont(subheadingFont);
                lblSeat1.setFont(seatFont);
                lblSeat2.setFont(seatFont);
                lblSeat3.setFont(seatFont);
                lblSeat4.setFont(seatFont);
                lblSeat5.setFont(seatFont);
                
                // Button objects
		Button btnExit = new Button("Exit");
                Button btnTurnOff = new Button("Turn Off All");
                btnTurnOff.setDisable(true);
                Button btnCall1 = new Button("Call");
                Button btnCall2 = new Button("Call");
                Button btnCall3 = new Button("Call");
                Button btnCall4 = new Button("Call");
                Button btnCall5 = new Button("Call");

		// Pane objects
                BorderPane pane = new BorderPane();
                pane.setPadding(new Insets(30, 20, 10, 20));
                BorderPane.setAlignment(lblHeading, Pos.CENTER);
                BorderPane.setAlignment(btnExit, Pos.BOTTOM_RIGHT);
		pane.setTop(lblHeading);
                pane.setBottom(btnExit);
                GridPane mainPane = new GridPane();
                pane.setCenter(mainPane);
                mainPane.setAlignment(Pos.CENTER);
                mainPane.setHgap(20);
                mainPane.setVgap(10);
                mainPane.add(lblSeats, 0, 1);
                mainPane.add(lblSeat1, 0, 3);
                mainPane.add(lblSeat2, 0, 4);
                mainPane.add(lblSeat3, 0, 5);
                mainPane.add(lblSeat4, 0, 6);
                mainPane.add(lblSeat5, 0, 7);
                mainPane.add(lblAttendant, 1, 1);
                mainPane.add(btnCall1, 1, 3);
                mainPane.add(btnCall2, 1, 4);
                mainPane.add(btnCall3, 1, 5);
                mainPane.add(btnCall4, 1, 6);
                mainPane.add(btnCall5, 1, 7);
                mainPane.add(lblCalls, 0, 10);
                mainPane.add(btnTurnOff, 0, 11);
                
		// Add scene to Primary Stage. Sets Title. Shows Window.
		Scene scene = new Scene(pane, 400, 450);
                pane.setStyle("-fx-background-color: #c6fcff;");
		primaryStage.setTitle("Airplane");
		primaryStage.setScene(scene);
		primaryStage.show();
                
                // Seat 1: Changes button status and disables it after call is made. Event Handler #1
		btnCall1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				btnCall1.setText("Called");
                                btnCall1.setDisable(true);
                                btnCall1.setStyle("-fx-background-color: #00ff00");
                                
                                if (btnTurnOff.isDisabled())   {
                                    btnTurnOff.setDisable(false);
                                }
			}
		});
                
                // Seat 2: Changes button status and disables it after call is made. Event Handler #2
		btnCall2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				btnCall2.setText("Called");
                                btnCall2.setDisable(true);
                                btnCall2.setStyle("-fx-background-color: #00ff00");
                                
                                if (btnTurnOff.isDisabled())   {
                                    btnTurnOff.setDisable(false);
                                }
			}
		});
                
                
                // Seat 3: Changes button status and disables it after call is made. Event Handler #3
		btnCall3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				btnCall3.setText("Called");
                                btnCall3.setDisable(true);
                                btnCall3.setStyle("-fx-background-color: #00ff00");
                                
                                if (btnTurnOff.isDisabled())   {
                                    btnTurnOff.setDisable(false);
                                }
			}
		});
                
                
                // Seat 4: Changes button status and disables it after call is made. Event Handler #4
		btnCall4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				btnCall4.setText("Called");
                                btnCall4.setDisable(true);
                                btnCall4.setStyle("-fx-background-color: #00ff00");
                                
                                if (btnTurnOff.isDisabled())   {
                                    btnTurnOff.setDisable(false);
                                }
			}
		});
                
                // Seat 5: Changes button status and disables it after call is made. Event Handler #5
		btnCall5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				btnCall5.setText("Called");
                                btnCall5.setDisable(true);
                                btnCall5.setStyle("-fx-background-color: #00ff00");
                                
                                if (btnTurnOff.isDisabled())   {
                                    btnTurnOff.setDisable(false);
                                }
			}
		});
                
                // Turns off green lights of call buttons and re-enables them for the passengers. Event Handler #6
		btnTurnOff.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {                         
				
                            if (btnCall1.isDisabled())   { 
                                btnCall1.setText("Call");
                                btnCall1.setStyle(null);
                                btnCall1.setDisable(false);
                            }
                            
                            if (btnCall2.isDisabled())   { 
                                btnCall2.setText("Call");
                                btnCall2.setStyle(null);
                                btnCall2.setDisable(false);
                            }  
                            
                            if (btnCall3.isDisabled())   { 
                                btnCall3.setText("Call");
                                btnCall3.setStyle(null);
                                btnCall3.setDisable(false);
                            }
                            
                            if (btnCall4.isDisabled())   { 
                                btnCall4.setText("Call");
                                btnCall4.setStyle(null);
                                btnCall4.setDisable(false);
                            }
                            
                            if (btnCall5.isDisabled())   { 
                                btnCall5.setText("Call");
                                btnCall5.setStyle(null);
                                btnCall5.setDisable(false);
                            }
                            
                            btnTurnOff.setDisable(true);                     
                                 
			}
		});

		// Ends Application. Event Handler #7
		btnExit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.exit (0);
			}
		});
	}

}
