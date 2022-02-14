https://leetcode.com/problems/maximum-width-of-binary-tree/
// Algo 1 : BFS : O(n) , O(n)
// If parentIndex = i , leftChildindex = 2i , rightChildIndex = 2i+1;
// WidthOfLevel = 1 + indexOfLevelTail - indexOfLevelHead
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null)    return 0;
        LinkedList<Pair<TreeNode,Integer>> q = new LinkedList<>();  // Pair(node,indexOfNode)
        q.add(new Pair<>(root , 0));
        
        int maxWidth = 0 , headIndex = 0 , tailIndex = 0;
        while(!q.isEmpty()) {
            headIndex = q.getFirst().getValue();
            tailIndex = q.getLast().getValue();
            maxWidth = Math.max(maxWidth , 1 + tailIndex - headIndex);
            
            int levelSize = q.size();
            for(int i = 0 ; i < levelSize ; i++) {
                Pair<TreeNode, Integer> temp = q.removeFirst();
                TreeNode node = temp.getKey();
                int nodeIndex = temp.getValue();
                if(node.left != null)
                    q.addLast(new Pair<>(node.left , 2*nodeIndex)); // If parentIndex = i , leftChildindex = 2i
                if(node.right != null)
                    q.addLast(new Pair<>(node.right , 2*nodeIndex + 1));// If parentIndex = i , rightChildIndex = 2i+1
            }
        }
        return maxWidth;
    }
}