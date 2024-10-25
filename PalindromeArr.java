//import java.util.Arrays;

public class PalindromeArr {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 3, 2, 1 };
        int b[] = new int[6];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            b[j] = a[i];
            j++;
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (b[i] != a[i]) {
                System.out.println("not a palindrome");
                return;
            }
        }
        System.out.println("palindrome");
    }
}
