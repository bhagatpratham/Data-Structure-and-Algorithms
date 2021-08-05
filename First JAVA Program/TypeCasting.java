package com.company;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        // gives error if we give float value
//       int nums = input.nextInt();
//       System.out.println(nums);
//
//        // automatically converts int to float
//       float num = input.nextFloat();
//       System.out.println(num);
//
//        // float > int
//
//        // TYPE CASTING
//        int num = (int)(67.35f);
//        System.out.println(num); // output: 67
//
//        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); // byte has maximum range 256 so it does 257 % 256 which is 1
//        System.out.println(b); // output: 1

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50_000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " " + (i / c)  + " " + (d * s));
        System.out.println(result);
    }
}
