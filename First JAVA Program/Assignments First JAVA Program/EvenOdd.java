package com.pratham;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // Write a program to print whether the number is even or odd

        System.out.println("Let's find if the number is even or odd");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number entered is even number");
        } else {
            System.out.println("The number entered is odd number");
        }
    }
}
