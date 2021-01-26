package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    public void start(Stage stage) {
        BorderPane layout = new BorderPane();

        //layout objects
        HBox menu = new HBox();
        menu.setSpacing(60);
        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button explanation = new Button("Explanation");
        StackPane result = new StackPane();
        menu.getChildren().add(joke);
        menu.getChildren().add(answer);
        menu.getChildren().add(explanation);
        //creating the subviews
        StackPane jokeLayout = createView("What do you call a bear with no teeth?");
        StackPane answerLayout = createView("A gummy bear.");
        StackPane explanationLayout = createView("The bear has no teeth");
        //adding it to the layout
        layout.setCenter(jokeLayout);
        layout.setTop(menu);
        //event action
        joke.setOnAction((event) -> {
            layout.setCenter(jokeLayout);
        });
        answer.setOnAction((event) -> {
            layout.setCenter(answerLayout);
        });
        explanation.setOnAction((event) -> {
            layout.setCenter(explanationLayout);
        });

        Scene scene = new Scene(layout);
        stage.setTitle("Joke");
        stage.setScene(scene);
        stage.show();
    }

    private StackPane createView(String text) {
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        return layout;
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
        System.out.println("Hello world!");
    }
}
