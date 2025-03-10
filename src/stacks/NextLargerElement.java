package stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NextLargerElement {
    
    public List<Integer> nextLargerElement(List<Integer> arr) {
        List<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int n = arr.size();
        for (int i = n - 1; i >=0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr.get(i)) {
                stack.pop();
            }
            res.set(i, stack.isEmpty() ? -1 : stack.peek());
            stack.add(res.get(i));
        }
        return res;
    }
    public static void main(String[] args) {
        var sol = new NextLargerElement();
        var arr = Arrays.asList(4, 5, 2, 25);
        System.out.println(sol.nextLargerElement(arr));

    }
}
