//import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        int reverse;
        int[] a = { 1, 2, 3, 4, 5, 6 };
        for (int i = a.length - 1; i >= 0; i--) {
            reverse = a[i];
            System.out.println(reverse);
        }

    }
}
