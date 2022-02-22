https://leetcode.com/problems/excel-sheet-column-number/
// Algo 1 : Iteration - Right to Left : O(n) , O(1)
class Solution {
    public int titleToNumber(String s) {
        int result = 0 , n = s.length();
        Map<Character , Integer> alphabetMap = new HashMap<>();
        for(int i = 0 ; i < 26 ; i++) {
            alphabetMap.put((char)(i+65) , i+1); // i+65 to convert int to ascii value of A.. i+1 as 1-indexed
        }
        for (int i = 0; i < n; i++) {
            char c = s.charAt(n-1-i);
            result += alphabetMap.get(c)*Math.pow(26,i); 
        }
        return result;
    }
}
// Algo 2 : Iteration - Left to Right : O(n) , O(1)
class Solution {
    public int titleToNumber(String s) {
        int result = 0 , n = s.length();
        for(int i = 0 ; i < n ; i++) {
            result = result*26 + (s.charAt(i)-'A'+1); 
        }
        return result;
    }
}