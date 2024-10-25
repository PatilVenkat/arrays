public class Max_SubArray {
    public static void main(String[] args) {
        int current_sum = 0;
        int final_sum = 0;
        int[] a = { 1, 2, -4, -2, 6, -3, 8, 9 };
        for (int i = 0; i < a.length; i++) {
            current_sum = current_sum + a[i];
            if (current_sum > final_sum) {
                final_sum = current_sum;

            }
            if (current_sum < 0) {
                current_sum = 0;

            }
        }

        System.out.println(final_sum);

    }
}
