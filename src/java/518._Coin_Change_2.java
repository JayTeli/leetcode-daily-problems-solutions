https://leetcode.com/problems/coin-change-2/
// Algo 1 : Dynamic Programming : unbounded Knapsack  : O(c*a) , O(a) .. c is length of coins array,
// Note : Can also be asked like "given total weight w ..find no of ways to weigh it using smaller weights ([1,2,3,4,...k] i.e. first k natural numbers) "
class Solution {
      public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
          for (int x = coin; x < amount + 1; ++x) {
            dp[x] += dp[x - coin];
          }
        }
        return dp[amount];
      }
}