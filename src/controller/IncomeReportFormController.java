package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class IncomeReportFormController {

    public AnchorPane incomeReporting;

    public void monthlyReportonAction(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("../viwe/MonthlyIncomeReport.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) incomeReporting.getScene().getWindow();
        window.setTitle("Monthly Income Report");
        window.setScene(new Scene(load));
    }

    public void annuallyReportOnAction(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("../viwe/AnuallyIncomeReport.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) incomeReporting.getScene().getWindow();
        window.setTitle("Annually Income Report");
        window.setScene(new Scene(load));
    }

    public void backOnAction(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("../viwe/AdminBordForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) incomeReporting.getScene().getWindow();
        window.setTitle("Admin Form");
        window.setScene(new Scene(load));
    }
}
