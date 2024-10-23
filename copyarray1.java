import java.util.Arrays;

public class copyarray1 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int[] b = new int[6];
        int[] c = new int[a.length];
        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println(Arrays.toString(b));
        System.arraycopy(a, 2, c, 1, 2);
        System.out.println(Arrays.toString(c));
    }
}
