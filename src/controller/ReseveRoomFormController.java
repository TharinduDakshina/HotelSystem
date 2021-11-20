package controller;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
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
import model.Customer;
import viwe.tm.CustomerTM;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;

public class ReseveRoomFormController {
    public AnchorPane reseveRoomContext;
    public JFXTextField txtName;
    public JFXTextField txtAddress;
    public JFXTextField txtTelephoneNumber;
    public JFXTextField txtNIC;
    public JFXTextField txtEmail;
    public ComboBox<String> cmbSelectMealList;
    public TableView<CustomerTM> tblCustomer;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colT_PNumber;
    public TableColumn colNIC;
    public TableColumn colE_mail;
    public TableColumn colRemoveCustomer;
    public TableColumn colMealItem;
    static ArrayList<Customer> customerList = new ArrayList();
    static ArrayList<String> mealPlansBucket = new ArrayList();
    public Label lblFreeRooms;
    public TableColumn colPrint;
    public Label lblBooked;


    public void initialize(){
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colT_PNumber.setCellValueFactory(new PropertyValueFactory<>("telephoneNumber"));
        colNIC.setCellValueFactory(new PropertyValueFactory<>("nicNumber"));
        colE_mail.setCellValueFactory(new PropertyValueFactory<>("Email"));
        colMealItem.setCellValueFactory(new PropertyValueFactory<>("mealItem"));
        colRemoveCustomer.setCellValueFactory(new PropertyValueFactory<>("btn"));
        colPrint.setCellValueFactory(new PropertyValueFactory<>("btnPrint"));

        ObservableList<String> obList=FXCollections.observableArrayList();
        for (String tempMealPlans:mealPlansBucket
        ) {
            obList.add(tempMealPlans);
        }
        cmbSelectMealList.setItems(obList);

    }


    static {
        mealPlansBucket.add("Local Meals");
        mealPlansBucket.add("Chinese Meals");
        mealPlansBucket.add("French Meals");
    }



    public boolean isExists(Customer customer){
        for (Customer tempCusromer:customerList
             ) {
                if (tempCusromer.getNicNumber().equalsIgnoreCase(customer.getNicNumber())){
                    return false;
                }
        }
        return true;
    }
    public void btnAddCusromer(ActionEvent actionEvent) {

           Customer customer=new Customer(txtName.getText(),txtAddress.getText(),txtTelephoneNumber.getText(),txtNIC.getText(),txtEmail.getText(),cmbSelectMealList.getValue());
           if (isExists(customer)){
               if (customerList.add(customer)){
                   //alert-->save
                   new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.OK).show();
                   loadAllCustomer();

               }else{
                   new Alert(Alert.AlertType.WARNING, "Try Again", ButtonType.CLOSE).show();
               }
           }else{
               new Alert(Alert.AlertType.WARNING, "Try Again", ButtonType.CLOSE).show();
           }
       }

    private void loadAllCustomer(){
        ObservableList<CustomerTM> tmObservableList= FXCollections.observableArrayList();
        for (Customer temp:customerList
             ) {
            Button btnPrint=new Button("Print");
            Button btn=new Button("Delete");
            tmObservableList.add(
                    new CustomerTM(temp.getName(),temp.getAddress(),temp.getTelephoneNumber(),temp.getNicNumber(),temp.getEmail(),temp.getMealItem(),btn,btnPrint));
            btn.setOnAction((e)->{
                ButtonType yes=new ButtonType("yes",ButtonBar.ButtonData.OK_DONE);
                ButtonType no=new ButtonType("no",ButtonBar.ButtonData.CANCEL_CLOSE);

                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Are you want To delete this customer?",yes,no);
                Optional<ButtonType> result = alert.showAndWait();
                if (result.orElse(no)==yes){
                    customerList.remove(temp);
                    loadAllCustomer();
                }

            });

            btnPrint.setOnAction((event)->{
                ButtonType ok=new ButtonType("OK",ButtonBar.ButtonData.OK_DONE);


                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Customer deatils print succesfull..",ok);
                alert.showAndWait();
                loadAllCustomer();

            });
        }
        tblCustomer.setItems(tmObservableList);
        lblBooked.setText(Integer.toString(tmObservableList.size()));
        lblFreeRooms.setText(Integer.toString(25-tmObservableList.size()));
    }

    public void homeOnAction(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("../viwe/LoginBordForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) reseveRoomContext.getScene().getWindow();
        window.setTitle("Login Form");
        window.setScene(new Scene(load));
    }

    public void previouswindowOnAction(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("../viwe/DashBordForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) reseveRoomContext.getScene().getWindow();
        window.setTitle("Reception Form");
        window.setScene(new Scene(load));
    }
}
