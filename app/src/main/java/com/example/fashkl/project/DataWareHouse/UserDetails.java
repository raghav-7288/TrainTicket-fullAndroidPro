package com.example.fashkl.project.DataWareHouse;

import java.io.Serializable;
public class UserDetails implements Serializable{
    private int userID;



    private String password;
    private String name;
    private String address;
    private int age;
    private double mobileNo;
    private double Balance;

    public UserDetails() {

    }

    public UserDetails(int userID,String password, String name, String address, int age, double mobileNo, double balance) {
        this.userID = userID;
        this.password=password;
        this.name = name;
        this.address = address;
        this.age = age;
        this.mobileNo = mobileNo;
        this.Balance = balance;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMobileNo(double mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getMobileNo() {
        return mobileNo;
    }

    public double getBalance() {
        return Balance;
    }

    public int getAge() {
        return age;
    }
}
