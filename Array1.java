public class Array1 {
    public static void main(String[] rags) {
        int[] numbers = { 0, 4, 5, 8, 7, 9, 5, -8, 6, 3, -2 };
        int sum = 0;
        Double average;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

        }
        average = ((double) sum / (double) numbers.length);
        System.out.println("sum of numbers is " + sum);
        System.out.println("average of numbers is " + average);

    }
}
