package leetcode.string;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("justsulkj"));
    }

    private static String longestPalindrome(String s) {
        int length = s.length();
        if (s.length() <= 0) {
            return "";
        }
        int l = 0;
        int h = 0;
        for (int i = 0; i < length; i++) {
            int a = getRound(s, i, i);
            int b = getRound(s, i, i + 1);
            int round = Math.max(a, b);
            if (round > h - l) {
                l = i - (round - 1) / 2;
                h = i + round / 2;
            }
        }
        return s.substring(l, h + 1);
    }

    private static int getRound(String s, int i, int j) {
        while ((i >= 0) && (j < s.length()) && (s.charAt(i) == s.charAt(j))) {
            i--;
            j++;
        }
        return j - i - 1;
    }

}
