https://leetcode.com/problems/same-tree
// Algo 1 : Recursion : O(n) , O(n)
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.left , q.left) && isSameTree(p.right , q.right);
    }
}
// Algo 2 : Using two Deque : O(n) , O(n)
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true; // Mistake : for [],[] case.. 
        if(!compareNodes(p,q)) return false;
        ArrayDeque<TreeNode> pDeque = new ArrayDeque<>();
        ArrayDeque<TreeNode> qDeque = new ArrayDeque<>();
        pDeque.addLast(p);
        qDeque.addLast(q);
        
        while(!pDeque.isEmpty() || !qDeque.isEmpty()) {
            p = !pDeque.isEmpty() ? pDeque.getFirst() : null;
            q = !qDeque.isEmpty() ? qDeque.getFirst() : null;
            
            if(!compareNodes(p,q)) return false;
            if(!compareNodes(p.left,q.left)) return false;
            if(!compareNodes(p.right,q.right)) return false;
            
            if(p.left != null || q.left != null) {
                pDeque.addLast(p.left);
                qDeque.addLast(q.left);
            }
            if(p.right != null || q.right != null) {
                pDeque.addLast(p.right);
                qDeque.addLast(q.right);
            }
            
            p = pDeque.removeFirst();
            q = qDeque.removeFirst();
        }
        return true;
    }
    private boolean compareNodes(TreeNode p , TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return true;
    }
}