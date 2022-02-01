#https://leetcode.com/problems/richest-customer-wealth/

from typing import List

# Algo 1 : Iterate over matrix : O(mn) , O(1)
# Iterate over matrix and keep track of maxWealth for each row.
class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        richest = 0
        for account in accounts:
            money_in_account = 0
            for money in account:
                money_in_account += money
            richest = max(richest, money_in_account)
        return richest
                