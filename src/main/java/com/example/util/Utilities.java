package com.example.util;

import java.text.NumberFormat;
import java.util.Scanner;

import javax.print.DocFlavor.READER;
import javax.sound.sampled.FloatControl;

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
     * @since Nov 30
     */
    public static int getInt(String prompt) {
        // String inputString = getString(prompt);
        // int result = Integer.parseInt(inputString);
        // return result;
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
}
