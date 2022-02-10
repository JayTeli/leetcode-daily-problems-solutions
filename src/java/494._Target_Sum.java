https://leetcode.com/problems/target-sum/
// Algo 1 : Backtracking/Brute-Force : O(2^n),O(n)
class Solution {
    private int[] nums;
    private int n;
    private int target;
    private int targetSumWays;
    public int findTargetSumWays(int[] nums, int target) {
        this.nums = nums; this.target = target; this.n = nums.length;
        backtrack(0 , 0);
        return targetSumWays;
    }
    private void backtrack(int startIndex , int prevSum) {
        if(startIndex == n) {   // Mistake : == n and not == n-1
            if(prevSum == target) targetSumWays++;
            return;
        }
        backtrack(1+startIndex, prevSum+nums[startIndex]);
        backtrack(1+startIndex, prevSum-nums[startIndex]);
    }
}

// Algo 2 : Top-Down DP with Memoization : O(n*offset) , O(n*offset)
class Solution {    
    private int[] nums;
    private int n;
    private int target;
    private int[][] dp;
    private int offset;
    public int findTargetSumWays(int[] nums, int target) {
        this.n = nums.length; this.nums = nums; this.target = target;
        int arraySum = Arrays.stream(nums).sum();
        this.offset = arraySum;
        init();
        findTargetSum(0 , 0);
        return dp[0][offset]; // Mistake : not dp[0][target + offset]; coz dp[0][prevSum + offset] = dp[0][0+offset] = dp[0][offset];
    }
    private int findTargetSum(int startIndex , int prevSum) {
        if(startIndex == n) {
            if(prevSum == target) return 1;
            else return 0;
        } else {
            if(dp[startIndex][prevSum + offset] != Integer.MIN_VALUE) 
                return dp[startIndex][prevSum + offset];
            
            int addResult = findTargetSum(1+startIndex , prevSum + nums[startIndex]);
            int subResult = findTargetSum(1+startIndex , prevSum - nums[startIndex]);
            
            dp[startIndex][prevSum + offset] = addResult + subResult;
            return dp[startIndex][prevSum + offset];  
        }
    }
    
    private void init() {
        dp = new int[n][2*offset+1]; // Mistake + Impt : not 2n+1 
        for(int[] row : dp) {
            Arrays.fill(row , Integer.MIN_VALUE);
        }
    }
}

// Algo 3 : Bottom Up Algo : O(n*offset) , O(n*offset)
public class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;

        int offset = Arrays.stream(nums).sum(); // Array Sum : offset is needed to convert -ve values of col to +ve
        if(Math.abs(target) > offset) return 0;

        int[][] dp = new int[n][2 * offset + 1];
        dp[0][nums[0] + offset] = 1;
        dp[0][-nums[0] + offset] += 1;
        
        int oldRow = 0 , oldCol = 0 , newRow = 0 , newCol1 = 0, newCol2 = 0;
        for (int i = 1; i < n; i++) {
            for (int sum = -offset; sum <= offset; sum++) {
                oldRow = i-1; oldCol = sum+offset;
                if (dp[oldRow][oldCol] > 0) {                    
                    newRow = i; newCol1 = oldCol+nums[i]; newCol2 = oldCol-nums[i];

                    dp[newRow][newCol1] += dp[oldRow][oldCol];
                    dp[newRow][newCol2] += dp[oldRow][oldCol];
                }
            }
        }       
        return dp[n-1][target + offset];
    }
}
// Algo 4 : 1D DP : O(n*offset) , O(offset)
public class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int offset = Arrays.stream(nums).sum();
        if(Math.abs(target) > offset) return 0;
        int[] dp = new int[2*offset+1];
        dp[nums[0] + offset] = 1;
        dp[-nums[0] + offset] += 1;
        
        int oldIndex = 0 , newIndex1 = 0 , newIndex2 = 0;
        for (int i = 1; i < nums.length; i++) {
            int[] nextRow = new int[2 * offset + 1];
            for (int sum = -offset; sum <= offset; sum++) {
                oldIndex = sum+offset;
                if (dp[oldIndex] > 0) {
                    newIndex1 = oldIndex + nums[i]; newIndex2 = oldIndex - nums[i];

                    nextRow[newIndex1] += dp[oldIndex];
                    nextRow[newIndex2] += dp[oldIndex];
                }
            }
            dp = nextRow;
        }
        
        return dp[target+offset];
    }
}