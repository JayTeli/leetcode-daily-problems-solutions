https://leetcode.com/problems/combination-sum-ii/
// Algo 1 : Backtracking : O(2^n) , O(n)
// Only 4 difference from Combination Sum 1 problem's code : sorting , skip duplicates , 1+i, and TC,SC
class Solution {
    private List<List<Integer>> result;
    private int[] candidates;
    private int size;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        init(candidates);
        Arrays.sort(candidates);    // Sorting as we later skip duplicates
        backtrack(target , new LinkedList<Integer>() , 0);
        return result;
    }
    private void init(int[] candidates) {
        this.candidates = candidates;
        this.size = candidates.length;
        this.result = new ArrayList<>();
    }
    private void backtrack(int remainingSum , LinkedList<Integer> combination , int startIndex) {
        if(remainingSum == 0) result.add(new ArrayList<>(combination)); // Note : added deep copy of linkedlist instead of original list
        else if(remainingSum < 0) return; // Stop exploration
    
        for(int i = startIndex ; i < size ; i++) {
            if(i > startIndex && candidates[i-1] == candidates[i]) continue; // skip duplicates
            combination.add(candidates[i]);  
            backtrack(remainingSum - candidates[i] , combination , 1+i); // Note : 1+i
            combination.removeLast();   // Backtracking
        }
    }
}