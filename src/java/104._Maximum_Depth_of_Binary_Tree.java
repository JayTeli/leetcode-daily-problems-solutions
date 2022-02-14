https://leetcode.com/problems/maximum-depth-of-binary-tree
// Algo 1 : using two Stacks : O(n) , O(n)
class Solution {
    private LinkedList<TreeNode> stack;
    private LinkedList<Integer> depths;
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        stack = new LinkedList<>();
        depths = new LinkedList<>();
        updateNodeAndItsDepth(root , 1);
    
        int maxDepth = 0, stackTopDepth = 0; TreeNode stackTop = null;
        while(!stack.isEmpty()) {
          stackTop = stack.pollLast();
          stackTopDepth = depths.pollLast();
          if (stackTop != null) {
              maxDepth = Math.max(maxDepth, stackTopDepth);
            updateNodeAndItsDepth(stackTop.left , 1 + stackTopDepth);
            updateNodeAndItsDepth(stackTop.right, 1 + stackTopDepth);
          }
        }
        return maxDepth;
  }
    
  private void updateNodeAndItsDepth(TreeNode node , int depth) {
    stack.add(node);
    depths.add(depth);
  }
}