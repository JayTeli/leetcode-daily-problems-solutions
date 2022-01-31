https://leetcode.com/problems/rotate-array
// Algo 1 : Multiple pass : O(n) , O(1)
// Reverse full array , then Reverse first k elements , then Reverse last n-k elements
class Solution {
  public void rotate(int[] nums, int k) {
    int n = nums.length;
    k %= n; // coz rotating n times will result in no rotation
    reverse(nums, 0, n-1);
    reverse(nums, 0, k-1);
    reverse(nums, k, n-1);
  }
  public void reverse(int[] nums, int start, int end) {
    for(int i = start , j = end ; i < j ; i++ , j--) {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
    }
  }
}
// Algo 2 : Single Pass using Cyclic Replacements : O(n) , O(1)
// newIndex = (oldIndex + k) % n
// do this for n counts max.
// start with 0 , cal newIndex , swap next with prev , current = newIndex
// while doing so if start == current , start++ coz cycle was formed.
class Solution {
  public void rotate(int[] nums, int k) {
    k = k % nums.length;
    int count = 0;
    for (int start = 0; count < nums.length; start++) {
      int current = start;
      int prev = nums[start];
      do {
        int next = (current + k) % nums.length;
        int temp = nums[next];
        nums[next] = prev;
        prev = temp;
        current = next;
        count++;
      } while (start != current);
    }
  }
}