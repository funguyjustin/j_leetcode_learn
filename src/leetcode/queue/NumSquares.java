package leetcode.queue;


public class NumSquares {
    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }

    private static int numSquares(int n) {
        int[] ints = new int[n];
        for (int i = 1; i <= n; i++) {
            ints[i] = i;
            for (int j = 1; i - j * j >= 0; j++) {
                ints[i] = Math.min(ints[i], ints[i - j * j] + 1);
            }
        }
        return ints[n];
    }
}
