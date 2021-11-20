package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginBordFormController {
    public AnchorPane loginPageContent;

    public void adminOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../viwe/passwordChecking.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) loginPageContent.getScene().getWindow();
        window.setTitle("Checking form");
        window.setScene(new Scene(load));
    }

    public void receptionistOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../viwe/passwordChecking.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) loginPageContent.getScene().getWindow();
        window.setTitle("Checking form");
        window.setScene(new Scene(load));
    }
}
