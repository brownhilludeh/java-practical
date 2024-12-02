package com.example.util;

import java.util.Random;
import java.util.Scanner;

/**
 * Has some useful methods to be used in my project
 * 
 * @author Brownhill U
 * @since Nov 30, 2024
 */
public class Utilities {

    private static Scanner scan = new Scanner(System.in);

    /**
     * Getting string input
     * 
     * @param String prompt
     * @return string
     * @author Brownhill U
     * @since Nov 30
     */
    public static String getString(String prompt) {
        System.out.println(prompt + ": ");
        String result = scan.nextLine();
        return result;
    }

    /**
     * 
     * @param Integer prompt
     * @return result
     * @author Brownhill U
     * @since Nov 30, 2024
     */
    public static int getInt(String prompt) {
        int result;
        while (true) {
            try {
                System.out.println(prompt);
                String inputString = scan.nextLine();
                result = Integer.parseInt(inputString);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer number.");
            }
        }
        return result;
    }

    /**
     * 
     * @param Float prompt
     * @return result
     * @author Brownhill U
     * @since Nov 30, 2024
     */
    public static float getFloat(String prompt) {
        float result;
        while (true) {
            try {
                System.out.println(prompt);
                String inputString = scan.nextLine();
                result = Float.parseFloat(inputString);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid float number.");
            }
        }
        return result;
    }

    /**
     * 
     * @param boolean prompt
     * @return result
     * @author Brownhill U
     * @since Nov 30, 2024
     */
    public static boolean getBoolean(String prompt) {
        // System.out.println(prompt);
        String inputString = getString(prompt + " Yes(y) or No(n)");
         
        while (!(inputString.equalsIgnoreCase("y") || inputString.equalsIgnoreCase("n")
                || inputString.equalsIgnoreCase("yes") || inputString.equalsIgnoreCase("no"))) {
            System.out.println("Invalid input.");
            inputString = getString(prompt + "Please enter [Yes or y] or [No or n]");
        }

        if (inputString.equalsIgnoreCase("y") || inputString.equalsIgnoreCase("Yes")) {
            return true;
        } else {
            return false;
        }
    }

    // public static String getRandom(String prompt){
    //     String inputString = Random.rand(1, 10);
    // }

    public static int getRandom(int min, int max) {
        Random rand = new Random();
        int theRandomNumber = rand.nextInt((max - min) + 1) + min;
        return theRandomNumber;
    }
}
