//import java.util.*;
public class insertArray {

    public static void main(String[] args) {

        int[] a = new int[6];
        int pos = 2;
        // int n = a.length;
        int index = pos - 1;
        a[0] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 5;
        for (int i = a.length - 1; i > index; i--) {
            a[i] = a[i - 1];
        }
        a[pos - 1] = 100;
        for (int i = 0; i <= a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
