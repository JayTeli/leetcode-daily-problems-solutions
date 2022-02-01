https://leetcode.com/problems/detect-capital/
// Algo 1 : Character by Characeter : O(n) , O(1)
class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        if (n == 1) return true;
        // case 1: All capital
        if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
            for (int i = 2; i < n; i++) {
                if (Character.isLowerCase(word.charAt(i))) {
                    return false;
                }
            }
        } else {// case 2 and case 3
            for (int i = 1; i < n; i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }
        return true;// if pass one of the cases
    }
}
// Algo 2 : Regex O(n) , O(1)
class Solution {
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]*|.[a-z]*");
    }
}