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
import model.Rooms;
import viwe.tm.RoomTm;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;

public class RoomsEditFormController {

    public JFXTextField txtRoomNo;
    public JFXTextField txtRoomType;
    public AnchorPane roomEditContext;
    public TableView tblRoom;
    public TableColumn colNo;
    public TableColumn colRoomRype;
    public TableColumn colRemoveRoom;
    ArrayList<Rooms> roomList=new ArrayList();

    public void initialize(){
        colNo.setCellValueFactory(new PropertyValueFactory<>("roomNo"));
        colRoomRype.setCellValueFactory(new PropertyValueFactory<>("roomType"));
        colRemoveRoom.setCellValueFactory(new PropertyValueFactory<>("btn"));
    }
    public void roomSaveButton(ActionEvent event) {


        Rooms rooms=new Rooms(txtRoomNo.getText(),txtRoomType.getText());
        if (roomList.add(rooms)){
            new Alert(Alert.AlertType.CONFIRMATION,"Added Room.", ButtonType.OK).show();
            loadAllRooms();
        }else {
            new Alert(Alert.AlertType.CONFIRMATION,"This room is not Added.",ButtonType.OK).show();
        }
    }
    public void loadAllRooms(){
        ObservableList<RoomTm> tmRoomsObservableList= FXCollections.observableArrayList();
        for (Rooms tempRoom:roomList
             ) {
            Button btn=new Button("Delete");
            tmRoomsObservableList.add(
                    new RoomTm(tempRoom.getRoomNumber(),tempRoom.getRoomType(),btn));
            btn.setOnAction((e)->{
                ButtonType yes=new ButtonType("yes",ButtonBar.ButtonData.OK_DONE);
                ButtonType no=new ButtonType("NO",ButtonBar.ButtonData.CANCEL_CLOSE);

                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Are you want To delete this Room?",yes,no);
                Optional<ButtonType> result = alert.showAndWait();
                if (result.orElse(no)==yes){
                    roomList.remove(tempRoom);
                    loadAllRooms();
                }
            });

        }
       tblRoom.setItems(tmRoomsObservableList);
    }

    public void backToHome(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("../viwe/AdminBordForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) roomEditContext.getScene().getWindow();
        window.setTitle("Admin Form");
        window.setScene(new Scene(load));
    }
}
