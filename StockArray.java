public class StockArray {
    public static void main(String[] args) {
        int[] a = { 7, 8, 9, 4, 5, 6, 1, 2, 3 };
        int min = 0;
        int max = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                min = a[i];
                // max = a[i];

            }
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                // min = a[i];
                max = a[i];

            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
