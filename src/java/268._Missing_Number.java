https://leetcode.com/problems/missing-number
// Algo 1 : HashSet : O(n) , O(n)
class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        for(int n : nums)
                visited.add(n);
        for(int i = 0 ; i <= nums.length ; i++) {
            if(!visited.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
// Algo 2 : Math (Sum of first n nos) : O(n) , O(1)
// Ans = sumOfFirstNNos - SumOfInputNos
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfFirstNNos = n*(n+1)/2 , sumOfInput = 0;
        for(int i = 0 ; i < n ; i++) {
            sumOfInput += nums[i];
        }
        return sumOfFirstNNos - sumOfInput;
    }
}
// Algo 3 : Bit Manipulation : O(n) , O(1)
// Since a^a=0 , init x = nums.length and x = x ^ (i ^ nums[i]) gives missing number
class Solution {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) 
                missing = missing ^ (i ^ nums[i]);
        return missing;
    }
}