package ConditionalandLoops;

import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {

        // Fibonacci numbers : 0,1,1,2,3,5,8,13....,n
        // (basically adding sum of last two numbers to the list)

        // Q: Write a program to print nth Fibonacci number

        System.out.println("Let's print the fibonacci numbers");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a; // b is being updated to the next number we have added
            a = temp; // a is being updated to b
            count++;
        }
        System.out.println(b);
    }
}
