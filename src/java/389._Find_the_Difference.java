https://leetcode.com/problems/find-the-difference/
// Algo 1 : Sorting (Brute force) : O(nlogn) , O(n)
// After Sorting strings , compare strings char-by-char and return first mismatch char 
class Solution {
    public char findTheDifference(String s, String t) {
        char[] sa = s.toCharArray(); char[] ta = t.toCharArray();
        Arrays.sort(sa); Arrays.sort(ta);
        int i = 0;
        while(i < sa.length) {
            if(sa[i] != ta[i]) 
                return ta[i];
            i++;
        }
        return ta[i];
    }
}
// Algo 2 : Using HashMap : O(n) , O(1)
class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++) {
             char c = s.charAt(i);
             map.put(c , 1 + map.getOrDefault(c , 0));
        }       
        char ans = '\0'; // default value for char in java
        for(char c : t.toCharArray()) {
            int count = map.getOrDefault(c , 0);
            if(count == 0) {
                ans = c;
                break;
            } else {
                map.put(c , count-1 );
            }
        }
        return ans;
    }
}
// Algo 3 : Bit manipulation - One-Pass : O(n),O(1) 
// After XOR : same characters get removed
// 0 ^ a = a and a ^ a = 0
class Solution {
    public char findTheDifference(String s, String t) {
        char x = t.charAt(t.length()-1); // Mistake
        for(int i = 0 ; i < s.length() ; i++) {
            x ^= s.charAt(i);
            x ^= t.charAt(i);
        }       
        return x;
    }
}