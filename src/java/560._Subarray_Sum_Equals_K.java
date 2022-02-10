https://leetcode.com/problems/subarray-sum-equals-k/

// Algo 1 : Brute Force : O(n^3) , O(1)
public class Solution {
    public int subarraySum(int[] nums, int s) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++)
                    sum += nums[k];
                if (sum == s)
                    count++;
            }
        }
        return count;
    }
}

// Algo 2 : Using Cumulative Sum : O(n^2) , O(n)
public class Solution {
    public int subarraySum(int[] nums, int s) {
        int n = nums.length;
        
        // Preparing cumulative sum
        int[] sum = new int[n+1];
        sum[0] = 0;
        for (int i=1; i< (n+1); i++) {  // (n+1) is size of sum[]
            sum[i] = sum[i-1] + nums[i-1];
        }
            
        // Check if subarray sum equals target using cumulative sum
        int count = 0;
        for (int i=0; i<n; i++) {
            for(int j = i+1 ; j < (n+1) ; j++) {  // sum[] size is n+1 ; starting with j=i gives wrong ans
                if(sum[j] - sum[i] == s)    // sum[j] - sum[i] coz 2 to 5 is same as 1to5 - 1to2
                    count++;
            }
        }
        return count;
    }
}

// Algo 3 : Nested loop and constant space : O(n^2) , O(1)
public class Solution {
    public int subarraySum(int[] nums, int s) {
        int count = 0 , n = nums.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == s) count++;
            }
        }
        return count;
    }
}

// Algo 4 : HashMap + Cummulative Sum : O(n) , O(n)
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sumTillIndex = 0 , n = nums.length;
        HashMap<Integer , Integer> map = new HashMap <>();
        map.put(0, 1); // empty subarray [] gives sum 0 , so init 1
        for (int i = 0; i < n; i++) {
            sumTillIndex += nums[i];
            count += map.getOrDefault(sumTillIndex - k , 0); // No of subarrays of sum k till index i = freq of (sumTillIndex - k)
            map.put(sumTillIndex, 1 + map.getOrDefault(sumTillIndex, 0));
        }
        return count;
    }
}
