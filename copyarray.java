import java.util.Arrays;

public class copyarray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int[] b = new int[6];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println(Arrays.toString(b));
        System.out.println(b);
    }
}
