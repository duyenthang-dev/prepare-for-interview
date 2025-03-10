package linklist;

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
       ListNode curr = head;
       while (curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            }
            else curr = curr.next;
       }
        return head;
    }


   public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        var sol = new DeleteDuplicates();
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(2);
        printList(sol.deleteDuplicates(head1));
        return;

    }
}
