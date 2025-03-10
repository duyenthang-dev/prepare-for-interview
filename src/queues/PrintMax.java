package queues;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PrintMax {
    /**
     * The Idea is use queue to manage the potential values could be max for each subsequence.
     * The main problem is that how can we ensure the queue always in descending order.
     * If we solve this problem, we can easily peek the max value of every subsequence by peekFirst.
     * This leads to less complexity for entire solution. No need to loop thru the queue to find max value for each subsequece -> O(n ^ 2)
     * Just peek the first value -> O(n)
     */
    public List<Integer> printMax(int[] arr, int k) {
        List<Integer> result = new ArrayList<Integer>();
        int count = 0;
        int max = Integer.MIN_VALUE;
        Deque<Integer> q = new LinkedList<>();
    
        for (int i =0; i < arr.length; i++) {
            while (!q.isEmpty() && q.peekLast() < arr[i]) {
               q.pollLast(); 
            }
            q.addLast(arr[i]);
            count++;
            if (count == k) {
                max = q.peekFirst();
                result.add(max);
                if (arr[i - k + 1] == max) {
                    q.pollFirst();
                   
                } 
                count--;
            }            
        }
        return result;
    }
    public static void main(String[] args) {
        var sol = new PrintMax();
        int[] arr = new int[] {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(sol.printMax(arr, k));
    }
}
