package stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParatheses {

    public boolean isValid(String s) {
        Map<Character, Character> pair = new HashMap<>();
        pair.put(')', '(');
        pair.put(']', '[');
        pair.put('}', '{');
        
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' ||  c == '{') {
                stack.add(c);
            }
            else if (pair.get(c) != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        var sol = new BalancedParatheses();
        String s = "(]";
        System.out.println(sol.isValid(s));
    }
}