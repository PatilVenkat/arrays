public class MultiplyArr {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int b = 1;
        int c = 1;
        for (int i = 1; i < a.length; i++) {
            b = b * a[i];
        }
        System.out.println(b);
        for (int i = 0; i < a.length; i++) {
            c = b / a[i];
            System.out.println(c);
        }

    }
}
