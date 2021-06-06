/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Knudson
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        double weight, height,bmi;
        System.out.print("Enter your weight in pounds: ");
        weight = input.nextDouble();

        System.out.print("Enter your height in inches: ");
        height = input.nextDouble();

        bmi = (weight /(height*height)) * 703;

        System.out.printf("You BMI is %.1f.", bmi);
        if(bmi >= 18.5 && bmi <= 25)
            System.out.print("You are within the ideal weight range.");
        if(bmi > 25)
            System.out.print("You are overweight. You should see your doctor.");
        if(bmi <18.5)
            System.out.println("You are underweight. You should see your doctor.");
    }
}
