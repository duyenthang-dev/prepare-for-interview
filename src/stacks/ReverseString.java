package stacks;

import java.util.Stack;

public class ReverseString {
    public String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            stack.add(c);
        }
        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "Hello, World!";
        var sol = new ReverseString();
        System.out.println(sol.reverseString(s));
    }
}
