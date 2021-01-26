package title;

import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Application.launch(UserTitle.class,
                "--organisation=Once upon a time",
                "--course=Title");
    }

}
