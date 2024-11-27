public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] a = { 1, 0, 4, 5, 0, 2, 6 };
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (a[j] != 0) {

                    }
                }
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
