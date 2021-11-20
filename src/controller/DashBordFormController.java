package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class DashBordFormController {

    public AnchorPane receptionistContext;
    public JFXTextField profileTxt;
    public AnchorPane dashBordContext;

     /*{
        PasswordCheckingController p1=new PasswordCheckingController();
        profileTxt.setText(p1.userName.getText());
    }*/





    public void prfileNameShowOnAction(ActionEvent actionEvent) {

    }

    public void reserveRoomOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../viwe/ReseveRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) dashBordContext.getScene().getWindow();
        window.setTitle("Reseve Room Form");
        window.setScene(new Scene(load));
    }
}
