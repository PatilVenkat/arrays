
//import java.util.Arrays;
import java.lang.String;

public class DuplicateArray {
    Boolean temp;

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 5, 4 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println("True");
                    return;
                }
            }
        }
        System.out.println("False");
        return;
    }
}
