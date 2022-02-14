https://leetcode.com/problems/binary-tree-maximum-path-sum/
// Algo 1 : Recursion : O(n) , O(h)
// 1. leftGain = Math.max(0 , calcMaxGain(node.left)); slly rightGain;
// 2. gain for Node = node.val + Math.max(leftGain, rightGain);
// 3. newPathGain = leftGain + node.val + rightGain; 
// 4. maxSum = Math.max(maxSum , newPathGain);
class Solution {
    private int maxSum = Integer.MIN_VALUE; // Mistake : if not int then wrong ans
    public int maxPathSum(TreeNode root) {
        calcMaxGain(root);
        return maxSum;
    }
    private int calcMaxGain(TreeNode node) {
        if(node == null) return 0;
        int leftGain = Math.max(0 , calcMaxGain(node.left));
        int rightGain = Math.max(0 , calcMaxGain(node.right));
        int newPathGain = leftGain + node.val + rightGain;
        maxSum = Math.max(maxSum , newPathGain);
        return node.val + Math.max(leftGain, rightGain);
    }
}