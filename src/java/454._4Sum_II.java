https://leetcode.com/problems/4sum-ii
// Algo 1 : HashMap : O(n^2) , O(n^2)
class Solution {
    public int fourSumCount(int[] a, int[] b, int[] c, int[] d) {
        int count = 0;
        Map<Integer , Integer> sumFreqMap = new HashMap<>(); 
        for(int a1 : a)
            for(int b1 : b)
                sumFreqMap.put(a1+b1 , 1+sumFreqMap.getOrDefault(a1+b1 , 0));
        for(int c1 : c)
            for(int d1 : d)
                count += sumFreqMap.getOrDefault(-(c1+d1) , 0);
        return count;
    }
}
// Algo 2 : kSum using HashMap : O(n^(k/2)) , O(n^(k/2)) .. k=4 for given problem
class Solution {
    private Map<Integer, Integer> sumFreqMap;
    private int[][] lists;
    private int k;
    public int fourSumCount(int[] a, int[] b, int[] c, int[] d) {
        this.sumFreqMap = new HashMap<>(); 
        this.lists = new int[][] {a , b , c , d};
        this.k = this.lists.length;
        return kSumCount(lists);
    }
    private int kSumCount(int[][] lists) {
        updateSumFreqMap(0, 0);
        return countComplements(k/2 , 0);
    }
    private void updateSumFreqMap(int i , int sum) {
        if(i == k/2) 
            sumFreqMap.put(sum , 1 + sumFreqMap.getOrDefault(sum, 0));
        else 
            for(int a : lists[i]) 
                updateSumFreqMap(i+1 , sum+a);
    }
    private int countComplements(int i , int complement) {
        if(i == k) 
            return sumFreqMap.getOrDefault(complement , 0);
        int count = 0;
        for(int a : lists[i])
            count += countComplements(i+1,complement-a);
        return count;
    }
    
}