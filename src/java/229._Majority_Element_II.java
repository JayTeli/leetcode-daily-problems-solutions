https://leetcode.com/problems/majority-element-ii/
// Algo 1: Boyer-Moore Voting Algorithm : O(n) , O(1)
// 1. There can be at most one majority element which is more than ⌊n/2⌋ times
// 2. There can be at most two majority elements which are more than ⌊n/3⌋ times
// 3. There can be at most three majority elements which are more than ⌊n/4⌋ times
// 4. we need second pass since your array can have no majority elements at all.
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0 , count2 = 0;
        Integer candidate1 = null , candidate2 = null;
        for(int n : nums) {
            if(candidate1 != null && candidate1 == n) {
                ++count1;
            } else if(candidate2 != null && candidate2 == n) {
                ++count2;
            } else if(count1 == 0) {
                candidate1 = n;
                ++count1;
            } else if(count2 == 0) {
                candidate2 = n;
                ++count2;
            } else {
                --count1;
                --count2;
            }
        }
        count1 = 0; count2 = 0;
        for(int n : nums) {
            if(candidate1 != null && n == candidate1)
                ++count1;
            if(candidate2 != null && n == candidate2)
                ++count2;
        }
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        if(count1 > n/3)
            result.add(candidate1);
        if(count2 > n/3)
            result.add(candidate2);
        return result;
    }
}