import java.util.*;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = sc.nextInt();
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println("elements of array are " + data[i]);
        }
        sc.close();
    }
}
