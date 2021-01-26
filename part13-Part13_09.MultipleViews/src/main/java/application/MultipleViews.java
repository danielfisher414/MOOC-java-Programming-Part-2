package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {
    
    public void start(Stage stage) {

        //buttons
        Button back = new Button("To the first view!");
        Button forthToSecond = new Button("To the second view!");
        Button forthToThird = new Button("To the third view!");
        Button forthToFirst = new Button("To the first view!");
        //1st view
        BorderPane firstBorderpane = new BorderPane();
        //2nd view

        VBox vbox = new VBox();
        
        vbox.getChildren().add(forthToThird);
        vbox.getChildren().add(new Label("Second view!"));
        //3rd view
        GridPane gridPane = new GridPane();
        Label thirdLabel = new Label("Third view!");
        gridPane.add(thirdLabel, 0, 0);
        gridPane.add(forthToFirst, 1, 1);

        //scenes
        Scene first = new Scene(firstBorderpane);
        Scene second = new Scene(vbox);
        Scene third = new Scene(gridPane);
        //borderpanes view
        firstBorderpane.setTop(new Label("First view!"));
        firstBorderpane.setCenter(forthToSecond);
//        borderpane.setCenter(forth);
        //changes the first scene to second,if you click on the center button
        forthToSecond.setOnAction((event) -> {
            stage.setScene(second);
        });
        //changes the second scene to the thid view
        forthToThird.setOnAction((event) -> {
            stage.setScene(third);
        });
        
        forthToFirst.setOnAction((event) -> {
            stage.setScene(first);
        });
        
        stage.setScene(first);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(MultipleViews.class);
        System.out.println("Hello world!");
    }
    
}
