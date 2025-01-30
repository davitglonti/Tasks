

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    public static void printReversedList(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.insert(0, head.val);
            if (head.next != null) {
                sb.insert(0, "<-");
            }
            head = head.next;
        }
        System.out.println(sb);
    }

}
