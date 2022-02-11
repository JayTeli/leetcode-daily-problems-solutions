https://leetcode.com/problems/permutation-in-string
// Algo 1 : Using Freq Array : O(l1+26*l1*(l2-l1)) , O(1)
// p(s1) is substring of s2 if some substring in s2 contains same charFreq as charFreq of s1.
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length() , l2 = s2.length();
        if(l1 > l2) return false;
        int[] s1CharFreq = getCharFreq(s1 , l1);
        for(int i = 0 ; i <= l2 - l1 ; i++) { // Mistake : <= and not <
            int[] s2SubstringCharFreq = getCharFreq(s2.substring(i , i+l1) , l1);
            if(isSameFreq(s1CharFreq , s2SubstringCharFreq))
                return true;
        }
        return false;
    }
    private int[] getCharFreq(String s , int l) {
        int[] freq = new int[26];
        for(int i = 0 ; i < l ; i++)
            ++freq[s.charAt(i) - 'a'];
        return freq;
    }
    private boolean isSameFreq(int[] ca1 , int[] ca2) {
        for(int i = 0; i < 26 ; i++) {
            if(ca1[i] != ca2[i])
                return false;
        }
        return true;
    }
    
}
// Algo 2 : Sliding Window (with optimization): O(l1+(l2-l1)) , O(1)
public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length() , l2 = s2.length();
        if (l1 > l2) return false;
        int[] s1CharFreq = new int[26];
        int[] s2CharFreq = new int[26];
        for (int i = 0; i < l1; i++) {
            ++s1CharFreq[s1.charAt(i) - 'a'];
            ++s2CharFreq[s2.charAt(i) - 'a'];
        }
        
        int noOfCharsWithSameFreq = 0;
        for (int i = 0; i < 26; i++)
            if (s1CharFreq[i] == s2CharFreq[i])
                noOfCharsWithSameFreq++;
                
        for (int i = 0; i < l2 - l1; i++) {
            int left = s2.charAt(i) - 'a' , right = s2.charAt(i+l1) - 'a';
            if (noOfCharsWithSameFreq == 26)
                return true;
            s2CharFreq[right]++;
            if (s2CharFreq[right] == s1CharFreq[right])
                noOfCharsWithSameFreq++;
            else if (s2CharFreq[right] == s1CharFreq[right] + 1)
                noOfCharsWithSameFreq--;
            
            s2CharFreq[left]--;
            if (s2CharFreq[left] == s1CharFreq[left])
                noOfCharsWithSameFreq++;
            else if (s2CharFreq[left] == s1CharFreq[left] - 1)
                noOfCharsWithSameFreq--;
        }
        return noOfCharsWithSameFreq == 26;
    }
}