package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.MealPlans;
import viwe.tm.MealPlansTM;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;

public class MealPackegeEditFormController {

    public AnchorPane editMealPlanContext;
    public TableView tblMealPlans;
    public TableColumn colMealPlanNo;
    public TableColumn colMealPlanName;
    public TableColumn colRemoveMealPlan;
    public JFXTextField txtMealPlanNo;
    public JFXTextField txtMealPlanName;
    ArrayList<MealPlans> mealPlansList=new ArrayList();

    public void initialize(){
        colMealPlanNo.setCellValueFactory(new PropertyValueFactory<>("mealPlanNo"));
        colMealPlanName.setCellValueFactory(new PropertyValueFactory<>("mealPlanName"));
        colRemoveMealPlan.setCellValueFactory(new PropertyValueFactory<>("button"));

    }
    public void mealPlansSaveButton(ActionEvent event) {
        MealPlans mealPlans=new MealPlans(txtMealPlanNo.getText(),txtMealPlanName.getText());
        if (mealPlansList.add(mealPlans)){
            new Alert(Alert.AlertType.CONFIRMATION,"This Meal Plan Added.");
            loadAllMealPlans();
        }

    }

    public void loadAllMealPlans(){
        ObservableList<MealPlansTM> tmMealPlansObservableList= FXCollections.observableArrayList();
        for (MealPlans temMealPlans: mealPlansList
             ) {
            Button btn=new Button("Delete");
            tmMealPlansObservableList.add(
                    new MealPlansTM(temMealPlans.getMealPlanNo(),temMealPlans.getMealPlanName(),btn));
            btn.setOnAction((e)->{
                ButtonType yes=new ButtonType("Yes",ButtonBar.ButtonData.OK_DONE);
                ButtonType no=new ButtonType("NO",ButtonBar.ButtonData.CANCEL_CLOSE);

                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Are you want To delete this Meal plan?",yes,no);
                Optional<ButtonType> result = alert.showAndWait();
                if (result.orElse(no)==yes){
                    mealPlansList.remove(temMealPlans);
                    loadAllMealPlans();
                }
            });
        }
        tblMealPlans.setItems(tmMealPlansObservableList);
    }

    public void backToHome(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("../viwe/AdminBordForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) editMealPlanContext.getScene().getWindow();
        window.setTitle("Admin Form");
        window.setScene(new Scene(load));
    }
}
