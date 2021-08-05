package com.company;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // System.in gets input from keyboard
        int rollno = input.nextInt();
        System.out.println("Your Roll no is: " + rollno);
    }
}
