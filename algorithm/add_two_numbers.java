/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Fake head that will be discarded later
        ListNode dummy_head = new ListNode(0);
        ListNode l3 = dummy_head;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int val1 = (l1 == null) ? 0 : l1.val;
            int val2 = (l2 == null) ? 0 : l2.val;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int digit = sum % 10;
            l3.next = new ListNode(digit);
            l3 = l3.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (carry > 0) {
            l3.next = new ListNode(carry);
        }
        ListNode real_head = dummy_head.next;
        return real_head;
    }
}