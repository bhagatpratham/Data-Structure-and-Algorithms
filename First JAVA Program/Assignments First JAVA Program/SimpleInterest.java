package com.pratham;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Write a program to input principle,time and rate from user and find simple interest
        System.out.println("Let's calculate Simple Interest");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principle Amount: ");
        int principleAmount = input.nextInt();

        System.out.print("Enter duration for which the principal amount is given: ");
        float time = input.nextFloat();

        System.out.print("Enter the rate of interest on principal amount: ");
        float roi = input.nextFloat();

        float SI = principleAmount * roi * time;
        System.out.println("Simple Interest: " + SI);
    }
}
