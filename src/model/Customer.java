package model;

import javafx.scene.control.Button;



public class Customer {
    private String name;
    private String address;
    private String telephoneNumber;
    private String nicNumber;
    private String Email;
    private String mealItem;


    public Customer(String name, String address, String telephoneNumber, String nicNumber, String email, String mealItem) {
        this.setName(name);
        this.setAddress(address);
        this.setTelephoneNumber(telephoneNumber);
        this.setNicNumber(nicNumber);
        this.setEmail(email);
        this.setMealItem(mealItem);

    }

    public Customer(String name, String address, String telephoneNumber, String nicNumber, String email, String mealItem, String date, String time, Button btn) {
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

    public void setEmail(String eMail) {
        this.Email = eMail;
    }

    public String getMealItem() {
        return mealItem;
    }

    public void setMealItem(String mealItem) {
        this.mealItem = mealItem;
    }


}
