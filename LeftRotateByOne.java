public class LeftRotateByOne {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int n = a.length;
        int temp = a[0];
        for (int i = 1; i < n; i++) {
            a[i - 1] = a[i];
            a[n - 1] = temp;
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.println(a[i]);
        }
    }
}
