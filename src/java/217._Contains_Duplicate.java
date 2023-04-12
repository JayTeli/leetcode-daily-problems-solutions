https://leetcode.com/problems/contains-duplicate
// Algo 1 : Sorting : O(nlogn) , O(1)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; (i+1) < nums.length ; i++) {
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
}
// Algo 2 : Using HashSet : O(n) , O(n)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        for(int i : nums) {
            if(visited.contains(i))
                return true;
            visited.add(i);
        }
        return false;
    }
}
