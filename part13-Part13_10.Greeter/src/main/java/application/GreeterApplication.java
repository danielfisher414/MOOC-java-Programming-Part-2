package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {
    
    public void start(Stage stage) {
        //first Scene
        Label firstLabel = new Label("Enter your name and start.");
        TextField username = new TextField("");
        Button startBut = new Button("Start");
        GridPane gridpane = new GridPane();
        Scene firstScene = new Scene(gridpane);
        //second scene
        Label welcomeLabel = new Label();
        GridPane secondGridPane = new GridPane();
        secondGridPane.add(welcomeLabel, 0, 1);
        Scene secondScene =new Scene(secondGridPane);
        //adding objects to the gridane
        gridpane.add(firstLabel, 0, 0);
        gridpane.add(username, 0, 1);
        gridpane.add(startBut, 0, 2);
        //changing the preferance settings of the first gridpane
        gridpane.setPrefSize(300, 100);
        gridpane.setAlignment(Pos.CENTER);
        gridpane.setVgap(10);
        gridpane.setHgap(10);
        gridpane.setPadding(new Insets(20, 20, 20, 20));
//changing the preferance settings of the second gridpane
        secondGridPane.setPrefSize(300, 100);
        secondGridPane.setAlignment(Pos.CENTER);
        secondGridPane.setVgap(10);
        secondGridPane.setHgap(10);
        secondGridPane.setPadding(new Insets(20, 20, 20, 20));
        
        //inserting the setOnAction event
        startBut.setOnAction((event) -> {
            welcomeLabel.setText("Welcome "+username.getText()+"!");
            stage.setScene(secondScene);
        });

        //inserting the scene and showing
        
        stage.setScene(firstScene);
        stage.show();
    }
    
    
    public static void main(String[] args) {
        launch(GreeterApplication.class);
        System.out.println("Hellow world! :3");
    }
}
