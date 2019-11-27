package leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class ConvertZ {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }


    private static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder result = new StringBuilder();
        int height = Math.min(s.length(), numRows);
        List<StringBuilder> list = new ArrayList<>();
        int direction = -1;
        int row = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < height) {
                list.add(new StringBuilder());
            }
            list.get(row).append(s.charAt(i));
            if (row == 0 || row == height - 1) {
                direction = (-direction);
            }
            row += direction;
        }
        for (StringBuilder stringBuilder : list) {
            result.append(stringBuilder);
        }
        return result.toString();
    }
}
