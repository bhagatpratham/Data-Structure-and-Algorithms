package com.pratham;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Let's print the largest number");

        Scanner input = new Scanner(System.in);

        // accept two numbers -> print the largest

        System.out.print("Enter first number: ");
        float num1 = input.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("The largest number is: " + num1);
        } else if (num1 == num2) {
            System.out.println("Given numbers are same");
        } else {
            System.out.println("The largest number is: " + num2);
        }
    }
}
