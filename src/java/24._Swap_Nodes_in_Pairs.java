https://leetcode.com/problems/swap-nodes-in-pairs
// Algo 1 : Recursion : O(n) , O(n)
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode first = head;
        ListNode second = head.next;
        first.next = swapPairs(second.next);
        second.next = first;
        return second;
    }   
}
// Algo 2 : Iteration : O(n) , O(1)
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        while(head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;
            // swap
            prev.next = second;
            first.next = second.next;
            second.next = first;
            // update prev and head
            prev = first;
            head = first.next;   
        }
        return dummy.next;
    }
}