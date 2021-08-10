package Methods;

import java.util.Arrays;

public class vargs {
    public static void main(String[] args) {
        fun(1,4,5,6,6,6);
        multiple(3, 4, "Pratham");
    }

    static void multiple(int a, int b, String ...v) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
