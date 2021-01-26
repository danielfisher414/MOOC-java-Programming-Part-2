package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {
    
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        TextArea centerText = new TextArea("");
        layout.setCenter(centerText);
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        
        Label lettersLabel = new Label("Letters: 0");
        Label wordsLabel = new Label("Words: 0");
        Label longestLabel = new Label("The longest word is:");
        
        hbox.getChildren().add(lettersLabel);
        hbox.getChildren().add(wordsLabel);
        hbox.getChildren().add(longestLabel);
        
        centerText.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            // set values of text elements
            lettersLabel.setText("Letters: " + String.valueOf(characters));
            wordsLabel.setText("Words: " + String.valueOf(words));
            longestLabel.setText("The longest word is: " + longest);
        });
        
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
