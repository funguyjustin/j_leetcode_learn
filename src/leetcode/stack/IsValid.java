package leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IsValid {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    private static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        char[] chars = s.toCharArray();
        Stack<Character> data = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ')' || chars[i] == ']' || chars[i] == '}') {
                if (data.isEmpty()) {
                    return false;
                } else if (data.peek().equals(map.get(chars[i]))) {
                    data.pop();
                } else{
                    return false;
                }
            } else {
                data.push(chars[i]);
            }
        }
        return data.isEmpty();
    }
}
