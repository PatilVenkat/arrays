public class leftRotateByD {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int[] temp = new int[6];
        int d = 5;
        for (int i = 0; i < d; i++) {
            temp[i] = a[i];
        }
        for (int i = d; i < a.length; i++) {
            a[i - d] = a[i];
        }
        for (int i = 0; i < d; i++) {
            a[a.length - d + i] = temp[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
