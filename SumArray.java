public class SumArray {
    public static void main(String[] args) {
        int[] a = { 1, 4, 2, 5, 1 };
        int sum = 0;
        for (int i = 0; i <= a.length; i++) {
            sum = sum + i;
            System.out.println(sum);
        }

    }
}
