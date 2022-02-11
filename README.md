## Table of contents :
1. [Leetcode daily challenge problems](#leetcode-daily-challenge)
2. [Blind 75](#blind-75)
3. [Top 500 Leetcode Questions](#top-500-leetcode-questions)

### Leetcode Daily Challenge
https://leetcode.com/problemset/all/

|Date  | Problem  | Solution  | Comment|
|-------|:-----:|:-----:|--------|
|10/02/2022 | [560. Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/560._Subarray_Sum_Equals_K.java) | Using Cumulative Sum; Nested loop and constant space; HashMap + Cummulative Sum; |  
|09/02/2022 | [532. K-diff Pairs in an Array](https://leetcode.com/problems/k-diff-pairs-in-an-array) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/532._K-diff_Pairs_in_an_Array.java) | Sort + if diff == k then ++uniquePairs and left = skipLeftDuplicateNeighbours(left , nums);else if(diff < k) ++right;else ++left;if(left == right) ++right; HashMap : set freq , for k == 0 if value >= 2 , count++ else if k > 0 , for key=x,if key=x+k exists then count++|
|08/02/2022 | [258. Add Digits](https://leetcode.com/problems/add-digits/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/258._Add_Digits.java)| Digit root : x == 0 ? 0 : 1 + (x-1)%9 | 
|07/02/2022 | [389. Find the Difference](https://leetcode.com/problems/find-the-difference/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/389._Find_the_Difference.java)| Starting result with last char of 2nd string , XOR ^ all chars of both strings L to R.|
|06/02/2022 | [80. Remove Duplicates from Sorted Array II](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/80._Remove_Duplicates_from_Sorted_Array_II.java)| Keep track of uniqueFoundSoFar,consecutiveFreq.Two pointer : i (index) , uniqueFoundSoFar.if adjecent dupes , consecutiveFreq++ else consecutiveFreq=1.if consecutiveFreq<=2, set consecutiveFreqTH index with current element and consecutiveFreq uniqueFoundSoFar++; |
|05/02/2022 | [23. Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/23._Merge_k_Sorted_Lists.java)| Divide And Conquer : divide into lowToMid and mid+1ToEnd and then merge their solutions recursively. one base case low==high return low|
|04/02/2022 | [525. Contiguous Array](https://leetcode.com/problems/contiguous-array) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/525._Contiguous_Array.java)| Maintain countSoFar , for each 1  in nums[] , ++countSoFar and for each 0 in nums[] --countSoFar.In HashMap , for key=count , value=leftmostIndexWithCountMap; maxLength for count = currentIndex-leftmostIndexWithCountMap.|
|03/02/2022 | [454. 4Sum II](https://leetcode.com/problems/4sum-ii/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/454._4Sum_II.java)| In HashMap approach , first put sumFreq of a+b and then for getting the counts get counts of -(c+d). For kSumCount algo , divide list into 2 grps of k/2 and use recursion to update sumFreq in Map and later iterate in second half of grp to get count for complements.|
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

### Blind 75
https://www.teamblind.com/post/New-Year-Gift---Curated-List-of-Top-75-LeetCode-Questions-to-Save-Your-Time-OaM1orEU

|Tag &nbsp;&nbsp;&nbsp; |Problem &nbsp;&nbsp;&nbsp;  | Solution  | Comment|
|----------|:---------:|:-----:|----------|
| Array | [Two Sum](https://leetcode.com/problems/two-sum/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/1._Two_Sum.java) | While iterating array , check if complement exists in HashMap. if yes , return it; if no put in HashMap |
| Array | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/121._Best_Time_to_Buy_and_Sell_Stock.java) , [Python](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/python/121._Best_Time_to_Buy_and_Sell_Stock.py) | In single pass , keep track of minPrice and maxProfit(currentPrice-MinPrice) |
| Array | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/217._Contains_Duplicate.java) | Use HashSet to detect dupes.|
| Array | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/238._Product_of_Array_Except_Self.java) | ans=leftProduct[i]*rightProduct[i]; leftProduct[i] = nums[i-1]*leftProduct[i-1]; |
| Array | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | ComingSoon | |
| Array | [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/152._Maximum_Product_Subarray.java) | Keep track of prevMaxSoFar , newMaxSoFar , minSoFar to get result. Odd no of Negative numbers and zeros can be hurdles to build max prod subarray|
| Array | [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/153._Find_Minimum_in_Rotated_Sorted_Array.java) | Binary search with base cases like aLength = 0,1; rotation=0/a.length Times; mid=largest,mid=smallest; and identify smallest on which side.|
| Array | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/33._Search_in_Rotated_Sorted_Array.java) | Binary Search : if a[left]<=mid => range[left  mid) is sorted and target comparison can be done with a[left] and mid. Slly for (mid right] range.|
| Array | [3Sum](https://leetcode.com/problems/3sum/) | ComingSoon | |
| Array | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | ComingSoon | |
| Binary | [Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/371._Sum_of_Two_Integers.java) | a^b => sum of a and b without carry; (a&b)<<1 => carry; a^b => diff of a and n without borrow ; ((~x)&y)<<1 => borrow; loop conditions will be carry/borrow != 0; return sign*x |
| Binary | [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/) | [Java](https://leetcode.com/problems/number-of-1-bits/) | Get ith bit using bitwise-AND to a bit mask which is initally 1 and later left shifted by 1 for 32 times.(n & (n-1)) flips the rightmost 1 (LSB 1-bit).hammingweight = #flips until no becomes 0|
| Binary | [Counting Bits](https://leetcode.com/problems/counting-bits/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/338._Counting_Bits.java) | Hamming Weight using x &= (x-1) ; DP+MSB using ans[x+b] = 1+ans[x] , b <<= 1; DP + LSB using ans[x] = ans[x >> 1] + (x & 1); DP + LastSetBit using ans[x] = ans[x & (x-1)] + 1 |
| Binary | [Missing Number](https://leetcode.com/problems/missing-number/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/268._Missing_Number.java) | For O(1) space , use Math sumOfFirstNNos - SumOfInputNos; or Bit Manipulation : init missing = nums.length and then missing = missing ^ (i ^ nums[i]) |
| Binary | [Reverse Bits](https://leetcode.com/problems/reverse-bits/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/190._Reverse_Bits.java) | for 32 bit integer ,do 32 times : result = result<<1  \| (n & 1); n >>>= 1|
| Dynamic Programming | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/70._Climbing_Stairs.java) | recursion : climbStairs(i) = climbStairs(i+1) + climbStairs(i+2); Recursion + Memo ; dp[i] = dp[i-1] + dp[i-2] ; f(n)=f(n−1)+f(n−2) ; .Fn = (1/sqrt(5)) *[x^n - y^n] .. x = (1+sqrt(5))/2 , y = (1-sqrt(5))/2|
| Dynamic Programming | [Coin Change](https://leetcode.com/problems/coin-change/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/322._Coin_Change.java) | TopDownDp : dp[i] = Math.min(1 + dp[i-c1], 1 + dp[i-c2],..); BottomUpDp : dp[0]=0;for all a and c , ifa-c>=0 , dp[a] = Math.min(dp[a] , 1+dp[a-c]) |
| Dynamic Programming | [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/300._Longest_Increasing_Subsequence.java) | TopDownDP & BottomUpDP : dp[i] = max(1+dp[j1] , 1+dp[j2]..)..for all j > i , a[j]>a[i]; Binary Search : ); subsequence : insert 1st element , iterate thru remaining.in iteration , if new element > last element , add new element to list.if new element <= last element , using Binary search , find insert index and override that index value in list.|
| Dynamic Programming | [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/1143._Longest_Common_Subsequence.java) | Top-Down DP With Memoization with (Optimized TC), Bottom Up dp Bottom Up dp with (Optimized SC)|
| Dynamic Programming | [Word Break Problem](https://leetcode.com/problems/word-break/) | ComingSoon | |
| Dynamic Programming | [Combination Sum IV](https://leetcode.com/problems/combination-sum-iv/) | ComingSoon | |
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
| Heap | [Merge K Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/23._Merge_k_Sorted_Lists.java) | In Algo 1 , add all elements of all lists to Heap(Priority Queue + Comparator) then poll pq and set next of prev node to polled element. In Algo 2 without Heap , use divide and conquer to break the list into half with base case of size 2 returning smaller no. then merge left and right lists , with currentNode pointer's next pointing to the smaller head of the two lists.|
| Heap | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/347._Top_K_Frequent_Elements.java) | Heap + HashMap , QuickSelect + Lomuto's Parition scheme|
| Heap | [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/) | ComingSoon | |
<br>

### Top 500 Leetcode Questions
https://leetcode.com/problemset/all

|Tag &nbsp;&nbsp;&nbsp; |Problem &nbsp;&nbsp;&nbsp;  | Solution  | Comment|
|----------|:---------:|:-----:|----------|
| Array | [Two Sum](https://leetcode.com/problems/two-sum/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/1._Two_Sum.java) | While iterating array , check if complement exists in HashMap. if yes , return it; if no put in HashMap |
| WIP-Tag | 146. LRU Cache | ComingSoon | WIP-Comment |
| WIP-Tag | 56. Merge Intervals | ComingSoon | WIP-Comment |
| WIP-Tag | 42. Trapping Rain Water | ComingSoon | WIP-Comment |
| WIP-Tag | 200. Number of Islands | ComingSoon | WIP-Comment |
| WIP-Tag | 4. Median of Two Sorted Arrays | ComingSoon | WIP-Comment |
| WIP-Tag | 423. Reconstruct Original Digits from English | ComingSoon | WIP-Comment |
| WIP-Tag | 1235. Maximum Profit in Job Scheduling | ComingSoon | WIP-Comment |
| WIP-Tag | 2. Add Two Numbers | ComingSoon | WIP-Comment |
| WIP-Tag | 20. Valid Parentheses | ComingSoon | WIP-Comment |
| Array | [121. Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/121._Best_Time_to_Buy_and_Sell_Stock.java) , [Python](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/python/121._Best_Time_to_Buy_and_Sell_Stock.py)| In single pass , keep track of minPrice and maxProfit(currentPrice-MinPrice)|
| WIP-Tag | 3. Longest Substring Without Repeating Characters | ComingSoon | WIP-Comment |
| WIP-Tag | 1249. Minimum Remove to Make Valid Parentheses | ComingSoon | WIP-Comment |
| WIP-Tag | 7. Reverse Integer | ComingSoon | WIP-Comment |
| WIP-Tag | 811. Subdomain Visit Count | ComingSoon | WIP-Comment |
| WIP-Tag | 560. Subarray Sum Equals K | ComingSoon | WIP-Comment |
| WIP-Tag | 253. Meeting Rooms II | ComingSoon | WIP-Comment |
| WIP-Tag | 815. Bus Routes | ComingSoon | WIP-Comment |
| WIP-Tag | 68. Text Justification | ComingSoon | WIP-Comment |
| WIP-Tag | 5. Longest Palindromic Substring | ComingSoon | WIP-Comment |
| WIP-Tag | 53. Maximum Subarray | ComingSoon | WIP-Comment |
| WIP-Tag | 31. Next Permutation | ComingSoon | WIP-Comment |
| WIP-Tag | 273. Integer to English Words | ComingSoon | WIP-Comment |
| WIP-Tag | 15. 3Sum | ComingSoon | WIP-Comment |
| WIP-Tag | 14. Longest Common Prefix | ComingSoon | WIP-Comment |
| WIP-Tag | 809. Expressive Words | ComingSoon | WIP-Comment |
| WIP-Tag | 380. Insert Delete GetRandom O(1) | ComingSoon | WIP-Comment |
| WIP-Tag | 41. First Missing Positive | ComingSoon | WIP-Comment |
| WIP-Tag | 588. Design In-Memory File System | ComingSoon | WIP-Comment |
| WIP-Tag | 239. Sliding Window Maximum | ComingSoon | WIP-Comment |
| WIP-Tag | 22. Generate Parentheses | ComingSoon | WIP-Comment |
| WIP-Tag | 829. Consecutive Numbers Sum | ComingSoon | WIP-Comment |
| WIP-Tag | 680. Valid Palindrome II | ComingSoon | WIP-Comment |
| WIP-Tag | 215. Kth Largest Element in an Array | ComingSoon | WIP-Comment |
| WIP-Tag | 49. Group Anagrams | ComingSoon | WIP-Comment |
| WIP-Tag | 127. Word Ladder | ComingSoon | WIP-Comment |
| WIP-Tag | 54. Spiral Matrix | ComingSoon | WIP-Comment |
| WIP-Tag | 17. Letter Combinations of a Phone Number | ComingSoon | WIP-Comment |
| WIP-Tag | 212. Word Search II | ComingSoon | WIP-Comment |
| WIP-Tag | 1326. Minimum Number of Taps to Open to Water a Garden | ComingSoon | WIP-Comment |
| Divide and Conquer , Heap | [23. Merge K Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/23._Merge_k_Sorted_Lists.java) | In Algo 1 , add all elements of all lists to Heap(Priority Queue + Comparator) then poll pq and set next of prev node to polled element. In Algo 2 without Heap , use divide and conquer to break the list into half with base case of size 2 returning smaller no. then merge left and right lists , with currentNode pointer's next pointing to the smaller head of the two lists.|
| Binary Search | [33. Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/33._Search_in_Rotated_Sorted_Array.java) | Binary Search : if a[left]<=mid => range[left  mid) is sorted and target comparison can be done with a[left] and mid. Slly for (mid right] range.|
| WIP-Tag | 236. Lowest Common Ancestor of a Binary Tree | ComingSoon | WIP-Comment |
| WIP-Tag | 1041. Robot Bounded In Circle | ComingSoon | WIP-Comment |
| WIP-Tag | 973. K Closest Points to Origin | ComingSoon | WIP-Comment |
| WIP-Tag | 528. Random Pick with Weight | ComingSoon | WIP-Comment |
| WIP-Tag | 227. Basic Calculator II | ComingSoon | WIP-Comment |
| WIP-Tag | 79. Word Search | ComingSoon | WIP-Comment |
| WIP-Tag | 1396. Design Underground System | ComingSoon | WIP-Comment |
| WIP-Tag | 176. Second Highest Salary | ComingSoon | WIP-Comment |
| WIP-Tag | 696. Count Binary Substrings | ComingSoon | WIP-Comment |
| WIP-Tag | 11. Container With Most Water | ComingSoon | WIP-Comment |
| WIP-Tag | 295. Find Median from Data Stream | ComingSoon | WIP-Comment |
| WIP-Tag | 1197. Minimum Knight Moves | ComingSoon | WIP-Comment |
| WIP-Tag | 443. String Compression | ComingSoon | WIP-Comment |
| WIP-Tag | 124. Binary Tree Maximum Path Sum | ComingSoon | WIP-Comment |
| WIP-Tag | 224. Basic Calculator | ComingSoon | WIP-Comment |
| WIP-Tag | 1570. Dot Product of Two Sparse Vectors | ComingSoon | WIP-Comment |
| WIP-Tag | 174. Dungeon Game | ComingSoon | WIP-Comment |
| WIP-Tag | 50. Pow(x, n) | ComingSoon | WIP-Comment |
| WIP-Tag | 13. Roman to Integer | ComingSoon | WIP-Comment |
| WIP-Tag | 347. Top K Frequent Elements | ComingSoon | WIP-Comment |
| WIP-Tag | 1010. Pairs of Songs With Total Durations Divisible by 60 | ComingSoon | WIP-Comment |
| WIP-Tag | 37. Sudoku Solver | ComingSoon | WIP-Comment |
| WIP-Tag | 460. LFU Cache | ComingSoon | WIP-Comment |
| WIP-Tag | 759. Employee Free Time | ComingSoon | WIP-Comment |
| WIP-Tag | 21. Merge Two Sorted Lists | ComingSoon | WIP-Comment |
| WIP-Tag | 134. Gas Station | ComingSoon | WIP-Comment |
| WIP-Tag | 71. Simplify Path | ComingSoon | WIP-Comment |
| WIP-Tag | 526. Beautiful Arrangement | ComingSoon | WIP-Comment |
| WIP-Tag | 139. Word Break | ComingSoon | WIP-Comment |
| WIP-Tag | 529. Minesweeper | ComingSoon | WIP-Comment |
| WIP-Tag | 297. Serialize and Deserialize Binary Tree | ComingSoon | WIP-Comment |
| WIP-Tag | 269. Alien Dictionary | ComingSoon | WIP-Comment |
| WIP-Tag | 937. Reorder Data in Log Files | ComingSoon | WIP-Comment |
| WIP-Tag | 981. Time Based Key-Value Store | ComingSoon | WIP-Comment |
| Two pointers | [18. 4Sum](https://leetcode.com/problems/4sum) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/18._4Sum.java) | resursively solve kSum with base case soln for TwoSum (solved via two pointers) and optimizations like sorting to skip dupe neighbours. skipping cases like smallestValueInKValues > target/k , largestValueInKValues < target/k |
| WIP-Tag | 244. Shortest Word Distance II | ComingSoon | WIP-Comment |
| WIP-Tag | 453. Minimum Moves to Equal Array Elements | ComingSoon | WIP-Comment |
| WIP-Tag | 1268. Search Suggestions System | ComingSoon | WIP-Comment |
| WIP-Tag | 9. Palindrome Number | ComingSoon | WIP-Comment |
| WIP-Tag | 51. N-Queens | ComingSoon | WIP-Comment |
| WIP-Tag | 828. Count Unique Characters of All Substrings of a Given String | ComingSoon | WIP-Comment |
| WIP-Tag | 1762. Buildings With an Ocean View | ComingSoon | WIP-Comment |
| WIP-Tag | 210. Course Schedule II | ComingSoon | WIP-Comment |
| WIP-Tag | 10. Regular Expression Matching | ComingSoon | WIP-Comment |
| WIP-Tag | 314. Binary Tree Vertical Order Traversal | ComingSoon | WIP-Comment |
| WIP-Tag | 162. Find Peak Element | ComingSoon | WIP-Comment |
| WIP-Tag | 871. Minimum Number of Refueling Stops | ComingSoon | WIP-Comment |
| WIP-Tag | 1710. Maximum Units on a Truck | ComingSoon | WIP-Comment |
| WIP-Tag | 863. All Nodes Distance K in Binary Tree | ComingSoon | WIP-Comment |
| WIP-Tag | 12. Integer to Roman | ComingSoon | WIP-Comment |
| WIP-Tag | 362. Design Hit Counter | ComingSoon | WIP-Comment |
| WIP-Tag | 415. Add Strings | ComingSoon | WIP-Comment |
| WIP-Tag | 138. Copy List with Random Pointer | ComingSoon | WIP-Comment |
| WIP-Tag | 718. Maximum Length of Repeated Subarray | ComingSoon | WIP-Comment |
| WIP-Tag | 735. Asteroid Collision | ComingSoon | WIP-Comment |
| WIP-Tag | 289. Game of Life | ComingSoon | WIP-Comment |
| WIP-Tag | 1209. Remove All Adjacent Duplicates in String II | ComingSoon | WIP-Comment |
| WIP-Tag | 692. Top K Frequent Words | ComingSoon | WIP-Comment |
| WIP-Tag | 909. Snakes and Ladders | ComingSoon | WIP-Comment |
| WIP-Tag | 45. Jump Game II | ComingSoon | WIP-Comment |
| WIP-Tag | 1650. Lowest Common Ancestor of a Binary Tree III | ComingSoon | WIP-Comment |
| WIP-Tag | 140. Word Break II | ComingSoon | WIP-Comment |
| WIP-Tag | 609. Find Duplicate File in System | ComingSoon | WIP-Comment |
| WIP-Tag | 987. Vertical Order Traversal of a Binary Tree | ComingSoon | WIP-Comment |
| WIP-Tag | 91. Decode Ways | ComingSoon | WIP-Comment |
| WIP-Tag | 767. Reorganize String | ComingSoon | WIP-Comment |
| WIP-Tag | 76. Minimum Window Substring | ComingSoon | WIP-Comment |
| WIP-Tag | 199. Binary Tree Right Side View | ComingSoon | WIP-Comment |
| WIP-Tag | 994. Rotting Oranges | ComingSoon | WIP-Comment |
| WIP-Tag | 55. Jump Game | ComingSoon | WIP-Comment |
| Dynamic Programming | [70. Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/70._Climbing_Stairs.java) | recursion : climbStairs(i) = climbStairs(i+1) + climbStairs(i+2); Recursion + Memo ; dp[i] = dp[i-1] + dp[i-2] ; f(n)=f(n−1)+f(n−2) ; .Fn = (1/sqrt(5)) *[x^n - y^n] .. x = (1+sqrt(5))/2 , y = (1-sqrt(5))/2|
| WIP-Tag | 540. Single Element in a Sorted Array | ComingSoon | WIP-Comment |
| WIP-Tag | 16. 3Sum Closest | ComingSoon | WIP-Comment |
| WIP-Tag | 332. Reconstruct Itinerary | ComingSoon | WIP-Comment |
| WIP-Tag | 1761. Minimum Degree of a Connected Trio in a Graph | ComingSoon | WIP-Comment |
| WIP-Tag | 387. First Unique Character in a String | ComingSoon | WIP-Comment |
| WIP-Tag | 25. Reverse Nodes in k-Group | ComingSoon | WIP-Comment |
| WIP-Tag | 1048. Longest String Chain | ComingSoon | WIP-Comment |
| WIP-Tag | 339. Nested List Weight Sum | ComingSoon | WIP-Comment |
| WIP-Tag | 125. Valid Palindrome | ComingSoon | WIP-Comment |
| WIP-Tag | 48. Rotate Image | ComingSoon | WIP-Comment |
| WIP-Tag | 322. Coin Change | ComingSoon | WIP-Comment |
| WIP-Tag | 6. Zigzag Conversion | ComingSoon | WIP-Comment |
| WIP-Tag | 862. Shortest Subarray with Sum at Least K | ComingSoon | WIP-Comment |
| Array | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/217._Contains_Duplicate.java) | Use HashSet to detect dupes.|
| WIP-Tag | 207. Course Schedule | ComingSoon | WIP-Comment |
| WIP-Tag | 32. Longest Valid Parentheses | ComingSoon | WIP-Comment |
| WIP-Tag | 34. Find First and Last Position of Element in Sorted Array | ComingSoon | WIP-Comment |
| WIP-Tag | 88. Merge Sorted Array | ComingSoon | WIP-Comment |
| WIP-Tag | 122. Best Time to Buy and Sell Stock II | ComingSoon | WIP-Comment |
| WIP-Tag | 716. Max Stack | ComingSoon | WIP-Comment |
| WIP-Tag | 341. Flatten Nested List Iterator | ComingSoon | WIP-Comment |
| WIP-Tag | 695. Max Area of Island | ComingSoon | WIP-Comment |
| WIP-Tag | 177. Nth Highest Salary | ComingSoon | WIP-Comment |
| WIP-Tag | 149. Max Points on a Line | ComingSoon | WIP-Comment |
| WIP-Tag | 921. Minimum Add to Make Parentheses Valid | ComingSoon | WIP-Comment |
| WIP-Tag | 1044. Longest Duplicate Substring | ComingSoon | WIP-Comment |
| WIP-Tag | 740. Delete and Earn | ComingSoon | WIP-Comment |
| WIP-Tag | 39. Combination Sum | ComingSoon | WIP-Comment |
| WIP-Tag | 1353. Maximum Number of Events That Can Be Attended | ComingSoon | WIP-Comment |
| WIP-Tag | 704. Binary Search | ComingSoon | WIP-Comment |
| WIP-Tag | 166. Fraction to Recurring Decimal | ComingSoon | WIP-Comment |
| WIP-Tag | 741. Cherry Pickup | ComingSoon | WIP-Comment |
| WIP-Tag | 368. Largest Divisible Subset | ComingSoon | WIP-Comment |
| WIP-Tag | 1152. Analyze User Website Visit Pattern | ComingSoon | WIP-Comment |
| WIP-Tag | 128. Longest Consecutive Sequence | ComingSoon | WIP-Comment |
| WIP-Tag | 1611. Minimum One Bit Operations to Make Integers Zero | ComingSoon | WIP-Comment |
| WIP-Tag | 36. Valid Sudoku | ComingSoon | WIP-Comment |
| WIP-Tag | 1381. Design a Stack With Increment Operation | ComingSoon | WIP-Comment |
| WIP-Tag | 394. Decode String | ComingSoon | WIP-Comment |
| WIP-Tag | 329. Longest Increasing Path in a Matrix | ComingSoon | WIP-Comment |
| WIP-Tag | 1405. Longest Happy String | ComingSoon | WIP-Comment |
| Sorting + Two Pointer , HashMap | [532. K-diff Pairs in an Array](https://leetcode.com/problems/k-diff-pairs-in-an-array) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/532._K-diff_Pairs_in_an_Array.java) | Sort + if diff == k then ++uniquePairs and left = skipLeftDuplicateNeighbours(left , nums);else if(diff < k) ++right;else ++left;if(left == right) ++right; HashMap : set freq , for k == 0 if value >= 2 , count++ else if k > 0 , for key=x,if key=x+k exists then count++|
| WIP-Tag | 370. Range Addition | ComingSoon | WIP-Comment |
| WIP-Tag | 44. Wildcard Matching | ComingSoon | WIP-Comment |
| WIP-Tag | 543. Diameter of Binary Tree | ComingSoon | WIP-Comment |
| WIP-Tag | 1604. Alert Using Same Key-Card Three or More Times in a One Hour Period | ComingSoon | WIP-Comment |
| Array | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/238._Product_of_Array_Except_Self.java) | ans=leftProduct[i]*rightProduct[i]; leftProduct[i] = nums[i-1]*leftProduct[i-1]; |
| WIP-Tag | 84. Largest Rectangle in Histogram | ComingSoon | WIP-Comment |
| WIP-Tag | 723. Candy Crush | ComingSoon | WIP-Comment |
| WIP-Tag | 287. Find the Duplicate Number | ComingSoon | WIP-Comment |
| WIP-Tag | 1492. The kth Factor of n | ComingSoon | WIP-Comment |
| WIP-Tag | 103. Binary Tree Zigzag Level Order Traversal | ComingSoon | WIP-Comment |
| WIP-Tag | 926. Flip String to Monotone Increasing | ComingSoon | WIP-Comment |
| WIP-Tag | 410. Split Array Largest Sum | ComingSoon | WIP-Comment |
| WIP-Tag | 1647. Minimum Deletions to Make Character Frequencies Unique | ComingSoon | WIP-Comment |
| WIP-Tag | 74. Search a 2D Matrix | ComingSoon | WIP-Comment |
| WIP-Tag | 1578. Minimum Time to Make Rope Colorful | ComingSoon | WIP-Comment |
| WIP-Tag | 1293. Shortest Path in a Grid with Obstacles Elimination | ComingSoon | WIP-Comment |
| WIP-Tag | 356. Line Reflection | ComingSoon | WIP-Comment |
| WIP-Tag | 1481. Least Number of Unique Integers after K Removals | ComingSoon | WIP-Comment |
| WIP-Tag | 46. Permutations | ComingSoon | WIP-Comment |
| WIP-Tag | 1413. Minimum Value to Get Positive Step by Step Sum | ComingSoon | WIP-Comment |
| WIP-Tag | 465. Optimal Account Balancing | ComingSoon | WIP-Comment |
| WIP-Tag | 412. Fizz Buzz | ComingSoon | WIP-Comment |
| WIP-Tag | 151. Reverse Words in a String | ComingSoon | WIP-Comment |
| WIP-Tag | 706. Design HashMap | ComingSoon | WIP-Comment |
| WIP-Tag | 739. Daily Temperatures | ComingSoon | WIP-Comment |
| WIP-Tag | 1011. Capacity To Ship Packages Within D Days | ComingSoon | WIP-Comment |
| WIP-Tag | 317. Shortest Distance from All Buildings | ComingSoon | WIP-Comment |
| WIP-Tag | 1366. Rank Teams by Votes | ComingSoon | WIP-Comment |
| WIP-Tag | 935. Knight Dialer | ComingSoon | WIP-Comment |
| WIP-Tag | 234. Palindrome Linked List | ComingSoon | WIP-Comment |
| WIP-Tag | 426. Convert Binary Search Tree to Sorted Doubly Linked List | ComingSoon | WIP-Comment |
| WIP-Tag | 155. Min Stack | ComingSoon | WIP-Comment |
| WIP-Tag | 336. Palindrome Pairs | ComingSoon | WIP-Comment |
| WIP-Tag | 827. Making A Large Island | ComingSoon | WIP-Comment |
| WIP-Tag | 300. Longest Increasing Subsequence | ComingSoon | WIP-Comment |
| WIP-Tag | 96. Unique Binary Search Trees | ComingSoon | WIP-Comment |
| WIP-Tag | 698. Partition to K Equal Sum Subsets | ComingSoon | WIP-Comment |
| WIP-Tag | 126. Word Ladder II | ComingSoon | WIP-Comment |
| WIP-Tag | 556. Next Greater Element III | ComingSoon | WIP-Comment |
| WIP-Tag | 315. Count of Smaller Numbers After Self | ComingSoon | WIP-Comment |
| WIP-Tag | 179. Largest Number | ComingSoon | WIP-Comment |
| WIP-Tag | 366. Find Leaves of Binary Tree | ComingSoon | WIP-Comment |
| WIP-Tag | 420. Strong Password Checker | ComingSoon | WIP-Comment |
| WIP-Tag | 1448. Count Good Nodes in Binary Tree | ComingSoon | WIP-Comment |
| WIP-Tag | 72. Edit Distance | ComingSoon | WIP-Comment |
| WIP-Tag | 621. Task Scheduler | ComingSoon | WIP-Comment |
| WIP-Tag | 403. Frog Jump | ComingSoon | WIP-Comment |
| WIP-Tag | 636. Exclusive Time of Functions | ComingSoon | WIP-Comment |
| WIP-Tag | 503. Next Greater Element II | ComingSoon | WIP-Comment |
| WIP-Tag | 1472. Design Browser History | ComingSoon | WIP-Comment |
| WIP-Tag | 1146. Snapshot Array | ComingSoon | WIP-Comment |
| WIP-Tag | 1004. Max Consecutive Ones III | ComingSoon | WIP-Comment |
| WIP-Tag | 233. Number of Digit One | ComingSoon | WIP-Comment |
| WIP-Tag | 62. Unique Paths | ComingSoon | WIP-Comment |
| WIP-Tag | 241. Different Ways to Add Parentheses | ComingSoon | WIP-Comment |
| WIP-Tag | 843. Guess the Word | ComingSoon | WIP-Comment |
| WIP-Tag | 697. Degree of an Array | ComingSoon | WIP-Comment |
| WIP-Tag | 399. Evaluate Division | ComingSoon | WIP-Comment |
| WIP-Tag | 206. Reverse Linked List | ComingSoon | WIP-Comment |
| WIP-Tag | 1861. Rotating the Box | ComingSoon | WIP-Comment |
| WIP-Tag | 509. Fibonacci Number | ComingSoon | WIP-Comment |
| WIP-Tag | 175. Combine Two Tables | ComingSoon | WIP-Comment |
| WIP-Tag | 787. Cheapest Flights Within K Stops | ComingSoon | WIP-Comment |
| WIP-Tag | 43. Multiply Strings | ComingSoon | WIP-Comment |
| WIP-Tag | 724. Find Pivot Index | ComingSoon | WIP-Comment |
| WIP-Tag | 353. Design Snake Game | ComingSoon | WIP-Comment |
| WIP-Tag | 726. Number of Atoms | ComingSoon | WIP-Comment |
| WIP-Tag | 1047. Remove All Adjacent Duplicates In String | ComingSoon | WIP-Comment |
| WIP-Tag | 173. Binary Search Tree Iterator | ComingSoon | WIP-Comment |
| WIP-Tag | 472. Concatenated Words | ComingSoon | WIP-Comment |
| WIP-Tag | 934. Shortest Bridge | ComingSoon | WIP-Comment |
| WIP-Tag | 1167. Minimum Cost to Connect Sticks | ComingSoon | WIP-Comment |
| WIP-Tag | 1344. Angle Between Hands of a Clock | ComingSoon | WIP-Comment |
| WIP-Tag | 78. Subsets | ComingSoon | WIP-Comment |
| WIP-Tag | 312. Burst Balloons | ComingSoon | WIP-Comment |
| WIP-Tag | 523. Continuous Subarray Sum | ComingSoon | WIP-Comment |
| WIP-Tag | 218. The Skyline Problem | ComingSoon | WIP-Comment |
| WIP-Tag | 169. Majority Element | ComingSoon | WIP-Comment |
| WIP-Tag | 98. Validate Binary Search Tree | ComingSoon | WIP-Comment |
| WIP-Tag | 75. Sort Colors | ComingSoon | WIP-Comment |
| WIP-Tag | 605. Can Place Flowers | ComingSoon | WIP-Comment |
| WIP-Tag | 1386. Cinema Seat Allocation | ComingSoon | WIP-Comment |
| WIP-Tag | 761. Special Binary String | ComingSoon | WIP-Comment |
| WIP-Tag | 907. Sum of Subarray Minimums | ComingSoon | WIP-Comment |
| WIP-Tag | 242. Valid Anagram | ComingSoon | WIP-Comment |
| WIP-Tag | 773. Sliding Puzzle | ComingSoon | WIP-Comment |
| Dynamic Programming | [518. Coin Change 2](https://leetcode.com/problems/coin-change-2) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/518._Coin_Change_2.java) | Unbounded Knapsack : for a>=c , dp[a] += dp[a-c]|
| WIP-Tag | 1507. Reformat Date | ComingSoon | WIP-Comment |
| WIP-Tag | 430. Flatten a Multilevel Doubly Linked List | ComingSoon | WIP-Comment |
| WIP-Tag | 1539. Kth Missing Positive Number | ComingSoon | WIP-Comment |
| WIP-Tag | 99. Recover Binary Search Tree | ComingSoon | WIP-Comment |
| WIP-Tag | 283. Move Zeroes | ComingSoon | WIP-Comment |
| WIP-Tag | 498. Diagonal Traverse | ComingSoon | WIP-Comment |
| WIP-Tag | 150. Evaluate Reverse Polish Notation | ComingSoon | WIP-Comment |
| WIP-Tag | 1275. Find Winner on a Tic Tac Toe Game | ComingSoon | WIP-Comment |
| WIP-Tag | 348. Design Tic-Tac-Toe | ComingSoon | WIP-Comment |
| WIP-Tag | 1465. Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts | ComingSoon | WIP-Comment |
| WIP-Tag | 658. Find K Closest Elements | ComingSoon | WIP-Comment |
| WIP-Tag | 974. Subarray Sums Divisible by K | ComingSoon | WIP-Comment |
| WIP-Tag | 2003. Smallest Missing Genetic Value in Each Subtree | ComingSoon | WIP-Comment |
| WIP-Tag | 364. Nested List Weight Sum II | ComingSoon | WIP-Comment |
| WIP-Tag | 938. Range Sum of BST | ComingSoon | WIP-Comment |
| WIP-Tag | 301. Remove Invalid Parentheses | ComingSoon | WIP-Comment |
| WIP-Tag | 208. Implement Trie (Prefix Tree) | ComingSoon | WIP-Comment |
| WIP-Tag | 198. House Robber | ComingSoon | WIP-Comment |
| WIP-Tag | 642. Design Search Autocomplete System | ComingSoon | WIP-Comment |
| WIP-Tag | 38. Count and Say | ComingSoon | WIP-Comment |
| Array | [349. Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/349._Intersection_of_Two_Arrays.java) | Use two sets and may use s1.retainAll(s2) |
| WIP-Tag | 133. Clone Graph | ComingSoon | WIP-Comment |
| WIP-Tag | 118. Pascal's Triangle | ComingSoon | WIP-Comment |
| WIP-Tag | 92. Reverse Linked List II | ComingSoon | WIP-Comment |
| WIP-Tag | 496. Next Greater Element I | ComingSoon | WIP-Comment |
| WIP-Tag | 279. Perfect Squares | ComingSoon | WIP-Comment |
| WIP-Tag | 442. Find All Duplicates in an Array | ComingSoon | WIP-Comment |
| WIP-Tag | 8. String to Integer (atoi) | ComingSoon | WIP-Comment |
| WIP-Tag | 1091. Shortest Path in Binary Matrix | ComingSoon | WIP-Comment |
| WIP-Tag | 943. Find the Shortest Superstring | ComingSoon | WIP-Comment |
| WIP-Tag | 1743. Restore the Array From Adjacent Pairs | ComingSoon | WIP-Comment |
| WIP-Tag | 1283. Find the Smallest Divisor Given a Threshold | ComingSoon | WIP-Comment |
| WIP-Tag | 67. Add Binary | ComingSoon | WIP-Comment |
| WIP-Tag | 493. Reverse Pairs | ComingSoon | WIP-Comment |
| WIP-Tag | 282. Expression Add Operators | ComingSoon | WIP-Comment |
| WIP-Tag | 1375. Number of Times Binary String Is Prefix-Aligned | ComingSoon | WIP-Comment |
| WIP-Tag | 441. Arranging Coins | ComingSoon | WIP-Comment |
| WIP-Tag | 953. Verifying an Alien Dictionary | ComingSoon | WIP-Comment |
| WIP-Tag | 438. Find All Anagrams in a String | ComingSoon | WIP-Comment |
| WIP-Tag | 670. Maximum Swap | ComingSoon | WIP-Comment |
| WIP-Tag | 1822. Sign of the Product of an Array | ComingSoon | WIP-Comment |
| WIP-Tag | 278. First Bad Version | ComingSoon | WIP-Comment |
| WIP-Tag | 274. H-Index | ComingSoon | WIP-Comment |
| WIP-Tag | 678. Valid Parenthesis String | ComingSoon | WIP-Comment |
| WIP-Tag | 1636. Sort Array by Increasing Frequency | ComingSoon | WIP-Comment |
| WIP-Tag | 26. Remove Duplicates from Sorted Array | ComingSoon | WIP-Comment |
| WIP-Tag | 123. Best Time to Buy and Sell Stock III | ComingSoon | WIP-Comment |
| WIP-Tag | 437. Path Sum III | ComingSoon | WIP-Comment |
| WIP-Tag | 939. Minimum Area Rectangle | ComingSoon | WIP-Comment |
| WIP-Tag | 1277. Count Square Submatrices with All Ones | ComingSoon | WIP-Comment |
| WIP-Tag | 1029. Two City Scheduling | ComingSoon | WIP-Comment |
| WIP-Tag | 359. Logger Rate Limiter | ComingSoon | WIP-Comment |
| WIP-Tag | 1008. Construct Binary Search Tree from Preorder Traversal | ComingSoon | WIP-Comment |
| WIP-Tag | 135. Candy | ComingSoon | WIP-Comment |
| WIP-Tag | 93. Restore IP Addresses | ComingSoon | WIP-Comment |
| WIP-Tag | 983. Minimum Cost For Tickets | ComingSoon | WIP-Comment |
| WIP-Tag | 204. Count Primes | ComingSoon | WIP-Comment |
| WIP-Tag | 755. Pour Water | ComingSoon | WIP-Comment |
| WIP-Tag | 268. Missing Number | ComingSoon | WIP-Comment |
| WIP-Tag | 408. Valid Word Abbreviation | ComingSoon | WIP-Comment |
| WIP-Tag | 432. All O`one Data Structure | ComingSoon | WIP-Comment |
| WIP-Tag | 780. Reaching Points | ComingSoon | WIP-Comment |
| WIP-Tag | 1220. Count Vowels Permutation | ComingSoon | WIP-Comment |
| WIP-Tag | 875. Koko Eating Bananas | ComingSoon | WIP-Comment |
| WIP-Tag | 668. Kth Smallest Number in Multiplication Table | ComingSoon | WIP-Comment |
| WIP-Tag | 428. Serialize and Deserialize N-ary Tree | ComingSoon | WIP-Comment |
| WIP-Tag | 1648. Sell Diminishing-Valued Colored Balls | ComingSoon | WIP-Comment |
| WIP-Tag | 992. Subarrays with K Different Integers | ComingSoon | WIP-Comment |
| WIP-Tag | 1531. String Compression II | ComingSoon | WIP-Comment |
| WIP-Tag | 1473. Paint House III | ComingSoon | WIP-Comment |
| WIP-Tag | 694. Number of Distinct Islands | ComingSoon | WIP-Comment |
| WIP-Tag | 647. Palindromic Substrings | ComingSoon | WIP-Comment |
| WIP-Tag | 1192. Critical Connections in a Network | ComingSoon | WIP-Comment |
| WIP-Tag | 64. Minimum Path Sum | ComingSoon | WIP-Comment |
| WIP-Tag | 980. Unique Paths III | ComingSoon | WIP-Comment |
| WIP-Tag | 1239. Maximum Length of a Concatenated String with Unique Characters | ComingSoon | WIP-Comment |
| WIP-Tag | 1509. Minimum Difference Between Largest and Smallest Value in Three Moves | ComingSoon | WIP-Comment |
| WIP-Tag | 63. Unique Paths II | ComingSoon | WIP-Comment |
| WIP-Tag | 65. Valid Number | ComingSoon | WIP-Comment |
| WIP-Tag | 468. Validate IP Address | ComingSoon | WIP-Comment |
| WIP-Tag | 912. Sort an Array | ComingSoon | WIP-Comment |
| WIP-Tag | 277. Find the Celebrity | ComingSoon | WIP-Comment |
| WIP-Tag | 1312. Minimum Insertion Steps to Make a String Palindrome | ComingSoon | WIP-Comment |
| WIP-Tag | 792. Number of Matching Subsequences | ComingSoon | WIP-Comment |
| WIP-Tag | 1043. Partition Array for Maximum Sum | ComingSoon | WIP-Comment |
| WIP-Tag | 1328. Break a Palindrome | ComingSoon | WIP-Comment |
| WIP-Tag | 772. Basic Calculator III | ComingSoon | WIP-Comment |
| WIP-Tag | 1110. Delete Nodes And Return Forest | ComingSoon | WIP-Comment |
| WIP-Tag | 632. Smallest Range Covering Elements from K Lists | ComingSoon | WIP-Comment |
| WIP-Tag | 1547. Minimum Cost to Cut a Stick | ComingSoon | WIP-Comment |
| WIP-Tag | 1319. Number of Operations to Make Network Connected | ComingSoon | WIP-Comment |
| WIP-Tag | 1994. The Number of Good Subsets | ComingSoon | WIP-Comment |
| WIP-Tag | 894. All Possible Full Binary Trees | ComingSoon | WIP-Comment |
| WIP-Tag | 1487. Making File Names Unique | ComingSoon | WIP-Comment |
| WIP-Tag | 19. Remove Nth Node From End of List | ComingSoon | WIP-Comment |
| WIP-Tag | 547. Number of Provinces | ComingSoon | WIP-Comment |
| Dynamic Programming | [494. Target Sum](https://leetcode.com/problems/target-sum/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/494._Target_Sum.java) | Backtracking/Brute-Force; Top-Down DP with Memoization; Bottom Up Algo; 1D DP |
| WIP-Tag | 1031. Maximum Sum of Two Non-Overlapping Subarrays | ComingSoon | WIP-Comment |
| WIP-Tag | 130. Surrounded Regions | ComingSoon | WIP-Comment |
| WIP-Tag | 407. Trapping Rain Water II | ComingSoon | WIP-Comment |
| WIP-Tag | 202. Happy Number | ComingSoon | WIP-Comment |
| WIP-Tag | 801. Minimum Swaps To Make Sequences Increasing | ComingSoon | WIP-Comment |
| WIP-Tag | 286. Walls and Gates | ComingSoon | WIP-Comment |
| WIP-Tag | 417. Pacific Atlantic Water Flow | ComingSoon | WIP-Comment |
| WIP-Tag | 167. Two Sum II - Input Array Is Sorted | ComingSoon | WIP-Comment |
| WIP-Tag | 114. Flatten Binary Tree to Linked List | ComingSoon | WIP-Comment |
| WIP-Tag | 346. Moving Average from Data Stream | ComingSoon | WIP-Comment |
| WIP-Tag | 57. Insert Interval | ComingSoon | WIP-Comment |
| WIP-Tag | 1881. Maximum Value after Insertion | ComingSoon | WIP-Comment |
| WIP-Tag | 679. 24 Game | ComingSoon | WIP-Comment |
| WIP-Tag | [137. Single Number II](https://leetcode.com/problems/single-number-ii/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/137._Single_Number_II.java) | Solving using HashMap/HashSet takes O(n) SC so Solve  BitManipulation for O(1) SC |
| WIP-Tag | 69. Sqrt(x) | ComingSoon | WIP-Comment |
| WIP-Tag | 188. Best Time to Buy and Sell Stock IV | ComingSoon | WIP-Comment |
| WIP-Tag | 616. Add Bold Tag in String | ComingSoon | WIP-Comment |
| WIP-Tag | 249. Group Shifted Strings | ComingSoon | WIP-Comment |
| WIP-Tag | 1347. Minimum Number of Steps to Make Two Strings Anagram | ComingSoon | WIP-Comment |
| WIP-Tag | 545. Boundary of Binary Tree | ComingSoon | WIP-Comment |
| WIP-Tag | 316. Remove Duplicate Letters | ComingSoon | WIP-Comment |
| Dynamic Programming | [152. Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/152._Maximum_Product_Subarray.java) | Keep track of prevMaxSoFar , newMaxSoFar , minSoFar to get result. Odd no of Negative numbers and zeros can be hurdles to build max prod subarray|
| WIP-Tag | 240. Search a 2D Matrix II | ComingSoon | WIP-Comment |
| WIP-Tag | 427. Construct Quad Tree | ComingSoon | WIP-Comment |
| WIP-Tag | 101. Symmetric Tree | ComingSoon | WIP-Comment |
| WIP-Tag | 1959. Minimum Total Space Wasted With K Resizing Operations | ComingSoon | WIP-Comment |
| WIP-Tag | 1423. Maximum Points You Can Obtain from Cards | ComingSoon | WIP-Comment |
| WIP-Tag | 226. Invert Binary Tree | ComingSoon | WIP-Comment |
| WIP-Tag | 450. Delete Node in a BST | ComingSoon | WIP-Comment |
| WIP-Tag | 181. Employees Earning More Than Their Managers | ComingSoon | WIP-Comment |
| WIP-Tag | 1092. Shortest Common Supersequence | ComingSoon | WIP-Comment |
| WIP-Tag | 73. Set Matrix Zeroes | ComingSoon | WIP-Comment |
| WIP-Tag | 164. Maximum Gap | ComingSoon | WIP-Comment |
| WIP-Tag | 463. Island Perimeter | ComingSoon | WIP-Comment |
| WIP-Tag | 1920. Build Array from Permutation | ComingSoon | WIP-Comment |
| WIP-Tag | 1838. Frequency of the Most Frequent Element | ComingSoon | WIP-Comment |
| WIP-Tag | 1923. Longest Common Subpath | ComingSoon | WIP-Comment |
| WIP-Tag | 363. Max Sum of Rectangle No Larger Than K | ComingSoon | WIP-Comment |
| WIP-Tag | 945. Minimum Increment to Make Array Unique | ComingSoon | WIP-Comment |
| WIP-Tag | 28. Implement strStr() | ComingSoon | WIP-Comment |
| WIP-Tag | 1248. Count Number of Nice Subarrays | ComingSoon | WIP-Comment |
| WIP-Tag | 259. 3Sum Smaller | ComingSoon | WIP-Comment |
| WIP-Tag | 516. Longest Palindromic Subsequence | ComingSoon | WIP-Comment |
| WIP-Tag | 30. Substring with Concatenation of All Words | ComingSoon | WIP-Comment |
| WIP-Tag | 445. Add Two Numbers II | ComingSoon | WIP-Comment |
| WIP-Tag | 105. Construct Binary Tree from Preorder and Inorder Traversal | ComingSoon | WIP-Comment |
| WIP-Tag | 1817. Finding the Users Active Minutes | ComingSoon | WIP-Comment |
| WIP-Tag | 979. Distribute Coins in Binary Tree | ComingSoon | WIP-Comment |
| WIP-Tag | 1166. Design File System | ComingSoon | WIP-Comment |
| WIP-Tag | 29. Divide Two Integers | ComingSoon | WIP-Comment |
| WIP-Tag | 486. Predict the Winner | ComingSoon | WIP-Comment |
| WIP-Tag | 1573. Number of Ways to Split a String | ComingSoon | WIP-Comment |
| WIP-Tag | 365. Water and Jug Problem | ComingSoon | WIP-Comment |
| WIP-Tag | 1143. Longest Common Subsequence | ComingSoon | WIP-Comment |
| WIP-Tag | 1712. Ways to Split Array Into Three Subarrays | ComingSoon | WIP-Comment |
| WIP-Tag | 221. Maximal Square | ComingSoon | WIP-Comment |
| WIP-Tag | 834. Sum of Distances in Tree | ComingSoon | WIP-Comment |
| WIP-Tag | 189. Rotate Array | ComingSoon | WIP-Comment |
| WIP-Tag | 854. K-Similar Strings | ComingSoon | WIP-Comment |
| WIP-Tag | 1383. Maximum Performance of a Team | ComingSoon | WIP-Comment |
| WIP-Tag | 662. Maximum Width of Binary Tree | ComingSoon | WIP-Comment |
| WIP-Tag | 340. Longest Substring with At Most K Distinct Characters | ComingSoon | WIP-Comment |
| WIP-Tag | 1188. Design Bounded Blocking Queue | ComingSoon | WIP-Comment |
| WIP-Tag | 836. Rectangle Overlap | ComingSoon | WIP-Comment |
| WIP-Tag | 977. Squares of a Sorted Array | ComingSoon | WIP-Comment |
| WIP-Tag | 587. Erect the Fence | ComingSoon | WIP-Comment |
| Bit Manipulation | [136. Single Number](https://leetcode.com/problems/single-number/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/136._Single_Number.java) | XOR all elememts |
| WIP-Tag | 160. Intersection of Two Linked Lists | ComingSoon | WIP-Comment |
| WIP-Tag | 321. Create Maximum Number | ComingSoon | WIP-Comment |
| WIP-Tag | 219. Contains Duplicate II | ComingSoon | WIP-Comment |
| WIP-Tag | 1348. Tweet Counts Per Frequency | ComingSoon | WIP-Comment |
| WIP-Tag | 805. Split Array With Same Average | ComingSoon | WIP-Comment |
| WIP-Tag | 223. Rectangle Area | ComingSoon | WIP-Comment |
| WIP-Tag | 116. Populating Next Right Pointers in Each Node | ComingSoon | WIP-Comment |
| WIP-Tag | 424. Longest Repeating Character Replacement | ComingSoon | WIP-Comment |
| WIP-Tag | 209. Minimum Size Subarray Sum | ComingSoon | WIP-Comment |
| WIP-Tag | 895. Maximum Frequency Stack | ComingSoon | WIP-Comment |
| WIP-Tag | 1086. High Five | ComingSoon | WIP-Comment |
| WIP-Tag | 1360. Number of Days Between Two Dates | ComingSoon | WIP-Comment |
| WIP-Tag | 402. Remove K Digits | ComingSoon | WIP-Comment |
| WIP-Tag | 354. Russian Doll Envelopes | ComingSoon | WIP-Comment |
| WIP-Tag | 165. Compare Version Numbers | ComingSoon | WIP-Comment |
| WIP-Tag | 480. Sliding Window Median | ComingSoon | WIP-Comment |
| WIP-Tag | 1395. Count Number of Teams | ComingSoon | WIP-Comment |
| WIP-Tag | 489. Robot Room Cleaner | ComingSoon | WIP-Comment |
| WIP-Tag | 131. Palindrome Partitioning | ComingSoon | WIP-Comment |
| WIP-Tag | 1027. Longest Arithmetic Subsequence | ComingSoon | WIP-Comment |
| WIP-Tag | 214. Shortest Palindrome | ComingSoon | WIP-Comment |
| WIP-Tag | 1854. Maximum Population Year | ComingSoon | WIP-Comment |
| WIP-Tag | 243. Shortest Word Distance | ComingSoon | WIP-Comment |
| WIP-Tag | 581. Shortest Unsorted Continuous Subarray | ComingSoon | WIP-Comment |
| WIP-Tag | 1610. Maximum Number of Visible Points | ComingSoon | WIP-Comment |
| WIP-Tag | 66. Plus One | ComingSoon | WIP-Comment |
| WIP-Tag | 628. Maximum Product of Three Numbers | ComingSoon | WIP-Comment |
| WIP-Tag | 611. Valid Triangle Number | ComingSoon | WIP-Comment |
| WIP-Tag | 1779. Find Nearest Point That Has the Same X or Y Coordinate | ComingSoon | WIP-Comment |
| WIP-Tag | 593. Valid Square | ComingSoon | WIP-Comment |
| WIP-Tag | 141. Linked List Cycle | ComingSoon | WIP-Comment |
| WIP-Tag | 309. Best Time to Buy and Sell Stock with Cooldown | ComingSoon | WIP-Comment |
| WIP-Tag | 769. Max Chunks To Make Sorted | ComingSoon | WIP-Comment |
| WIP-Tag | 729. My Calendar I | ComingSoon | WIP-Comment |
| Bit Manipulation | [371. Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers/) | [Java](https://github.com/JayTeli/leetcode-daily-problems-solutions/blob/master/src/java/371._Sum_of_Two_Integers.java) | a^b => sum of a and b without carry; (a&b)<<1 => carry; a^b => diff of a and n without borrow ; ((~x)&y)<<1 => borrow; loop conditions will be carry/borrow != 0; return sign*x |
| WIP-Tag | 172. Factorial Trailing Zeroes | ComingSoon | WIP-Comment |
| WIP-Tag | 168. Excel Sheet Column Title | ComingSoon | WIP-Comment |
| WIP-Tag | 539. Minimum Time Difference | ComingSoon | WIP-Comment |
| WIP-Tag | 542. 01 Matrix | ComingSoon | WIP-Comment |
| WIP-Tag | 535. Encode and Decode TinyURL | ComingSoon | WIP-Comment |
| WIP-Tag | 796. Rotate String | ComingSoon | WIP-Comment |
| WIP-Tag | 715. Range Module | ComingSoon | WIP-Comment |
| WIP-Tag | 158. Read N Characters Given read4 II - Call Multiple Times | ComingSoon | WIP-Comment |
| WIP-Tag | 733. Flood Fill | ComingSoon | WIP-Comment |
| WIP-Tag | 418. Sentence Screen Fitting | ComingSoon | WIP-Comment |
| WIP-Tag | 97. Interleaving String | ComingSoon | WIP-Comment |
| WIP-Tag | 753. Cracking the Safe | ComingSoon | WIP-Comment |
| WIP-Tag | 330. Patching Array | ComingSoon | WIP-Comment |
| WIP-Tag | 448. Find All Numbers Disappeared in an Array | ComingSoon | WIP-Comment |
| WIP-Tag | 592. Fraction Addition and Subtraction | ComingSoon | WIP-Comment |
| WIP-Tag | 1466. Reorder Routes to Make All Paths Lead to the City Zero | ComingSoon | WIP-Comment |
| WIP-Tag | 1130. Minimum Cost Tree From Leaf Values | ComingSoon | WIP-Comment |
| WIP-Tag | 449. Serialize and Deserialize BST | ComingSoon | WIP-Comment |
| WIP-Tag | 272. Closest Binary Search Tree Value II | ComingSoon | WIP-Comment |
| WIP-Tag | 564. Find the Closest Palindrome | ComingSoon | WIP-Comment |
| WIP-Tag | 229. Majority Element II | ComingSoon | WIP-Comment |
| WIP-Tag | 856. Score of Parentheses | ComingSoon | WIP-Comment |
| WIP-Tag | 378. Kth Smallest Element in a Sorted Matrix | ComingSoon | WIP-Comment |
| WIP-Tag | 102. Binary Tree Level Order Traversal | ComingSoon | WIP-Comment |
| WIP-Tag | 344. Reverse String | ComingSoon | WIP-Comment |
| WIP-Tag | 490. The Maze | ComingSoon | WIP-Comment |
| WIP-Tag | 1799. Maximize Score After N Operations | ComingSoon | WIP-Comment |
| WIP-Tag | 1074. Number of Submatrices That Sum to Target | ComingSoon | WIP-Comment |
| WIP-Tag | 129. Sum Root to Leaf Numbers | ComingSoon | WIP-Comment |
| WIP-Tag | 419. Battleships in a Board | ComingSoon | WIP-Comment |
| WIP-Tag | 24. Swap Nodes in Pairs | ComingSoon | WIP-Comment |
| WIP-Tag | 205. Isomorphic Strings | ComingSoon | WIP-Comment |
| WIP-Tag | 721. Accounts Merge | ComingSoon | WIP-Comment |
| WIP-Tag | 568. Maximum Vacation Days | ComingSoon | WIP-Comment |
| WIP-Tag | 770. Basic Calculator IV | ComingSoon | WIP-Comment |
| WIP-Tag | 591. Tag Validator | ComingSoon | WIP-Comment |
| WIP-Tag | 1046. Last Stone Weight | ComingSoon | WIP-Comment |
| WIP-Tag | 1333. Filter Restaurants by Vegan-Friendly, Price and Distance | ComingSoon | WIP-Comment |
| WIP-Tag | 631. Design Excel Sum Formula | ComingSoon | WIP-Comment |
| WIP-Tag | 456. 132 Pattern | ComingSoon | WIP-Comment |
| WIP-Tag | 1963. Minimum Number of Swaps to Make the String Balanced | ComingSoon | WIP-Comment |
| WIP-Tag | 1139. Largest 1-Bordered Square | ComingSoon | WIP-Comment |
| WIP-Tag | 1834. Single-Threaded CPU | ComingSoon | WIP-Comment |
| WIP-Tag | 40. Combination Sum II | ComingSoon | WIP-Comment |
| WIP-Tag | 622. Design Circular Queue | ComingSoon | WIP-Comment |
| WIP-Tag | 1948. Delete Duplicate Folders in System | ComingSoon | WIP-Comment |
| WIP-Tag | 850. Rectangle Area II | ComingSoon | WIP-Comment |
| WIP-Tag | 844. Backspace String Compare | ComingSoon | WIP-Comment |
| WIP-Tag | 876. Middle of the Linked List | ComingSoon | WIP-Comment |
| WIP-Tag | 1428. Leftmost Column with at Least a One | ComingSoon | WIP-Comment |
| WIP-Tag | 927. Three Equal Parts | ComingSoon | WIP-Comment |
| WIP-Tag | 1878. Get Biggest Three Rhombus Sums in a Grid | ComingSoon | WIP-Comment |
| WIP-Tag | 451. Sort Characters By Frequency | ComingSoon | WIP-Comment |
| WIP-Tag | 384. Shuffle an Array | ComingSoon | WIP-Comment |
| WIP-Tag | 1017. Convert to Base -2 | ComingSoon | WIP-Comment |
| WIP-Tag | 1615. Maximal Network Rank | ComingSoon | WIP-Comment |
| WIP-Tag | 838. Push Dominoes | ComingSoon | WIP-Comment |
| WIP-Tag | 847. Shortest Path Visiting All Nodes | ComingSoon | WIP-Comment |
| WIP-Tag | 1823. Find the Winner of the Circular Game | ComingSoon | WIP-Comment |
