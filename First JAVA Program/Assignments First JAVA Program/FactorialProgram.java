package com.pratham;

import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {

        // Write a program to print factorial of a number also take input
        System.out.println("Let's print the factorial of a number");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = input.nextInt();
        int factorial = 1;

       for (int i = 1; i <= num; i++) {
           factorial = factorial * i;
       }
        System.out.println("Factorial of a number " + num + " is " + factorial);
    }
}
