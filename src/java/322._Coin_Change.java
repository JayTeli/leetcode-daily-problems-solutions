https://leetcode.com/problems/coin-change
// Algo 1 : Top-Down DP : O(c*a) , O(a).. c = coins.length , a = amount
class Solution {
    private int[] dp;
    private int[] coins;
    private int noOfCoins;
    private int smallestCoin;
    public int coinChange(int[] coins, int amount) {
        init(coins , amount);
        coinChange(amount);
        return dp[amount];
    }
    private void init(int[] coins , int amount) {
        this.coins = coins;
        this.noOfCoins = coins.length;
        int dpLength = 1+amount;
        this.dp = new int[dpLength];
        for(int i = 0 ; i < dpLength ; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        this.smallestCoin = Integer.MAX_VALUE;
        for(int i = 0 ; i < coins.length ; i++) {
            smallestCoin = Math.min(smallestCoin , coins[i]);
        }
    }
    private int coinChange(int amount) {
        if(amount >= 0 && dp[amount] != Integer.MAX_VALUE) 
                return dp[amount];
        if(amount < smallestCoin) {
            if(amount > 0) {
                dp[amount] = -1;
                return -1;
            } else if(amount == 0){
                dp[amount] = 0; 
                return 0;
            } else {
                return -1;
            }
        }
        int  coinsNeedForAmt = Integer.MAX_VALUE;
        for(int coin : coins) {
            int remainingAmt = amount-coin;
            int coinsNeedForRemainingAmt = Integer.MAX_VALUE;
            if(remainingAmt >= 0) {
                coinsNeedForRemainingAmt = coinChange(remainingAmt);
                if(coinsNeedForRemainingAmt >= 0){    
                    coinsNeedForAmt = Math.min(coinsNeedForAmt , 1 + coinsNeedForRemainingAmt);   
                }
            }
        }     
        dp[amount] = coinsNeedForAmt != Integer.MAX_VALUE ? coinsNeedForAmt : -1;
        return dp[amount];
    }
}
// Algo 2 : Bottom-up : O(c*a) , O(a).. c = coins.length , a = amount
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[1+amount];
        Arrays.fill(dp , 1+amount); // 1+amount instead of Integer.MAX_VALUE
        dp[0] = 0;
        int min = Integer.MAX_VALUE;
        for(int a = 1 ; a <= amount ; a++) {
            for(int c : coins) {
                if(a-c >= 0)
                    dp[a] = Math.min(dp[a] , 1+ dp[a-c]);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount]; // Note : >amount
    }
}