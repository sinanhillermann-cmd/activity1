package eus.ehu.presentation;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;


public class LoginController {
    @FXML
    private Button myButton;

    @FXML
    private Label messageLabel;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleButtonClick() {

        String login = loginField.getText();
        String password = passwordField.getText();

        messageLabel.getStyleClass().removeAll("alert-success", "alert-danger");

        if ("admin".equals(login) && "123456".equals(password)) {
            messageLabel.setText("Correct!");
            messageLabel.getStyleClass().add("alert-success");
        } else {
            messageLabel.setText("Please try again :)");
            messageLabel.getStyleClass().add("alert-danger");
        }

        messageLabel.setVisible(true);
    }  
}
