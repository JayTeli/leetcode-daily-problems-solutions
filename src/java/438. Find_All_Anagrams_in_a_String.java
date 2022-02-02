https://leetcode.com/problems/find-all-anagrams-in-a-string/
// Algo 1 : Sliding Window + Array : O(m*n) , O() 
// Instead of HashMap , array is used to store freq as no of unique letters in p are fixed i.e. a-z
// calc pFreq (char Freq) , take each index in s as start index and window of length pLength , cal sFreq. if sFreq = pFreq then anagram
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int sLength = s.length() , pLength = p.length();
        
        List<Integer> result = new ArrayList<>();
        if(sLength < pLength) return result;
        
        int[] pFreq = new int[26];
        for(int i = 0 ; i < pLength ; i++) {
           ++pFreq[p.charAt(i) - 'a'];
        }
        
        int[] sFreq = new int[26]; int windowSize = pLength;
        for(int startIndex = 0 ; startIndex < sLength ; startIndex++) {
            sFreq = new int[26];
            if(startIndex + windowSize > sLength) continue; // Mistake : > and not >=
            for(int i = startIndex ; i < startIndex + windowSize ; i++) {
                ++sFreq[s.charAt(i) - 'a'];
            }
            boolean isAnagram = true;
            for(int i = 0 ; i < pLength ; i++) {
                int ascii = p.charAt(i) - 'a';
                if(sFreq[ascii] != pFreq[ascii]) {
                    isAnagram = false;
                    break;
                } 
            }
            if(isAnagram) {
                result.add(startIndex);
            }
        }
        return result;
    }
}
// Algo 2 : Sliding Window + Array : O(m+n) , O(1) 
// 1. Time complexity optimized , instead of recal sFreq at each startIndex in algo 1 ,
// 2. current index always increase freq.
// 3. Element leaving from left end will decrease freq of char that left.
// 4. if sFreq = pFreq , cal startIndex = currentIndex - pLength + 1 and add to result
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int sLength = s.length() , pLength = p.length();
        
        List<Integer> result = new ArrayList<>();
        if(sLength < pLength) return result;
        
        int[] pFreq = new int[26];
        for(int i = 0 ; i < pLength ; i++) ++pFreq[p.charAt(i) - 'a'];
        
        int[] sFreq = new int[26];
        for(int currentIndex = 0 ; currentIndex < sLength ; currentIndex++) {
            ++sFreq[s.charAt(currentIndex) - 'a']; // increase freq of current char
            if(currentIndex >= pLength) --sFreq[s.charAt(currentIndex-pLength) - 'a']; // Decrease freq of char that left window from left end
            if (Arrays.equals(sFreq, pFreq)) result.add(currentIndex - pLength + 1); // if arr equal , add startIndex = currentIndex - pLength + 1
        }
        return result;
    }
}