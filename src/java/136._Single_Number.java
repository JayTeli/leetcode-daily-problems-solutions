// Algo 1 : HashSet + Stream: O(n),O(n)
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> singleNotFoundSet = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++) {
            if(singleNotFoundSet.contains(nums[i])) {
                singleNotFoundSet.remove(nums[i]);
            } else {
                singleNotFoundSet.add(nums[i]);
            }
        }
        return singleNotFoundSet.stream().findFirst().get();
    }
}
// Algo 2 : HashSet + Math : O(n),O(n)
// 2*(a+b+c)-(a+a+b+b+c)=c
// Remove operation in Algo 1 is replaced by Math. saving time.
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        int sumOfVisited = 0 , sumOfAll = 0;
        for(int n : nums) {
            if(!visited.contains(n)) {
                visited.add(n);
                sumOfVisited += n;
            } 
            sumOfAll += n;
        }
        return 2*sumOfVisited - sumOfAll;
    }
}
// Algo 3 : Bit Manipulation : O(n) , O(1)
class Solution {
  public int singleNumber(int[] nums) {
    int x = 0;
    for (int n : nums) 
        x ^= n;
    return x;
  }
}