https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
// Algo 1 : Left Shift Array to override dupdes : O(n^2) , O(1)
class Solution {    
    public int removeDuplicates(int[] nums) {
        int i = 1, count = 1, length = nums.length;
        while (i < length) {    
        if (nums[i] == nums[i - 1]) {
                count++;
                if (count > 2) {
                    leftShiftArrayByOne(nums, i);
                    i--; // decrement i to avoid arrayIndex out of bounds
                    length--;
                }
            } else {
                count = 1;  // unique element count , so reset to 1
            }
            i++;
        }       
        return length;
    }
    // Left shift all element from index+1 to left by one step
    private int[] leftShiftArrayByOne(int[] a, int index) {
        for (int i = index+1; i < a.length; i++) {
            a[i-1] = a[i];
        }
        return a;
    }    
}
// Algo 2 : Two pointers : O(n) , O(1)
// 1. Keep track of uniqueFoundSoFar,consecutiveFreq
// 2. Two pointer : i (index) , uniqueFoundSoFar
// 3. if adjecent dupes , consecutiveFreq++ else consecutiveFreq=1
// 4. if consecutiveFreq<=2, set consecutiveFreqTH index with current element and consecutiveFreq uniqueFoundSoFar++;
class Solution {
    public int removeDuplicates(int[] a) {
        int uniqueFoundSoFar = 1, consecutiveFreq = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) consecutiveFreq++;
            else consecutiveFreq = 1;
            if (consecutiveFreq <= 2) {
                a[uniqueFoundSoFar] = a[i];
                uniqueFoundSoFar++;
            }
        }
        return uniqueFoundSoFar;
    }
}