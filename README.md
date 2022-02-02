# leetcode-daily-problems-solutions

### [Leetcode Daily Challenge](https://leetcode.com/problemset/all/) :


|Date  | Problem  | Solution  | Comment|
|-------|:-----:|:-----:|--------|
|02/02/2022 | [438. Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/438._Find_All_Anagrams_in_a_String.java)| Sliding window with array : current index always increase freq.Element leaving from left end will decrease freq of char that left.if sFreq = pFreq , cal startIndex = currentIndex - pLength + 1 and add to result|
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
| Array | [Two Sum](https://leetcode.com/problems/two-sum/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/1._Two_Sum.java) | While iterating array , check if complement exists in HashMap. if yes , return it; if no put in HashMap |
| Array | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/121._Best_Time_to_Buy_and_Sell_Stock.java) , [Python](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/python/121._Best_Time_to_Buy_and_Sell_Stock.py) | In single pass , keep track of minPrice and maxProfit(currentPrice-MinPrice) |
| Array | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/217._Contains_Duplicate.java) | Use HashSet to detect dupes.|
| Array | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | ComingSoon | |
| Array | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | ComingSoon | |
| Array | [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/) | ComingSoon | |
| Array | [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | ComingSoon | |
| Array | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | ComingSoon | |
| Array | [3Sum](https://leetcode.com/problems/3sum/) | ComingSoon | |
| Array | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | ComingSoon | |
| Binary | [Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers/) | ComingSoon | |
| Binary | [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/) | ComingSoon | |
| Binary | [Counting Bits](https://leetcode.com/problems/counting-bits/) | ComingSoon | |
| Binary | [Missing Number](https://leetcode.com/problems/missing-number/) | ComingSoon | |
| Binary | [Reverse Bits](https://leetcode.com/problems/reverse-bits/) | ComingSoon | |
| Dynamic Programming | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | ComingSoon | |
| Dynamic Programming | [Coin Change](https://leetcode.com/problems/coin-change/) | ComingSoon | |
| Dynamic Programming | [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/) | ComingSoon | |
| Dynamic Programming | [Longest Common Subsequence -
| Dynamic Programming | [Word Break Problem](https://leetcode.com/problems/word-break/) | ComingSoon | |
| Dynamic Programming | [Combination Sum](https://leetcode.com/problems/combination-sum-iv/) | ComingSoon | |
| Dynamic Programming | [House Robber](https://leetcode.com/problems/house-robber/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/198._House_Robber.java) | robFrom(i)=max(robFrom(i+1),robFrom(i+2)+nums(i)) |
| Dynamic Programming | [House Robber II](https://leetcode.com/problems/house-robber-ii/) | ComingSoon | |
| Dynamic Programming | [Decode Ways](https://leetcode.com/problems/decode-ways/) | ComingSoon | |
| Dynamic Programming | [Unique Paths](https://leetcode.com/problems/unique-paths/) | ComingSoon | |
| Dynamic Programming | [Jump Game](https://leetcode.com/problems/jump-game/) | ComingSoon | |
| Graph | [Clone Graph](https://leetcode.com/problems/clone-graph/) | ComingSoon | |
| Graph | [Course Schedule](https://leetcode.com/problems/course-schedule/) | ComingSoon | |
| Graph | [Pacific Atlantic Water Flow](https://leetcode.com/problems/pacific-atlantic-water-flow/) | ComingSoon | |
| Graph | [Number of Islands](https://leetcode.com/problems/number-of-islands/) | ComingSoon | |
| Graph | [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/) | ComingSoon | |
| Graph | [Alien Dictionary](https://leetcode.com/problems/alien-dictionary/) | ComingSoon | |
| Graph | [Graph Valid Tree](https://leetcode.com/problems/graph-valid-tree/) | ComingSoon | |
| Graph | [Number of Connected Components in an Undirected Graph](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/) | ComingSoon | |
| Intervals | [Insert Interval](https://leetcode.com/problems/insert-interval/) | ComingSoon | |
| Intervals | [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | ComingSoon | |
| Intervals | [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/) | ComingSoon | |
| Intervals | [Meeting Rooms](https://leetcode.com/problems/meeting-rooms/) | ComingSoon | |
| Intervals | [Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii/) | ComingSoon | |
| Linked List | [Reverse a Linked List](https://leetcode.com/problems/reverse-linked-list/) | ComingSoon | |
| Linked List | [Detect Cycle in a Linked List](https://leetcode.com/problems/linked-list-cycle/) | ComingSoon | |
| Linked List | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | ComingSoon | |
| Linked List | [Remove Nth Node From End Of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | ComingSoon | |
| Linked List | [Reorder List](https://leetcode.com/problems/reorder-list/) | ComingSoon | |
| Matrix | [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/) | ComingSoon | |
| Matrix | [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/) | ComingSoon | |
| Matrix | [Rotate Image](https://leetcode.com/problems/rotate-image/) | ComingSoon | |
| Matrix | [Word Search](https://leetcode.com/problems/word-search/) | ComingSoon | |
| String | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | ComingSoon | |
| String | [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/) | ComingSoon | |
| String | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | ComingSoon | |
| String | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | ComingSoon | |
| String | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | ComingSoon | |
| String | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | ComingSoon | |
| String | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | ComingSoon | |
| String | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) | ComingSoon | |
| String | [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/) | ComingSoon | |
| String | [Encode and Decode Strings](https://leetcode.com/problems/encode-and-decode-strings/) | ComingSoon | |
| Tree | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | ComingSoon | |
| Tree | [Same Tree](https://leetcode.com/problems/same-tree/) | ComingSoon | |
| Tree | [Invert/Flip Binary Tree](https://leetcode.com/problems/invert-binary-tree/) | ComingSoon | |
| Tree | [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/) | ComingSoon | |
| Tree | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) | ComingSoon | |
| Tree | [Serialize and Deserialize Binary Tree](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/) | ComingSoon | |
| Tree | [Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/) | ComingSoon | |
| Tree | [Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | ComingSoon | |
| Tree | [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/) | ComingSoon | |
| Tree | [Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) | ComingSoon | |
| Tree | [Lowest Common Ancestor of BST](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) | ComingSoon | |
| Tree | [Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/) | ComingSoon | |
| Tree | [Add and Search Word](https://leetcode.com/problems/add-and-search-word-data-structure-design/) | ComingSoon | |
| Tree | [Word Search II](https://leetcode.com/problems/word-search-ii/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/212._Word_Search_II.java) | Build Trie , Backtrack by temporarily marking current element as #, if children exists in trie , move deeper for the child , until desired word from wordlist is found. |
| Heap | [Merge K Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | ComingSoon | |
| Heap | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) | ComingSoon | |
| Heap | [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/) | ComingSoon | |
