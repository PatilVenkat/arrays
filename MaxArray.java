import java.util.*;

public class MaxArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = { 1, 4, 7, 8, 5, 2, 9, 6, 3 };
        int b = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b) {
                b = a[i];
            }
        }

        System.out.println("the maximum number in the array is " + b);
        sc.close();
    }
}
