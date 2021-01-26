package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {
    
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        VBox vbox = new VBox();
        
        TextField text = new TextField("");
        Button button = new Button("Update");
        Label label = new Label(); 
        
        vbox.getChildren().addAll(text, button, label);
//        layout.setCenter(vbox);
//        layout.setTop(vbox);
        
        button.setOnAction((event) -> {
            label.setText(text.getText());
        });
        
        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(NotifierApplication.class);
        
        System.out.println("Hello world!");
    }
    
}
