https://leetcode.com/problems/kth-smallest-element-in-a-bst
// Algo 1 : Recursive + Inorder : O(n) , O(n)
class Solution {
    private int k;
    private int index;
    private int[] nums;
    public int kthSmallest(TreeNode root, int k) {
        this.nums = new int[k]; this.k = k; this.index = 0;
        if(root == null) return 0;
        inorder(root);
        return nums[k-1];
    }
    private void inorder(TreeNode node) {
        if(node == null || index >= k) return;
        inorder(node.left);
        if(index < k) nums[index++] = node.val; // Mistake : if left subtree fills k slots then this line aagin we need to check index < k
        inorder(node.right);
    }
}
// Algo 2 : Iterative + Inorder : O(n) , O(n)
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        int index = 0 , kSmallest = 0;
        while(true) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(index++ == (k-1)) {
                kSmallest = root.val;
                break;
            }
            // if(root.right != null)
            root = root.right;
        }
        return kSmallest;
    }
}