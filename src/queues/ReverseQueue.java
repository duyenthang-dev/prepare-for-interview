package queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReverseQueue {
    
    public Queue<Integer> reverseQueue(Queue<Integer> q) {
        Deque<Integer> res = new ArrayDeque<>();
        while (!q.isEmpty()) {
            res.addFirst(q.remove());
        }
        return res;
    }
    public static void main(String[] args) {
        var sol = new ReverseQueue();
        Queue<Integer> q = new LinkedList<>();
        q.addAll(List.of(1, 2, 3, 4, 5));
        System.out.println(sol.reverseQueue(q));
    }
    
}
