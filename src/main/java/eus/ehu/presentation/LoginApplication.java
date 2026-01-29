package eus.ehu.presentation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("JavaFX Login App");
        stage.setScene(scene);
        // Show, then ensure it´s visible, centered and focused
        stage.show();

        stage.setIconified(false);
        stage.centerOnScreen();
        stage.toFront();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
