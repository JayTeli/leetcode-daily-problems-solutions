https://leetcode.com/problems/longest-increasing-subsequence/
// Algo 1 : Top-Down Dp : O(n^2) , O(n)
class Solution {
    private int[] nums;
    private int n;
    private int[] dp;
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 1) return 1;
        init(nums);
        int longestLIS = 1;
        for(int startIndex = 0 ; startIndex < n ; ++startIndex) {
            longestLIS = Math.max(longestLIS , getLisStartingAtIndex(startIndex));
        }
        return longestLIS;
    }
    private void init(int[] nums) {
        this.nums = nums;
        this.n = nums.length;
        this.dp = new int[n];
        Arrays.fill(this.dp , Integer.MIN_VALUE);
    }
    private int getLisStartingAtIndex(int startIndex) {
        if(dp[startIndex] != Integer.MIN_VALUE) return dp[startIndex];
        int longest = 1 , nextLis = 1;
        for(int j = 1+startIndex ; j < n ; j++) {
            if(nums[j] > nums[startIndex]) {
                dp[j] = getLisStartingAtIndex(j);
                longest = Math.max(longest , 1 + dp[j]); // Note 1+
            }
        }       
        dp[startIndex] = longest;
        return dp[startIndex];
    } 
} 
// Algo 2 : Bottom-Up DP : O(n^2) , O(n)
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;
        int[] dp = new int[n];
        Arrays.fill(dp , 1);    // Fill with 1 instead of Integer.MIN_VALUE
        for(int i = n-2 ; i >= 0 ; i--) { // Mistake : Call for each i as starting point and update longesLIS 
            for(int j = i+1 ; j < n ; j++) {
                if(nums[j] > nums[i]) {
                    dp[i] = Math.max(dp[i] , 1 + dp[j]);
                }
            }
        }
        int longestLIS = 1;
        for(int x : dp) {
            longestLIS = Math.max(longestLIS , x);
        }
        return longestLIS;
    }
}
// Algo 3 : Binary Search : O(nlogn) , O(n)
// 1. We can build increasing subsequence and return its size.
// 2. subsequence : insert 1st element , iterate thru remaining
// 3. in iteration , if new element > last element , add new element to list
// 4. in iteration , if new element <= last element , using Binary search , find insert index and override that index value in list.
class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            int target = nums[i] , lastElementInList = ans.get(ans.size() - 1);
            if (target > lastElementInList) {
                ans.add(target);
            } else {
                int overrideIndex = binarySearch(ans, target);
                ans.set(overrideIndex, target);
            }
        }
        return ans.size();
    }
    private int binarySearch(ArrayList<Integer> sub, int target) {
        int left = 0 , right = sub.size() - 1 , midIndex = 0 , midValue = 0;
        while (left <= right) { // Note : <=
            midIndex = left + (right-left) / 2;
            midValue = sub.get(midIndex);
            if (midValue == target) return midIndex;
            if (midValue < target) left = midIndex + 1;
            else right = midIndex-1;
        }        
        return left;
    }
}