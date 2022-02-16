https://leetcode.com/problems/longest-repeating-character-replacement/
// Algo 1 : Sliding Window : O()
// (Discussion comment : https://leetcode.com/problems/longest-repeating-character-replacement/discuss/91271/Java-12-lines-O(n)-sliding-window-solution-with-explanation/137008)
// If no of other characters (other than high freq char) is more than k then shrink window.
// Shrink : ((windowEnd-windowStart + 1) - maxFreqInWindow) > k
class Solution {
    public int characterReplacement(String s, int k) {
        int[] charFreq = new int[26];
        int windowStart = 0 , maxFreqInWindow = 0 , longestSubstringWithSameChar = 0 , n = s.length();
        for(int windowEnd = 0 ; windowEnd < n ; windowEnd++) {
            maxFreqInWindow = Math.max(maxFreqInWindow , ++charFreq[s.charAt(windowEnd) - 'A']);
            if((windowEnd-windowStart + 1) - maxFreqInWindow > k) { // no of other characters (other than high freq char) is more than k then shrink window.
                --charFreq[s.charAt(windowStart) - 'A'];    // decrease leftmost char freq
                windowStart++;                              // remove leftmost char from window
            }
            longestSubstringWithSameChar = Math.max(longestSubstringWithSameChar , windowEnd-windowStart + 1);
        }
        return longestSubstringWithSameChar;
    }
}