package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    public void start(Stage stage) {
        BorderPane borderpane = new BorderPane();
        Canvas canvas = new Canvas(600, 600);

        GraphicsContext painter = canvas.getGraphicsContext2D();
       
        
        borderpane.setCenter(canvas);
        

        //fillRect(x,y,width,height);
        //eyes
        painter.fillRect(100, 100, 50, 50);
        painter.fillRect(400, 100, 50, 50);
      //mouth
        painter.fillRect(100, 450, 350, 50);
        //
         painter.fillRect(50, 400, 50, 50);
         painter.fillRect(450, 400, 50, 50);
          
        Scene scene = new Scene(borderpane);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
        System.out.println("Hello world!");
    }

}
