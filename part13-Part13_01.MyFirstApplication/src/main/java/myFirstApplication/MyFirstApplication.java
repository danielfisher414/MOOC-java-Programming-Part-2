package myFirstApplication;

import javafx.application.Application;
import javafx.stage.Stage;

public class MyFirstApplication extends Application {

    public void start(Stage stage) {
        stage.setTitle("My first application");
        stage.show();
    }

    public static void main(String[] args) {
        launch(MyFirstApplication.class);
        System.out.println("Hello world!");
    }

}
