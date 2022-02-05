https://leetcode.com/problems/climbing-stairs/
// Algo 1 : Recursion : O(2^n) , O(n)
// 1. time complexity of recursive function:
// 2. let rec function be r(n) ... let c = constant like 1,2,etc
// 3. calling it once r(n-c) => O(n) ... 
// 4. calling it once r(n/c) => logn(base c)
// 5. calling it twice r(n-c), r(n-c) => 2^n
// 6. calling it twice r(n/c), r(n/c) => 2^(logn with base c)?
// 7. climbStairs(i) = climbStairs(i+1) + climbStairs(i+2)
public class Solution {
    private int n;
    public int climbStairs(int n) {
        this.n = n;
        return climb(0);
    }
    public int climb(int i) {
        if (i > n) return 0;
        if (i == n) return 1;
        return climb(i + 1) + climb(i + 2);
    }
}
// Algo 2 : Recursion with Memo : O(n) , O(n)
// 1. TC : Without Memo : O(2^n) , With Memo : O(n)
public class Solution {
    private int[] memo;
    private int n;
    public int climbStairs(int n) {
        this.n = n;
        initMemo();
        return climb(0);
    }
    private void initMemo() {
        memo = new int[1+n];
        Arrays.fill(memo , -1);
    }
    public int climb(int i) {
        if(i > n) return 0;
        if(i == n) return 1;
        if(memo[i] != -1) return memo[i];
        memo[i] = climb(i+1) + climb(i+2);
        return memo[i];
    }
}
// Algo 3 : DP : O(n) , O(n)
// 1. ith step can be reached from (i-1)th step or (i-2)th step.
// 2. Thus , dp[i] = dp[i-1] + dp[i-2]
class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        int[] dp = new int[n+1];
        dp[1] = 1; dp[2] = 2;
        for(int i = 3 ; i < n ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];   // Mistake : not n-1
    }
}
// Algo 4 : Fibonacci number : O(n) , O(1)
// 1. f(n)=f(n−1)+f(n−2) , f(1) = 1 , f(2) = 2
class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        int first = 1 , second = 2;
        for(int i = 3 ; i <= n ; i++) {
            int third = first + second;
            first = second;
            second = third;
        } 
        return second; // second
    }
}
// Algo 5 : Nth Fibonacci number formula : O(logn) , O(1)
// 1.Fn = (1/sqrt(5)) *[x^n - y^n] .. x = (1+sqrt(5))/2 , y = (1-sqrt(5))/2
public class Solution {
    public int climbStairs(int n) {
        double sqrt5 = Math.sqrt(5);
        double fibn=Math.pow((1+sqrt5)/2,n+1)-Math.pow((1-sqrt5)/2,n+1);
        return (int)(fibn/sqrt5);
    }
}
