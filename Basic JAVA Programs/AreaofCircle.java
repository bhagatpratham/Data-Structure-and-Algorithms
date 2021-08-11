package BasicJavaPrograms;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        double pi = 3.1415, area, radius;
        System.out.print("Enter radius of a circle: ");
        Scanner in = new Scanner(System.in);
        radius = in.nextDouble();
        area = pi * radius * radius;
        System.out.println("Area of circle is: " + area);
    }

}
