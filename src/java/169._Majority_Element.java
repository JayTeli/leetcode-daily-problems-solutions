https://leetcode.com/problems/majority-element/
// Algo 1 : HashMap : O(n) , O(n)
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer , Integer> freqMap = new HashMap<>();
        for(int n : nums) {
            freqMap.put(n , 1 + freqMap.getOrDefault(n, 0));
        }
        int maxFreq = Integer.MIN_VALUE , maxFreqElement = 0;
        for(Map.Entry<Integer , Integer> entry : freqMap.entrySet()) {
            int element = entry.getKey() , freq = entry.getValue();
            if(freq > maxFreq) {
                maxFreqElement = element;
                maxFreq = freq;
            }
        }
        return maxFreqElement;
    }
}
// Algo 2 : HashMap : O(nlogn) , O(n)
// since max Freq element has freq >= floor(n/2) and so it will be present at center after sorting.
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
// Algo 3 : Boyer-Moore Voting Algorithm : O(n) , O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0 , candidate = 0;
        for(int n : nums) {
            if(count == 0) candidate = n;
            if(n == candidate) count++;
            else count--;
        }
        return candidate;
    }
}