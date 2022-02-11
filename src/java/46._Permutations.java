https://leetcode.com/problems/permutations/
// Algo 1 : Backtracking : O(Summation of p(n,k) for k = 1 to n) , O(n!) .. p(n,k) = n! / (n-r)!
class Solution {
    private int n;
    private List<List<Integer>> output; 
    public List<List<Integer>> permute(int[] nums) {
        this.output = new LinkedList<>(); this.n = nums.length;
        ArrayList<Integer> numsList = arrayToList(nums);
        backtrack(0 , numsList);
        return output;
    }
    private ArrayList<Integer> arrayToList(int[] nums) {
        ArrayList<Integer> list= new ArrayList<>();
        for(int n : nums)
            list.add(n);
        return list;
    }
    private void backtrack(int first , ArrayList<Integer> nums) {
        if(first == n) 
            output.add(new ArrayList<Integer>(nums));
        for(int i = first ; i < n ; i++) {
            Collections.swap(nums , first , i); // swap ith and first index
            backtrack(1+first , nums);
            Collections.swap(nums , first , i); // Backtrack : swap ith and first index
        }
        
    }
}