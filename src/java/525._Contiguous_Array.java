https://leetcode.com/problems/contiguous-array/
// Algo 1 : Using HashMap : O(n) , O(n)
// 1. count : For 1 => count++ , 0 => count--
// 2. HashMap : key=count , value=leftmostIndexWithCountMap
// 3. maxLength for a existing count = currentIndex-leftmostIndexWithCountMap
public class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer , Integer> leftmostIndexWithCountMap = new HashMap<>();
        leftmostIndexWithCountMap.put(0 , -1);
        int maxLength = 0 , countSoFar = 0;
        for(int currentIndex = 0 ; currentIndex < nums.length ; currentIndex++) {
            countSoFar = countSoFar + ((nums[currentIndex] == 0) ? -1 : 1);
            if(leftmostIndexWithCountMap.containsKey(countSoFar)) {
                maxLength = Math.max(maxLength , currentIndex - leftmostIndexWithCountMap.get(countSoFar));
            } else {
                leftmostIndexWithCountMap.put(countSoFar , currentIndex);
            }
        }
        return maxLength;
    }
}