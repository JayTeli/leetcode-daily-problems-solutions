https://leetcode.com/problems/sum-of-two-integers
// Algo 1 : Bit Manipulation : O(1) , O(1)
// 1. Java : Bitwise XOR = ^ , Bitwise Not = ~
// 2. Start by computing XOR of input data.
// 3. a^b => sum of a and b without carry
// 4. (a&b)<<1 => carry
// 5. x = abs(a) , y = abs(b)
// 6. loop condition : carry != 0
// 7. x = x^y , y = (x&y)<<1
// 8. x will hold sum after loop
// 9. a^b => diff of a and n without borrow
// 10. ((~x)&y)<<1 => borrow
// 11. loop condition : borrow != 0
// 12. slly , x will hold diff of a and b
// 13. return x*sign;
// 14. To ensure abs(a) > abs(b) , check and if smalle return getSum(b, a);
// 15. sign of result = sign of greatear no = sign of a
class Solution {
    public int getSum(int a, int b) {
        int x = Math.abs(a) , y = Math.abs(b);
        if(x < y) return getSum(b , a); // ensuring abs(a) >= abs(b)
        int sign = a > 0 ? 1 : -1;      // sign of result = sign of greatear no = sign of a
        int ans = 0 , carry = 0 , borrow = 0;
        if(a*b >= 0) {  // both +ve / both -ve , so get sum
            while(y != 0) {
                ans = x ^ y;            // x+y without carry
                carry = (x & y) << 1;   // carry
                x = ans;                // x+y
                y = carry;              // carry
            }
        } else {        // one +ve and other -ve . so get diff
            while(y != 0) {
                ans = x ^ y;                // x-y without borrow
                borrow = ((~x) & y) << 1;   // borrow
                x = ans;                    // x-y
                y = borrow;                 // borrow
            }
        }
        return sign * x;    // return with sign
    }
}
// Algo 2 : Bit Manipulation with Java's Internal handling : O(1) , O(1)
// Using two's complementation representation , java internally handles negative nos , signs , subtractions , so code gets simplified.
class Solution {
    public int getSum(int a , int b) {
        int ans = 0 , carry = 0;
        while(b != 0) {
            ans = a ^ b;
            carry = (a & b) << 1;
            a = ans;
            b = carry;
        }
        return a;
    }
}