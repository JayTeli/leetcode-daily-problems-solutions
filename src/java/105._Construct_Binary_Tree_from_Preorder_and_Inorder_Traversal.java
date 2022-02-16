https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
// Algo 1 : Recursion : O(n) , O(n)
// 1. Preorder : Root->Left->Right , Inorder : Left->Root->Right
// 2. Preorder tells Root via its first element
// 3. Inorder tell left subtree of root and right subtree of root
// 4. preorderIndex variable and inorderIndexMap , we recurse over preorder element 
class Solution {
    private int[] preorder;
    private int preorderIndex;
    private Map<Integer , Integer> inorderIndexMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        init(preorder , inorder);
        TreeNode root = buildTreeRecursive(0,preorder.length-1);
        return root;
    }
    private void init(int[] preorder , int[] inorder) {
        this.preorder = preorder;
        this.preorderIndex = 0;
        this.inorderIndexMap = new HashMap<>();
        for(int i = 0 ; i < inorder.length ; i++) {
            this.inorderIndexMap.put(inorder[i] , i);
        }
    }
    private TreeNode buildTreeRecursive(int preorderStartIndex , int preorderEndIndex) {
        if(preorderStartIndex > preorderEndIndex) return null;
        // Root
        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);
        int rootIndexInInorder = inorderIndexMap.get(rootValue);    // Index of Root in inorder
        // Left Subtree of Root
        int leftSubtreeStartIndex = preorderStartIndex;
        int leftSubtreeEndIndex = rootIndexInInorder - 1;           // End of Left Subtree using inorder
        root.left = buildTreeRecursive(leftSubtreeStartIndex , leftSubtreeEndIndex);
        // Right Subtree of Root
        int rightSubtreeStartIndex = rootIndexInInorder + 1;        // Start of Right Subtree using inorder
        int rightSubtreeEndIndex = preorderEndIndex;
        root.right = buildTreeRecursive(rightSubtreeStartIndex , rightSubtreeEndIndex);
        // Return root
        return root;
        
    }
}