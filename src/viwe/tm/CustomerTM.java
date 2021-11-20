package viwe.tm;

import javafx.scene.control.Button;


public class CustomerTM {
    private String name;
    private String address;
    private String telephoneNumber;
    private String nicNumber;
    private String Email;
    private String mealItem;
    private Button btn;
    private Button btnPrint;


    public CustomerTM(String name, String address, String telephoneNumber, String nicNumber, String Email, String mealItem, Button btn,Button btnPrint) {
        this.setName(name);
        this.setAddress(address);
        this.setTelephoneNumber(telephoneNumber);
        this.setNicNumber(nicNumber);
        this.setEmail(Email);
        this.setMealItem(mealItem);
        this.setBtn(btn);
        this.setBtnPrint(btnPrint);
    }



    public CustomerTM() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getNicNumber() {
        return nicNumber;
    }

    public void setNicNumber(String nicNumber) {
        this.nicNumber = nicNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMealItem() {
        return mealItem;
    }

    public void setMealItem(String mealItem) {
        this.mealItem = mealItem;
    }



    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
    public Button getBtnPrint() {
        return btnPrint;
    }
    private void setBtnPrint(Button btnPrint) {
        this.btnPrint=btnPrint;
    }
}
