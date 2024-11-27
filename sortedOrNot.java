public class sortedOrNot {
    public static void main(String[] args) {
        boolean flag = true;
        int[] a = { 1, 2, 3, 4, 5, 6, 1 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i])
                    flag = false;
            }
        }
        System.out.println(flag);
    }
}