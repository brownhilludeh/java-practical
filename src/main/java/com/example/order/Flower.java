package com.example.order;

import com.example.util.Utilities;

public class Flower {

    private String userChoice;
    private int computerChoiceInNumber;
    private String computerChoice;
    // private boolean hasWon;
    private boolean gameOver;
    // Options for RPS game
    public String[] options = { "Rock", "Paper", "Scissors" };

    public boolean gameOver() {
        if (userChoice.equalsIgnoreCase("r")) {
            System.out.println("game over");
        }
        return false;
    }

    public void getInfo() {
        do {
            userChoice = Utilities.getString("Choose \nR for Rock, \nP for Paper \nS for Scissor?");
            while (!(userChoice.equalsIgnoreCase("r") || userChoice.equalsIgnoreCase("p")
                    || userChoice.equalsIgnoreCase("s"))) {
                System.out.println("Invalid input");
                userChoice = Utilities.getString("Choose Rocket, Paper or Scissor?");
            }
            switch (userChoice.toUpperCase()) {
                case "R":
                    userChoice = "Rock";
                    break;
                case "P":
                    userChoice = "Paper";
                    break;
                case "S":
                    userChoice = "Scissor";
                    break;
                default:
                    break;
            }
            computerChoiceInNumber = Utilities.getRandom(1, 3);
            computerChoice = options[computerChoiceInNumber];
            System.out.println(computerChoice);
            // String options = ar[];
            System.out.println(userChoice);
        } while (gameOver);
    }

    // public boolean hasWon(){
    // if (computerChoice == 2) {
    // return true;
    // }
    // return hasWon;
    // }
    public void processing() {

    }

}
