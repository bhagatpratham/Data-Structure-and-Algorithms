package com.pratham;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        // Take name as an input and print a greeting message for that name

        System.out.println("Enter your Name: ");
        Scanner input = new Scanner(System.in);

        String name = input.next();
        System.out.print("Namaste/Hello " + name);
    }
}
