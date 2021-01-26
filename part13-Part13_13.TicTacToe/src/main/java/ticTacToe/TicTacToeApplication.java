package ticTacToe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class TicTacToeApplication extends Application {

    public boolean end = false;
    public boolean change = true;
    public Button[] buttonsList = new Button[9];
    public ArrayList rememberX = new ArrayList<>();
    public ArrayList rememberO = new ArrayList<>();
    public ArrayList rememberNum = new ArrayList<>();
    public BorderPane layout = new BorderPane();

    public void createButtons() {
        for (int i = 0; i < 9; i++) {
            final int buttonInt = i;
            Button button = new Button(" ");
            button.setFont(Font.font("Monospaced", 40));
            buttonsList[i] = button;

            buttonsList[i].setOnAction(event -> {

                if (end == false) {
                    if (change == true) {
                        change = false;
                        drawX(buttonInt);

                    } else if (change == false) {
                        change = true;
                        drawY(buttonInt);
                    }
                }
            });

        }
    }

    public void drawX(int i) {

        if (!rememberNum.contains(i)) {
            rememberNum.add(i);
            rememberX.add(i);
            buttonsList[i].setText("X");

            turnLabel();

        }
    }

    public void drawY(int i) {
        if (!rememberNum.contains(i)) {
            rememberNum.add(i);
            rememberO.add(i);
            buttonsList[i].setText("O");
            turnLabel();
        }
    }

    public void turnLabel() {

        Label turnLabel = new Label(" ");
        String turn = " ";
        if (rememberX.containsAll(Arrays.asList(0, 1, 2))
                || rememberX.containsAll(Arrays.asList(3, 4, 5))
                || rememberX.containsAll(Arrays.asList(6, 7, 8))
                || rememberX.containsAll(Arrays.asList(0, 3, 6))
                || rememberX.containsAll(Arrays.asList(1, 4, 7))
                || rememberX.containsAll(Arrays.asList(2, 5, 8))
                || rememberX.containsAll(Arrays.asList(0, 4, 8))
                || rememberX.containsAll(Arrays.asList(2, 4, 6))) {
            turn = "The end!";
            end = true;
        } else if (rememberO.containsAll(Arrays.asList(0, 1, 2))
                || rememberO.containsAll(Arrays.asList(3, 4, 5))
                || rememberO.containsAll(Arrays.asList(6, 7, 8))
                || rememberO.containsAll(Arrays.asList(0, 3, 6))
                || rememberO.containsAll(Arrays.asList(1, 4, 7))
                || rememberO.containsAll(Arrays.asList(2, 5, 8))
                || rememberO.containsAll(Arrays.asList(0, 4, 8))
                || rememberO.containsAll(Arrays.asList(2, 4, 6))) {
            turn = "The end!";
            end = true;
        } else if (rememberNum.containsAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8))) {
            turn = "The end!";
            end = true;
        } else if (change == true) {
            turn = "Turn: X";
        } else if (change == false) {
            turn = "Turn: O";
        }
        turnLabel.setText(turn);

        turnLabel.setFont(Font.font("Monospaced", 40));
        layout.setTop(turnLabel);
    }

    public void start(Stage stage) {
        Label turnLabel = new Label("Turn: X");

        turnLabel.setFont(Font.font("Monospaced", 40));
        layout.setTop(turnLabel);

        //setting up the buttons
        createButtons();

//        turnLabel();
        GridPane gridButtons = new GridPane();
        //adding buttons to grid with for loop

        gridButtons.add(buttonsList[0], 1, 0, 1, 1);
        gridButtons.add(buttonsList[1], 2, 0, 1, 1);
        gridButtons.add(buttonsList[2], 3, 0, 1, 1);
        gridButtons.add(buttonsList[3], 1, 1, 1, 1);
        gridButtons.add(buttonsList[4], 2, 1, 1, 1);
        gridButtons.add(buttonsList[5], 3, 1, 1, 1);
        gridButtons.add(buttonsList[6], 1, 2, 1, 1);
        gridButtons.add(buttonsList[7], 2, 2, 1, 1);
        gridButtons.add(buttonsList[8], 3, 2, 1, 1);

        //for loop for buttons
        gridButtons.setVgap(10);
        gridButtons.setHgap(10);

        layout.setAlignment(gridButtons, Pos.CENTER);
        layout.setMargin(gridButtons, new Insets(10, 10, 10, 0));

        layout.setCenter(gridButtons);
        Scene firstScene = new Scene(layout);
        stage.setScene(firstScene);
        stage.setTitle("Tic-tac-toe");
        stage.show();

    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
        System.out.println("Hello world!");
    }

}
