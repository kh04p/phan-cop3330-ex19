/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

public class bmi {
    public static double calculate(double weight, double height) {
        return (weight / (height * height)) * 703;
    }
}
