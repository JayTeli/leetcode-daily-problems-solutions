// Algo 1 : Bit Manipulation : O(1) , O(1)
public class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; ++i) {
            result = result<<1  | (n & 1);
            n >>>= 1;
        }
        return result;
    }
}