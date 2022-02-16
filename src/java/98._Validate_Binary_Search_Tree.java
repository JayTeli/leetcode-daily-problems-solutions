https://leetcode.com/problems/validate-binary-search-tree
// Algo 1 : Recursion + Value-Range : O(n) , O(n)
class Solution {
    public boolean isValidBST(TreeNode root) {
        return validateBST(root , null , null); // Using null is more generic than using Integer.MIN_Value , Integer.MAX_VALUE
    }
    private boolean validateBST(TreeNode node , Integer lowerLimit , Integer upperLimit) { // Mistake : Integer and not int as we are passing null
        if(node == null) return true; // empty tree/subtree is valid
        if((lowerLimit != null && node.val <= lowerLimit)  || (upperLimit != null && node.val >= upperLimit)) { // outside range , Note : <= , Note : ||
            return false;
        }
        return validateBST(node.left , lowerLimit , node.val) && validateBST(node.right , node.val , upperLimit); // left && right subtree
    }
}
// Algo 2 : Iterative + Valid-Range + Stack : O(n) , O(n)
class Solution {
    private Stack<TreeNodeWithLimits> dfsStack;
    public boolean isValidBST(TreeNode root) {
        this.dfsStack = new Stack<>();
        pushToStack(root , null , null);
        while(!dfsStack.isEmpty()) {
            TreeNodeWithLimits top = dfsStack.pop();
            if(top.lowerLimit != null && top.node.val <= top.lowerLimit) return false;
            if(top.upperLimit != null && top.node.val >= top.upperLimit) return false;
            if(top.node.left != null) pushToStack(top.node.left , top.lowerLimit , top.node.val);
            if(top.node.right != null) pushToStack(top.node.right , top.node.val , top.upperLimit);
        }
        return true;
    }
    private void pushToStack(TreeNode root , Integer lowerLimit , Integer upperLimit) { // Mistake : Integer, not int
        dfsStack.push(new TreeNodeWithLimits(root , lowerLimit , upperLimit));
    }
    class TreeNodeWithLimits {
        public TreeNode node;
        public Integer lowerLimit;
        public Integer upperLimit;
        public TreeNodeWithLimits(TreeNode n , Integer l , Integer u) {
            this.node = n;
            this.lowerLimit  = l;
            this.upperLimit = u;
        }
    }
}
// Algo 3 : Recursion + Inorder : O(n) , O(n)
// Store PreviousNodeValue. For Inorder , currentNodeValue > preNodeValue , else false
class Solution {
    private Integer previousNodeValue = null;
    public boolean isValidBST(TreeNode root) {
        return inorder(root);
    }
    private boolean inorder(TreeNode node){
        if(node == null) return true;
        if(!inorder(node.left)) return false;
        if(previousNodeValue != null && node.val <= previousNodeValue) return false;
        previousNodeValue = node.val;
        return inorder(node.right);
    }
}
// Algo 4 : Iteration + Inorder : O(n) , O(n)
// Store PreviousNodeValue. For Inorder , currentNodeValue > preNodeValue , else false
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        Stack<TreeNode> s = new Stack<>();
        Integer previousNodeValue = null;
        while(!s.isEmpty() || root != null) {
            while(root != null) {
                s.push(root);       // push to stack
                root = root.left;   // move left
            }
            root = s.pop();     // root be stacktop (leftmost unvisited in inorder)
            if(previousNodeValue != null && root.val <= previousNodeValue) return false;
            previousNodeValue = root.val;
            root = root.right;  // Assign Right , even if null
        }
        return true;
    }
}