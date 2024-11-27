public class RemoveDuplicate {
    public static void main(String[] args) {
        int a[] = { 7, 7, 8, 9, 9, 9, 10, 10, 11, 12, 12, 12 };
        int[] temp = new int[12];
        temp[0] = a[0];
        int result = 1;
        for (int i = 1; i < a.length; i++) {
            if (temp[result - 1] != a[i]) {
                temp[result] = a[i];
                result++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            a[i] = temp[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println(result);
    }
}
