https://leetcode.com/problems/all-possible-full-binary-trees/
// Algo 1 : Recursion with Memoization : O(2^n) ,O(2^n)
// 1. Each node in Full BT has either 0 or 2 children.
// 2. Full BT cannot have even no of nodes. coz root+evenchild = odd.
// 3. Each child node is FBT.
// 4. if left has l nodes , right has n-l-1 nodes.
class Solution {
    private Map<Integer , List<TreeNode>> memo = new HashMap<>();
    public List<TreeNode> allPossibleFBT(int n) {
        if(memo.containsKey(n)) return memo.get(n);
        List<TreeNode> fbt = new LinkedList<>();
        if(n == 1) {
            fbt.add(new TreeNode(0));
        } else if(n%2 == 1) { // Coz FBT can have only odd#nodes.
            for(int left = 0 ; left < n ; left++) {
                int right = n-left-1; 
                for(TreeNode l : allPossibleFBT(left)) {
                    for(TreeNode r : allPossibleFBT(right)) {
                        TreeNode root = new TreeNode(0);
                        root.left = l;
                        root.right = r;
                        fbt.add(root);
                    }
                }
            }             
        }
        memo.put(n , fbt);
        return fbt;
    }
}