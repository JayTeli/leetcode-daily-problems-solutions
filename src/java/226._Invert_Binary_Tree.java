https://leetcode.com/problems/invert-binary-tree/
// Algo 1 : Recursive : O(n) , O(n)
// Invert subtree via recursion and then update left right ptrs.
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        // First invert the subtrees
        TreeNode leftInverted = invertTree(root.left);
        TreeNode rightInverted = invertTree(root.right);
        // point to invertedSubtrees
        root.left = rightInverted;
        root.right = leftInverted;
        return root;
    }
}
// Algo 2 : BFS : O(n) , O(n)
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        Queue<TreeNode> bfsQueue = new LinkedList<>();
        bfsQueue.add(root);
        while(!bfsQueue.isEmpty()) {
            TreeNode head = bfsQueue.poll();
            // Swap left , right pointers of head
            TreeNode temp = head.left;
            head.left = head.right;
            head.right = temp;
            // if not empty , push left right nodes to queue
            if(head.left != null)
                bfsQueue.add(head.left);
            if(head.right != null)
                bfsQueue.add(head.right);
        }
        return root;
    }
}