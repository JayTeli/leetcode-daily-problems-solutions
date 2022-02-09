// Algo 1 : Top-Down DP With Memoization : O(m*(n^2)) , O(mn)
class Solution {
    private int[][] memo;
    private String s1;
    private String s2;
    private int l1;
    private int l2;
    public int longestCommonSubsequence(String s1, String s2) {
        init(s1 , s2);
        return longestCommonSubsequenceFromIndex(0 , 0);
    }
    private void init(String s1 , String s2) {
        this.s1 = s1; this.s2 = s2;
        this.l1 = s1.length(); this.l2 = s2.length();
        this.memo = new int[l1+1][l2+1];
        for(int i = 0 ; i < l1 ; i++) {
            for(int j = 0 ; j < l2 ; j++) {
                this.memo[i][j] = -1;
            }
        }
    }
    private int longestCommonSubsequenceFromIndex(int start1 , int start2) {
        if(memo[start1][start2] != -1)
                return memo[start1][start2];
        int lcsIfSkipped = longestCommonSubsequenceFromIndex(1+start1 , start2); // s1[start] is not included in solution
        
        char c = s1.charAt(start1);
        int firstOccuranceOfCinS2AtOrAfterStart2 = s2.indexOf(c , start2);  // get firstOccuranceOfCinS2AtOrAfterStart2
        int lcsIfIncluded = 0;
        if(firstOccuranceOfCinS2AtOrAfterStart2 != -1) {
            lcsIfIncluded = 1 + longestCommonSubsequenceFromIndex(1 + start1 , 1 + firstOccuranceOfCinS2AtOrAfterStart2);
        }
        memo[start1][start2] = Math.max(lcsIfSkipped , lcsIfIncluded);
        return memo[start1][start2];
    }    
}
// Algo 2 : Top-Down DP With Memoization (Optimized TC) : O(mn) ,  O(mn)
class Solution {
    private int[][] memo;
    private String s1;
    private String s2;
    private int l1;
    private int l2;
    public int longestCommonSubsequence(String s1, String s2) {
        init(s1 , s2);
        return longestCommonSubsequenceFromIndex(0 , 0);
    }
    private void init(String s1 , String s2) {
        this.s1 = s1; this.s2 = s2;
        this.l1 = s1.length(); this.l2 = s2.length();
        this.memo = new int[l1+1][l2+1];
        for(int i = 0 ; i < l1 ; i++) {
            for(int j = 0 ; j < l2 ; j++) {
                this.memo[i][j] = -1;
            }
        }
    }
    private int longestCommonSubsequenceFromIndex(int start1 , int start2) {
        if(memo[start1][start2] != -1)
                return memo[start1][start2];
        char c1 = s1.charAt(start1) , c2 = s2.charAt(start2);
        int lcs = 0;
        if(c1 == c2) {
            lcs = 1 + longestCommonSubsequenceFromIndex(1+start1 , 1+start2); // 1+lcs(1+a ,1+b)
        } else {
            int lcsIfStart1IsSkipped = longestCommonSubsequenceFromIndex(1+start1 , start2);    // lcs(1+a,b)
            int lcsIfStart2IsSkipped = longestCommonSubsequenceFromIndex(start1 , 1+start2);    // lcs(a,1+b)
            lcs = Math.max(lcsIfStart1IsSkipped , lcsIfStart2IsSkipped);
        }
        memo[start1][start2] = lcs;
        return lcs;
    }
}
// Algo 3 : Bottom Up dp : O(mn) , O(mn)
class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int l1 = s1.length() , l2 = s2.length();
        int[][] dp = new int[1+l1][1+l2]; // 1 aux row and column extra for simplicity
        for(int c = l2-1 ; c >= 0 ; c--) {
            for(int r = l1-1 ; r >= 0 ; r--) {
                char c1 = s1.charAt(r) , c2 = s2.charAt(c);
                if(c1 == c2) {
                    dp[r][c] = 1 + dp[r+1][c+1];                    // 1+dp[r+1][c+1]            
                } else {
                    dp[r][c] = Math.max(dp[r][c+1] , dp[r+1][c]);   // max(dp[r][c+1],dp[r+1][c])
                }
            }
        }
        return dp[0][0];
    }
}
// Algo 4 : Bottom Up dp (Space Optimized) : O(mn) , O(min(m,n))
class Solution {
  public int longestCommonSubsequence(String text1, String text2) {
    // If text1 doesn't reference the shortest string, swap them.
    if (text2.length() < text1.length()) {
      String temp = text1;
      text1 = text2;
      text2 = temp;
    }
      
    // The previous and current column starts with all 0's and like 
    // before is 1 more than the length of the first word.
    int[] previous = new int[text1.length() + 1];
    int[] current = new int[text1.length() + 1];
      
    // Iterate through each column, starting from the last one.
    for (int col = text2.length() - 1; col >= 0; col--) {
      for (int row = text1.length() - 1; row >= 0; row--) {
        if (text1.charAt(row) == text2.charAt(col)) {
          current[row] = 1 + previous[row + 1];
        } else {
          current[row] = Math.max(previous[row], current[row + 1]);
        }
      }
      // The current column becomes the previous one, and vice versa.
      int[] temp = previous;
      previous = current;
      current = temp;
    }
        
    // The original problem's answer is in previous[0]. Return it.
    return previous[0];
  }
}
// Algo 4 : Bottom Up dp (Space Optimized) : O(mn) , O(min(m,n))
class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int l1 = s1.length() , l2 = s2.length();
        if(l1 > l2) {
            swap(s1,s2);
        }
        int[] prevCol = new int[l1+1]; // l1 coz l1 < l2 , 1+l1 coz extra aux col for 0s for simplicity
        int[] currCol = new int[l1+1];
        
        for(int c = l2-1 ; c >= 0 ; c--) {
            for(int r = l1-1 ; r >= 0 ; r--) {
                char c1 = s1.charAt(r) , c2 = s2.charAt(c);
                if(c1 == c2) {
                    currCol[r] = 1 + prevCol[r+1];
                } else {
                    currCol[r] = Math.max(prevCol[r] , currCol[r+1]); // Mistake : currCol[r+1] and not prevCol[r+1]
                }
            }
            int[] temp = prevCol;
            prevCol = currCol;
            currCol = temp;
            // Mistake : prevCol = currCol will make them point to same list and give wrong ans , thus swap and later currCol will be overridden
            // Mistake : swap(prevCol , currCol) didnt work too so swapped here directly.
        }
        return prevCol[0];
    }
    private void swap(String s1, String s2) {
        String temp = s1;
        s1 = s2;
        s2 = temp;
    }
}