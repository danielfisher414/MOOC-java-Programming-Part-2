package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {
    
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        layout.setCenter(new TextArea(""));
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.getChildren().add(new Label("Letters: 0"));
        hbox.getChildren().add(new Label("Words: 0"));
        hbox.getChildren().add(new Label("The longest word is:"));
//        hbox.getChildren().add(new Text)

        layout.setBottom(hbox);
        //layout initalisation
        Scene scene = new Scene(layout);
        
        stage.setScene(scene);
        stage.show();
        
    }
    
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
        System.out.println("Hello world!");
    }
    
}
