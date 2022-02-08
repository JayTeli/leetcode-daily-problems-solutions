https://leetcode.com/problems/counting-bits
// Algo 1 : Hamming Weight : O(nlogn) , O(1)
public class Solution {
    private int hammingWeight(int x) {  // No of 1s in a number
        int count = 0;
        while (x != 0) {
            x &= x - 1; // zeroing out the least significant nonzero bit
            count++;
        }
        return count;
    }

    public int[] countBits(int n) {
        int[] hammingWeightArray = new int[n + 1];
        for (int i = 0; i <= n; i++)
            hammingWeightArray[i] = hammingWeight(i);
        return hammingWeightArray;
    }
}
// Algo 2 : DP + MSB : O(n) , O(1)
public class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        int x = 0 , b = 1;   
        while (b <= n) {                    // [0, b) is calculated
            while (x < b && (x+b) <= n) {   // generate [b, 2b) or [b, n) from [0, b)
                ans[x+b] = ans[x] + 1;
                x++;
            }                         
            x = 0;      // reset x
            b <<= 1;    // b = 2b
        }
        return ans;
    }
}
// Algo 3 : DP + LSB : O(n) , O(1)
public class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int x = 1; x <= n; ++x) {
            // x / 2 is x >> 1 and x % 2 is x & 1
            ans[x] = ans[x >> 1] + (x & 1); 
        }
        return ans;
    }
}
// Algo 4 : DP + Last Set Bit : O(n) , O(1)
public class Solution {
    public int[] countBits(int num) {
        int[] ans = new int[num + 1];
        for (int x = 1; x <= num; ++x) {
            ans[x] = ans[x & (x - 1)] + 1;
        }
        return ans;
    }
}
