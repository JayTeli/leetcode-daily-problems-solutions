https://leetcode.com/problems/merge-k-sorted-lists
// Algo 1 : Comparing heads Using Priority Queue : O(nlogk) , O(n)
class Solution {
    public ListNode mergeKLists(ListNode[] lists) { 
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(new SortByValue());
        for(ListNode list : lists){
            if(list!=null) pq.add(list);
        }
        ListNode dummyHead = new ListNode(0);
        ListNode node = dummyHead;
        while(!pq.isEmpty()){ 
            ListNode head = pq.poll();
            node.next = head; 
            node = head;
            if(head.next != null) pq.add(head.next);
        }
        return dummyHead.next;
    }

    class SortByValue implements Comparator<ListNode> {
        @Override
        public int compare(ListNode a , ListNode b) {
            return a.val-b.val;
        }
    }
}
// Algo 2 : Divide And Conquer : O(nlogk) , O(1)
class Solution {
    private ListNode[] lists;
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        this.lists = lists;
        return divideAndConquer(0 , lists.length-1);
    }
    
    private ListNode divideAndConquer(int low , int high) {
        if(low > high) return null;
        if(low == high) return lists[low];
        int mid = low + (high-low)/2; // left-leaning
        
        ListNode leftMerged = divideAndConquer(low , mid);
        ListNode rightMerged = divideAndConquer(mid+1 , high);
        return mergeTwoLists(leftMerged , rightMerged);
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode node = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        node.next = l1 != null ? l1 : l2;
        return dummyHead.next;
    }    
}