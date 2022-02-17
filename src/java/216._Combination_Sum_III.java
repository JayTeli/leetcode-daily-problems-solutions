https://leetcode.com/problems/combination-sum-iii/
// Algo 1 : Backtracking : O(2^n) , O(n)
// Changes to combination sum part 1 and 2 are :
// 1. Extra stop exploration condition : if(combination.size() > k) return; // Stop exploration
// 2. combination.size() == k condition also needs to be checked before deep copy into result.
// 3. Fill candidate array from 1 to 9 in init
class Solution {
    private List<List<Integer>> result;
    private int[] candidates;
    private int size;
    private int k;
    public List<List<Integer>> combinationSum3(int k, int target) {
        init(k);
        backtrack(target , new LinkedList<Integer>() , 0);
        return result;
    }
    private void init(int k) {
        this.candidates = new int[9];
        for(int i = 0 ; i < 9 ; i++) {
            this.candidates[i] = i+1;
        }
        this.k = k;
        this.size = candidates.length;
        this.result = new ArrayList<>();
    }
    private void backtrack(int remainingSum , LinkedList<Integer> combination , int startIndex) {
        if(combination.size() == k && remainingSum == 0) result.add(new ArrayList<>(combination)); // Note : added deep copy of linkedlist instead of original list
        else if(remainingSum < 0) return; // Stop exploration
        else if(combination.size() > k) return; // Stop exploration
    
        for(int i = startIndex ; i < size ; i++) {
            combination.add(candidates[i]);  
            backtrack(remainingSum - candidates[i] , combination , 1+i); // Note : 1+i
            combination.removeLast();   // Backtracking    
        }
    }
}