# leetcode-daily-problems-solutions

### [Leetcode Daily Challenge](https://leetcode.com/problemset/all/) :


|Date  | Problem  | Solution  | Comment|
|-------|:-----:|:-----:|--------|
|01/02/2022 | [121. Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/121._Best_Time_to_Buy_and_Sell_Stock.java) , [Python](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/python/121._Best_Time_to_Buy_and_Sell_Stock.py)| In single pass , keep track of minPrice and maxProfit(currentPrice-MinPrice)|
|31/01/2022 | [1672. Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/1672._Richest_Customer_Wealth.java) , [Python](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/python/1672._Richest_Customer_Wealth.py) | Iterate over matrix and keep track of maxWealth for each row.|
|30/01/2022 | [189. Rotate Array](https://leetcode.com/problems/rotate-array/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/189._Rotate_Array.java) | In multiple pass approach , once can reverse array full array then part of array (first k & then last n-k elements). For single pass , cyclic replacement is done calculating newIndex based on oldIndex|
|29/01/2022 | [84. Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/84._Largest_Rectangle_in_Histogram.java) | Using 1.Divide and Conquer with/without Segment tree and 2. with stack are two ways|
|28/01/2022 | [211. Design Add and Search Words Data Structure](https://leetcode.com/problems/design-add-and-search-words-data-structure/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/211._Design_Add_and_Search_Words_Data_Structure.java) | Add Child to tree. Use DFS to search character by character. Each key is represented in the trie as a path from the root to the internal node or leaf.|
|27/01/2022 | [421. Maximum XOR of Two Numbers in an Array](https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/421._Maximum_XOR_of_Two_Numbers_in_an_Array.java) | Convert numbers to Binary and insert them into Bitwise trie one by one. At each step , compute max XOR.|
|26/01/2022 | [1305. All Elements in Two Binary Search Trees](https://leetcode.com/problems/all-elements-in-two-binary-search-trees/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/1305._All_Elements_in_Two_Binary_Search_Trees.java) | Iterative inorder traversal of both trees in parallel and at each step add smallest value in output|
|25/01/2022 | [941. Valid Mountain Array](https://leetcode.com/problems/valid-mountain-array) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/941._Valid_Mountain_Array.java) | After walking up the hill , one should not be at start/end of array. After walking down the hill , one should be at end of array|
|24/01/2022 | [520. Detect Capital](https://leetcode.com/problems/detect-capital/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/520._Detect_Capital.java) | Iterate over characters of string to check if it is uppercase , lowercase or only first letter is upper case|
|23/01/2022 | [1291. Sequential Digits](https://leetcode.com/problems/sequential-digits/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/1291._Sequential_Digits.java) | Using Sliding Window , precompute candidate substrings from input "123456789" and add to result ones that fall in range [low,high]|
<br>

### [Blind 75](https://www.teamblind.com/post/New-Year-Gift---Curated-List-of-Top-75-LeetCode-Questions-to-Save-Your-Time-OaM1orEU) : 

|Tag &nbsp;&nbsp;&nbsp; |Problem &nbsp;&nbsp;&nbsp;  | Solution  | Comment|
|----------|:---------:|:-----:|----------|
| Array , HashTable| [Two Sum](https://leetcode.com/problems/two-sum/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/1._Two_Sum.java) | While iterating array , check if complement exists in HashMap. if yes , return it; if no put in HashMap |
|Dynamic Programming , Array | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/121._Best_Time_to_Buy_and_Sell_Stock.java) , [Python](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/python/121._Best_Time_to_Buy_and_Sell_Stock.py)| In single pass , keep track of minPrice and maxProfit(currentPrice-MinPrice)|
| Dynamic Programming , Array| [House Robber](https://leetcode.com/problems/house-robber/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/198._House_Robber.java) | robFrom(i)=max(robFrom(i+1),robFrom(i+2)+nums(i)) |
| Trie , Backtracking , Matrix| [Word Search II](https://leetcode.com/problems/word-search-ii) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/212._Word_Search_II.java) | Build Trie , Backtrack by temporarily marking current element as #, if children exists in trie , move deeper for the child , until desired word from wordlist is found. |



