package BasicJavaPrograms;

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        // Area of triangle = 1/2 * base * height
        Scanner in = new Scanner(System.in);

        System.out.print("Enter base of triangle: ");
        double base = in.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = in.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of triangle is: " + area);
    }
}
