package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sun.security.util.Password;

import java.io.IOException;
import java.net.URL;


public class PasswordCheckingController {


    public AnchorPane checkcontent;
    public JFXPasswordField txtPassword;
    public JFXTextField txtUserName;

    public void checkPassword(ActionEvent actionEvent) throws IOException {
        if (txtUserName.getText().equalsIgnoreCase("ADMIN") && txtPassword.getText().equals("1234")){
            //admin context
            URL resource = getClass().getResource("../viwe/AdminBordForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) checkcontent.getScene().getWindow();
            window.setTitle("Admin Form");
            window.setScene(new Scene(load));
        }else if (txtUserName.getText().equalsIgnoreCase("Reception") && txtPassword.getText().equals("513")){
            URL resource = getClass().getResource("../viwe/DashBordForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) checkcontent.getScene().getWindow();
            window.setTitle("Reception Form");
            window.setScene(new Scene(load));
        }else {
            new Alert(Alert.AlertType.WARNING,"Password OR UserName incorrect.\n please try again.").show();
        }
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../viwe/LoginBordForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) checkcontent.getScene().getWindow();
        window.setTitle("Login Form");
        window.setScene(new Scene(load));
    }


}
