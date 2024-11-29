package com.example.order;

import com.example.util.Utilities;

public class Flower {

    protected int number;
    private float floatNumber;

    public void getInfo(){
        System.out.println("who is me?");
        number = Utilities.getInt("Enter any number");
        floatNumber = Utilities.getFloat("Enter a deciamla place number.");
    }

    public void name() {
        
    }
}
