class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;

        while (fast != null && fast.next != null) {
            temp = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        temp.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        return merge(left, right);
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode fakehead = new ListNode(0);
        ListNode current = fakehead;
        while (left != null && right != null) {
            if (left.val < right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }
        if (left == null) {
            current.next = right;
            right = right.next;
        } else {
            current.next = left;
            left = left.next;
        }
        return fakehead.next;
    }
}