// Algo 1 : Two pointers + HashSet : O(n^(k-1)) , O(n)... for 4-sum , k=4
class Solution {
    private int aLength;
    public List<List<Integer>> fourSum(int[] a, int target) {
        this.aLength = a.length;
        Arrays.sort(a);   
        return kSum(a , target , 0 , 4);
    }    
    private List<List<Integer>> kSum(int[] a , int target , int startIndex , int k) {
        List<List<Integer>> ans = new ArrayList<>();
        if(startIndex == aLength) 
            return ans;
        int avgValue = target/k;
        int smallestValueInKValues = a[startIndex] , largestValueInKValues = a[aLength-1];
        if(smallestValueInKValues > avgValue || largestValueInKValues < avgValue) 
            return ans;
        if(k == 2) 
            return twoSum(a , target , startIndex);
        else {
            for(int i = startIndex ; i < aLength ; i++) {
                if(i == startIndex || a[i] != a[i-1]) {
                    int recursionTarget = target - a[i]; // Mistake : a[i] and not a[startIndex]
                    int recursionStartIndex = 1+i;
                    int recursionK = k-1;
                    List<List<Integer>> kSumResult = kSum(a , recursionTarget , recursionStartIndex , recursionK);
                    for(List<Integer> currentList : kSumResult) {
                        List<Integer> mergedList = new ArrayList<>();
                        mergedList.add(a[i]);
                        mergedList.addAll(currentList);
                        ans.add(mergedList);
                    }
                }
            }
        }
        return ans;
    }
    private List<List<Integer>> twoSum(int[] a , int target , int startIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        int left = startIndex , right = aLength-1;
        while(left < right) {
            int sum = a[left] + a[right];
            if(sum == target) {
                ans.add(Arrays.asList(a[left] , a[right]));
                left = moveRightBySkippingDuplicateRightNeighbours(a , left , right);
                right = moveLeftBySkippingDuplicateLeftNeighbours(a , left , right);
            } else if(sum < target) {
                left = moveRightBySkippingDuplicateRightNeighbours(a , left , right);
            } else {    // sum > target
                right = moveLeftBySkippingDuplicateLeftNeighbours(a , left , right);
            }
        }
        return ans;
    }
    private int moveRightBySkippingDuplicateRightNeighbours(int[] a , int left , int right) {
        while(left < right && a[left+1] == a[left]) 
            left++;
        left++;
        return left;
    }
    private int moveLeftBySkippingDuplicateLeftNeighbours(int[] a , int left , int right) {
        while(left < right && a[right-1] == a[right])
            right--;
        right--;
        return right;
    }
}