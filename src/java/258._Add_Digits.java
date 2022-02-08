https://leetcode.com/problems/add-digits
// Algo 1 : Brute force : O(n) , O(1)
class Solution {
    public int addDigits(int n) {
        while(n > 9) {
            n = sumOfDigits(n);
        }
        return n;
    }
    private int sumOfDigits(int n) {
        int digit = 0 , sum = 0;
        while(n > 0) {
            digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
}
// Algo 2 : Digit Root (Math) : O(1) , O(1)
class Solution {
    public int addDigits(int num) {
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
}