public class TwoDarray {
    public static void main(String[] args) {
        int[][] a = {
                { 4, 5, 6 },
                { 7, 8, 9, 6 },
                { 2 },
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }
    }
}
