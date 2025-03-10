package linklist;
/**
 * with linklist problem, we usually use 2 more node to manage link among nodes. (prev, next)
 */
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        int idx = 0;
        ListNode curr = head;
        ListNode prev = head;
        while (curr != null) {
            ListNode next = curr.next;
            if (next == null) {
                break;
            }
            curr = next.next;
            next.next = prev;
            if (idx == 0) {
                head = next;
                idx++;
            }

            if (curr != null) {
                if (curr.next != null)
                    prev.next = curr.next;
                else prev.next = curr;
            }
            else prev.next = null;
            prev = curr;

        }
        return head;
    }

    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        var sol = new SwapPairs();
        ListNode head1 = new ListNode(1);

        head1.next = new ListNode(2);
        // head1.next.next = new ListNode(3);
        // head1.next.next.next = new ListNode(4);
        // head1.next.next.next.next = new ListNode(5);
        sol.printList(sol.swapPairs(head1));
    }
}
