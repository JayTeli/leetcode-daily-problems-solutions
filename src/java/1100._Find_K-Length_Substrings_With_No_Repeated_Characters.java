https://leetcode.com/problems/find-k-length-substrings-with-no-repeated-characters/
// Algo 1 : Sliding Window : O(n) , O(1)
class Solution {
    public int numKLenSubstrNoRepeats(String s, int k) {
        if(k > 26) return 0;
        int[] freq = new int[26];
        int ans = 0 , n = s.length() , left = 0 , right = 0;
        while(right < n) {
            ++freq[s.charAt(right) - 'a'];  // new element added to right
            while(freq[s.charAt(right) - 'a'] > 1) { // Shrink from left
                --freq[s.charAt(left) - 'a'];
                left++;
            }
            // if windowLength = k , ans++ and shrink from left
            if(right - left + 1 == k) {
                ans++;
                --freq[s.charAt(left) - 'a'];
                left++;
            }
            right++;    // Expand from right   
        }
        return ans;
        
    }
}