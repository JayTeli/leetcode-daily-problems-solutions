# https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
from typing import List


#  Algo 2 : One-Pass Iteration : O(n) , O(1)
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l, r = 0, 1 # l = buy, r = sell
        maxProfit = 0
        
        while l < len(prices) and r < len(prices):
            if prices[l] < prices[r]:
                profit = prices[r] - prices[l]
                maxProfit = max(profit, maxProfit)
            else:
                l = r
            r += 1
        return maxProfit