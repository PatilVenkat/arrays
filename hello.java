public class hello {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 3, 2, 1 };
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = a.length - 1; j >= 0;) {
                if (a[i] == a[j]) {
                    System.out.println("palindrome");
                    return;
                } else {
                    System.out.println("not palindrome");
                    return;
                }
            }
        }

    }
}
