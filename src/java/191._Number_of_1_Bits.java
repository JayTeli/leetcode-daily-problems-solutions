https://leetcode.com/problems/number-of-1-bits
// Algo 1 : Loop + bitwise-And with mask : O(1) , O(1)
// 1. Get ith bit using bitwise-AND to a bit mask.
// 2. m=1  then left shift by 1 
public class Solution {
    public int hammingWeight(int n) {
        int hammingWeight = 0 , mask = 1;
        for(int i = 0 ; i < 32 ; i++) { // 32 coz n is 32 bit unsigned int
            if((n & mask) != 0)        // Replacing !=0 by ==1 gives wrong ans
                ++hammingWeight;
            mask <<= 1;             // same as mask = mask << 1
        }
        return hammingWeight;
    }
}
// Algo 2 : 
// 1. (n & (n-1)) flips the rightmost 1 (LSB 1-bit).
// 2. hammingweight = #flips until no becomes 0
class Solution {
    public int hammingWeight(int n) {
        int hammingWeight = 0;
        while (n != 0) {
            n &= (n-1);         // same as n = n&(n-1); this flips rightmost 1-bit to 0.
            hammingWeight++;
        }
        return hammingWeight;
    }
}