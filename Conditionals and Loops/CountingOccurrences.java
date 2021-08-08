package ConditionalandLoops;

public class CountingOccurrences {
    public static void main(String[] args) {
        /*
             Counting Occurrences
              n = 0,1,5,6,7,9,7,4,7
              how many times 7 is repeated
              answer: 3
        */

        int n = 3356783;

        int count = 0;
        while (n > 0) {
            int rem = n % 10; // gives last digit from n
            if (rem == 3){
                count++;
            }
            n = n / 10;
        }
        System.out.println("Number of 3's in 3356783 are " + count);
    }
}
