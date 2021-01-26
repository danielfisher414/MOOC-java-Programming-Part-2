package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application {
    
    public void start(Stage stage) {
        BorderPane borderpane = new BorderPane();
        borderpane.setTop(new Label("NORTH"));
        borderpane.setRight(new Label("EAST"));
        borderpane.setBottom(new Label("SOUTH"));
        Scene scene = new Scene(borderpane);
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
        System.out.println("Hello world!");
    }
    
}
