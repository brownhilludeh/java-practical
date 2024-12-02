package com.example;


import com.example.order.Flower;
import com.example.util.Utilities;

public class Main {

    public static String MENU = "Press one to play or 0 to end";

    public static void main(String[] args) {

        Flower flower = new Flower();

        System.out.println("Welcome to The Ultimate Rock, Paper, Scissor game!");
        int menu = Utilities.getInt(MENU);

        while (menu < 0 || menu > 1) {
            System.out.println("Invalid input");
            menu = Utilities.getInt(MENU);
        }

        switch (menu) {
            case 0:
                flower.gameOver();
                break;
            case 1:
                flower.getInfo();
                break;
            default:
                break;
        }
    }
}