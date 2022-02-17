https://leetcode.com/problems/combination-sum/
// Algo 1 : Backtracking : O(n ^(1 + (t/cmin))) , O(t/cmin) ... t = target, cmin = min value in candidate array 
class Solution {
    private List<List<Integer>> result;
    private int[] candidates;
    private int size;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        init(candidates);
        backtrack(target , new LinkedList<Integer>() , 0);
        return result;
    }
    private void init(int[] candidates) {
        this.candidates = candidates;
        this.size = candidates.length;
        this.result = new ArrayList<>();
    }
    private void backtrack(int remainingSum , LinkedList<Integer> combination , int startIndex) {
        if(remainingSum < 0) return; // Stop exploration
        else if(remainingSum == 0) {
            result.add(new ArrayList<>(combination)); // Note : added deep copy of linkedlist instead of original list
            return; // Note
        }
        for(int i = startIndex ; i < size ; i++) {
            combination.add(candidates[i]);  
            backtrack(remainingSum - candidates[i] , combination , i);
            combination.removeLast();   // Backtracking
        }
    }
}