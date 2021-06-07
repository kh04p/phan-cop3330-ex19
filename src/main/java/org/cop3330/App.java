/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

import java.util.Scanner;

public class App 
{
    //check to see if String is numeric
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    public static void main( String[] args )
    {
        String user;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("What is your weight in pounds? ");
            user = input.nextLine();
        } while (!isNumeric(user));
        double weight = Double.parseDouble(user);
        do {
            System.out.print("what is your height in inches? ");
            user = input.nextLine();
        } while (!isNumeric(user));
        double height = Double.parseDouble(user);
        double output = bmi.calculate(weight, height);
        System.out.printf("Your BMI is %.1f%n", output);
        String statement = (output >= 18.5 && output <= 25) ? ("You're within the ideal BMI range.")
                : ("You should set up an appointment with your doctor.");
        System.out.println(statement);
    }
}
