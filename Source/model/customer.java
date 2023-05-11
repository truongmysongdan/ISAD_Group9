/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Tung Le
 */
public class customer {
    private int cusID;
    private String Name;
    private String Email;
    private String Address;
    private String Phone;
    private String Type;

    public customer(int cusID, String Name, String Email, String Address, String Phone, String Type) {
        this.cusID = cusID;
        this.Name = Name;
        this.Email = Email;
        this.Address = Address;
        this.Phone = Phone;
        this.Type = Type;
    }

    public customer() {
    }

    public int getCusID() {
        return cusID;
    }

    public void setCusID(int cusID) {
        this.cusID = cusID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getType() {
        return Type;
    }

    @Override
    public String toString() {
        return "customer{" + "cusID=" + cusID + ", Name=" + Name + ", Email=" + Email + ", Address=" + Address + ", Phone=" + Phone + ", Type=" + Type + '}';
    }

    public void setType(String Type) {
        this.Type = Type;
    }
}
