public class MissingAar {
    public static void main(String[] args) {
        int[] a = { 1, 4, 2, 5, 1 };
        int n = a.length;
        int missing_number;
        int expected_sum = 0;
        int actual_sum = n * (n + 1) / 2;

        for (int i = 0; i <= a.length; i++) {
            expected_sum += i;
            System.out.println(expected_sum);
        }

    }
}
