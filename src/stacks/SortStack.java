package stacks;

import java.util.Arrays;
import java.util.Stack;

public class SortStack {
    public static Stack<Integer> sortStack(Stack<Integer> input) {
        Stack<Integer> tmpStack = new Stack<Integer>();
        while (!input.isEmpty()) {
            var elm = input.pop();

            while (!tmpStack.isEmpty() && tmpStack.peek() >= elm) {
                int temp = tmpStack.pop();
                input.add(temp);
            }
            tmpStack.add(elm);
        }
        return tmpStack;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.addAll(Arrays.asList(5, 4, 3, 2, 1));
        System.out.println(sortStack(s));
    }
}
