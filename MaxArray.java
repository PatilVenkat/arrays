import java.util.*;

public class MaxArray {
    public static void main(String[] args) {
        int max = 0;
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("the maximum number in the array is " + max);
        sc.close();
    }
}
