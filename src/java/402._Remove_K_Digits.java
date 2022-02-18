https://leetcode.com/problems/remove-k-digits/
// Algo 1 : Greedy : O(n) , O(n)
// 1. While iterating over char of string , pop all elements of stack that are greater than current digit and then push current digit.
// 2. if k is still +ve and stack is not empty , remaining no is monotonically increasing. so pop first k elements directly.
// 3. ans = stack bottom to stack top , with leading zeros excluded.
class Solution {
    public String removeKdigits(String s, int k) {
        Stack<Character> stack = new Stack<>();
        for(char digit : s.toCharArray()) {
            while(k > 0 && !stack.isEmpty() && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);  // Mistake : missed
        }
        if(k > 0 && !stack.isEmpty()) {
            for(int i = 0 ; i < k ; i++) {
                stack.pop();
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        ans.reverse();   // Important
        while(ans.length() > 0 && ans.charAt(0) == '0') { // delete leading zeros
            ans.deleteCharAt(0);
        }
        
        return ans.length() > 0 ? ans.toString() : "0";
    }
}