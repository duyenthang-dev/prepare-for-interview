package linklist;

public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev; 
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        var sol = new ReverseList();
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(5);
        head1.next.next = new ListNode(2);
        printList(sol.reverseList(head1)); // Expected Output: 2 5 3

    }
}
