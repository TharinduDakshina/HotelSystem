package viwe.tm;


import javafx.scene.control.Button;

public class RoomTm {
    private String roomNo;
    private String roomType;
    private Button btn;

    public RoomTm(String roomNo, String roomType, Button btn) {
        this.setRoomNo(roomNo);
        this.setRoomType(roomType);
        this.setBtn(btn);
    }

    public RoomTm() {
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
}
