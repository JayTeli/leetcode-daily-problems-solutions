https://leetcode.com/problems/k-diff-pairs-in-an-array
// Algo 1 : Sorting + Two Pointer : O(nlogn) , O(n)
// 1. Sort so that two pointer is efficient to find unique pairs
// 2. if diff == k then ++uniquePairs and left = skipLeftDuplicateNeighbours(left , nums);else if(diff < k) ++right;else ++left;if(left == right) ++right;
class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums.length < 2) return 0;
        Arrays.sort(nums);  // Sort so that two pointer is efficient to find unique pairs
        int left = 0 , right = 1 , n = nums.length , diff = 0 , uniquePairs = 0; // init right = 1 and not 0 , as we need pairs
        while(left < n && right < n) {
            diff = nums[right] - nums[left];
            if(diff == k) {
                ++uniquePairs;
                left = skipLeftDuplicateNeighbours(left , nums); // Impt
            } else if(diff < k) ++right;
            else ++left;
            if(left == right) ++right; // Impt
        }
        return uniquePairs;
    }
    private int skipLeftDuplicateNeighbours(int left , int[] nums) {
        left++;
        while(left < nums.length && nums[left-1] == nums[left]) {
            left++;
        }
        return left;
    }
}
// Algo 2 : Without Sorting using HashMap : O(n) , O(n)
// 1. get freq of all numbers
// 2. Iterate over map , if k == 0 and value >= 2 , ++uniquePairs; 
// 3. if k > 0 and for current key x , mapContainsKey(x+k) then ++uniquePairs
class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums.length < 2) return 0;
        Map<Integer , Integer> freq = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++) {
            freq.put(nums[i] , 1+freq.getOrDefault(nums[i] , 0));
        }
        int uniquePairs = 0;
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()) {
            int key = entry.getKey() , value = entry.getValue();
            if(k > 0 && freq.containsKey(key+k)) { // x is complement of x+k to get diff k
                ++uniquePairs;
            } else if(k == 0 && value >= 2) {    // Mistake : value >= 2 and not 0 as we need pair
                ++uniquePairs;
            }
        }
        return uniquePairs;
    }
}