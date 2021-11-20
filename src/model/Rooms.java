package model;

public class Rooms {
    private String roomNumber;
    private String roomType;

    public Rooms(String roomNumber, String roomType) {
        this.setRoomNumber(roomNumber);
        this.setRoomType(roomType);
    }

    public Rooms() {
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
}
