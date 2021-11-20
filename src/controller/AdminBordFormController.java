package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminBordFormController {

    public AnchorPane changeWindowContext;
    public AnchorPane adminContext;

    public void roomsOnAction(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("../viwe/RoomsEditForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) changeWindowContext.getScene().getWindow();
        window.setTitle("Rooms");
        window.setScene(new Scene(load));
    }

    public void changeMealPackege(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("../viwe/MealPackegeEditForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) changeWindowContext.getScene().getWindow();
        window.setTitle("Meal Plans");
        window.setScene(new Scene(load));
    }

    public void incomeReport(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("../viwe/IncomeReportForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) changeWindowContext.getScene().getWindow();
        window.setTitle("Income Report");
        window.setScene(new Scene(load));
    }

    public void btnBackToWelcomeForm(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("../viwe/LoginBordForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) changeWindowContext.getScene().getWindow();
        window.setTitle("Login Form");
        window.setScene(new Scene(load));
    }

    public void searchFacebook(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("../viwe/FaceBookLoginPage.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene=new Scene(load);
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
