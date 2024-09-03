// Algo 2 : Direct Integer Operation : O(n) , O(1)
 // summing their values directly as we iterate through the given string
class Solution {
    public int getLucky(String s, int k) {
        int resultSum = 0;
        for(char c : s.toCharArray()) {
            int tempNo = c - 'a' + 1;
            while(tempNo > 0) {
                resultSum += (tempNo % 10);
                tempNo /= 10;
            }
        }
        for(int i = 0 ; i < k-1 ; i++) {
            int digitSum = 0;
            while(resultSum > 0) {
                digitSum += (resultSum % 10);
                resultSum /= 10;
            }
            resultSum = digitSum;
        }
        return resultSum;
    }

    private int sumOfDigits(int input) {
        int digitSum = 0;
        while(input > 0) {
            digitSum += (input % 10);
            input /= 10;
        }
        return digitSum;
    }
}

/*
// Algo 1 : String Concatenation and Summation : O(n), O(n)
class Solution {
    public int getLucky(String s, int k) {
        String original = "";
        for(char c : s.toCharArray()) {
            original += Integer.toString(c - 'a' + 1);
        }
        String result = original;
        for(int i = 0 ; i < k ; i++) {
            result = transform(result);
        }
        return Integer.parseInt(result);
    }

    private String transform(String input) {
        int sum = 0;
        for(char c : input.toCharArray()) {
            sum += (c - '0');
        }
        return Integer.toString(sum);
    }
}
*/
