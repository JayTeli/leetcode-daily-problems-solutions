// Algo 1 : Divide and conquer : O(n^2) , O(n)
// 1. divideAnConquer DNQ : dnq[start , end] = Math.max (dnq[start , end1] , [start2 , end])
// 2. end1 = leftmostInvalid-1 , start2 = leftmostValid-after-leftmostInvalid i.e. leftmostValid in range [1+leftmostInvalid , end]
// 3. Valid => freq of char is >= k , Invalid => freq of char < k
// 4. IMP : freq should be recal to get leftmostInvalid and leftmostValid coz ranges for which they are calc is diff.
// 5. while calc freq , both start and end are inclusive
// 6. length of range [start end]= end-start + 1 and not end-start
public class Solution {
    private String s;
    private int k;
    private int n;
    public int longestSubstring(String s, int k) {
        this.s = s; this.k = k; this.n = s.length();
        return longestSubstringInRange(0 , n-1);
    }
    private int longestSubstringInRange(int start , int end) {
        if(start < 0 || end < 0 || end-start+1 < k) // Mistake : missed +1 in end-start+1
                return 0;
        
        // divit start in 2 ranges [start1 , end1] , [start2 , end2]
        int leftmostInvalid = leftmostInvalid(start , end); 
        if(leftmostInvalid == -1) return (end - start+1);   // longest valid substr is full string as all valid .. 
        int start1 = start;
        int end1 = leftmostInvalid-1; // leftmostInvalid-1 gives wrong ans
        int start2 = leftmostValid(1+leftmostInvalid , end);   // Note : 1+
        int end2 = end;
        // Divide
        int max1 = longestSubstringInRange(start1 , end1);
        int max2 = longestSubstringInRange(start2 , end2);
        // Conquer
        return Math.max(max1 , max2);
    }
    
    private int leftmostInvalid(int start , int end) {
        int[] freq = new int[26];
        for(int i = start ; i <= end; i++) 
                ++freq[s.charAt(i) - 'a'];
        
        for(int i = start ; i <= end ; i++)     // Mistake : <= end and not < end
                if(freq[s.charAt(i) - 'a'] < k)// Mistake : freq[s.charAt(i) - 'a'] and not freq[i]
                    return i;
        return -1;
    }
    
    private int leftmostValid(int start , int end) {
        int[] freq = new int[26];
        for(int i = start ; i <= end; i++)  // Recal freq for leftmostInvalid as range is diff for leftmost Valid and lefmost Invalid
                ++freq[s.charAt(i) - 'a'];
        
        for(int i = start ; i <= end ; i++)  // Mistake : <= end and not < end
                if(freq[s.charAt(i) - 'a'] >= k) // Mistake : freq[s.charAt(i) - 'a'] and not freq[i]
                    return i;
        return -1;
    }
}
// Algo 2 : Sliding Window : O(n) , O(1)
// 1. instead of iterating over window of all size , outer loop iterates only on no of unique chars in string.
// 2. in each loop , we expand or shink window , noOfUnique chars <= currentUnique => expand from right , noOfUnique chars > currentUnique => shrink from left.
// 3. while expanding , we update uniqueSoFar , lettersWithAtleastKFreq and freq of newly added char. Slly for shrinking
// 4. after expand/shrink , if uniqueSoFar == uniqueLettersInSubstring && uniqueSoFar == lettersWithAtleastKFreq , then update result
public class Solution {
    public int longestSubstring(String s, int k) {
        char[] ca = s.toCharArray();
        int[] freq = new int[26];
        int noOfUniqueLettersInString = getUniqueLettersCount(ca);
        int result = 0;
        for(int uniqueLettersInSubstring = 1 ; uniqueLettersInSubstring <= noOfUniqueLettersInString ; uniqueLettersInSubstring++) {
            Arrays.fill(freq,0); // Reset freq
            int uniqueSoFar = 0 , lettersWithAtleastKFreq = 0;
            int windowStart = 0 , windowEnd = 0;
            while(windowEnd < ca.length) {
                if(uniqueSoFar <= uniqueLettersInSubstring) {// expand window
                    int newEndAscii = ca[windowEnd] - 'a';
                    if(freq[newEndAscii] == 0) ++uniqueSoFar; // update uniqueSoFar
                    ++freq[newEndAscii];      // update freq
                    if(freq[newEndAscii] == k) ++lettersWithAtleastKFreq; // lettersWithAtleastKFreq;
                    windowEnd++;    // expanding
                } else {    // shrink window
                    int oldStartAscii = ca[windowStart] - 'a';
                    if(freq[oldStartAscii] == k) --lettersWithAtleastKFreq;
                    --freq[oldStartAscii];
                    if(freq[oldStartAscii] == 0) --uniqueSoFar;
                    windowStart++;
                }
                if(uniqueSoFar == uniqueLettersInSubstring && uniqueSoFar == lettersWithAtleastKFreq) {
                    result = Math.max(result , windowEnd - windowStart);
                }
            }
        }
        return result;
    }
    private int getUniqueLettersCount(char[] ca) {
        Set<Character> unique = new HashSet<>();
        for(char c : ca)
                unique.add(c);
        return unique.size();
    }
}