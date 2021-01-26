package title;

import javafx.application.Application;
import javafx.stage.Stage;

public class UserTitle extends Application {

    public void start(Stage stage) {
        Parameters params = getParameters();
        String organisation = params.getNamed().get("organisation");
        String course = params.getNamed().get("course");

        stage.setTitle(organisation + ": "+ course);
        stage.show();
    }
}
