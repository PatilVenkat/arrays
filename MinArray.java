import java.util.*;

public class MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = { 2, 5, 6, 3, 1, -4, -8, -2, -9 };
        int b = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < b) {
                b = a[i];

            }
        }
        System.out.println("Smallest number in the array is " + b);
        sc.close();
    }
}
