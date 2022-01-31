https://leetcode.com/problems/richest-customer-wealth/
// Algo 1 : Iterate over matrix : O(n) , O(1)
// Iterate over matrix and keep track of maxWealth for each row.
class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length , n = accounts[0].length;
        int maxWealth = 0 , currentCustomerWealth = 0;
        for(int i = 0 ; i < m ; i++) {
            currentCustomerWealth = 0;
            for(int j = 0 ; j < n ; j++) {
                currentCustomerWealth += accounts[i][j];
            }
            if(maxWealth < currentCustomerWealth) {
                maxWealth = currentCustomerWealth;
            }
        }
        return maxWealth;
    }
}