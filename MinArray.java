import java.util.*;

public class MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(" " + a[i]);
        }
        sc.close();
        for (int i = 0; i < a.length; i++) {
            if (a[i] < b) {
                b = a[i];
                System.out.println("Smallest number in the array is " + b);
            }
        }
    }
}
