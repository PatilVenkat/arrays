import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = { 9, 8, 7, 4, 5, 6 };
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                System.out.println("element found at index " + i);
            }

        }
        sc.close();
    }
}
