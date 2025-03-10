package stacks;

import java.util.Stack;

public class DecimalToBinary {
    public String decimalToBinary(int num) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        while (num > 0) {
            int mod = num % 2;
            stack.add(mod);
            num = num / 2;
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        var sol = new DecimalToBinary();
        int num = 18;
        System.out.println(sol.decimalToBinary(num));
    }
}
