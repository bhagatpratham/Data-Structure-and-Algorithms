package com.pratham;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        // Input a number and print all the factors of that number using loops

        System.out.println("Let's print the factors of a number");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.print("Factors of " + num + " are ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
