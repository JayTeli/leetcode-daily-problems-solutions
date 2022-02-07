https://leetcode.com/problems/single-number-ii/
// Algo 1 : HashSet + Math : O(n) , O(n)
// Note : long taken as integer overflow and done is two pass as in single pass type conversion error.
// Math : 3(a + b + c) - (a + a + a + b + b + b + c) = 2*c .. thus /2 while returning.
class Solution {
  public int singleNumber(int[] nums) {
    Set<Long> set = new HashSet<>();
    long sumOfVisited = 0, sumOfAll = 0;
    for(int n : nums) {
      sumOfAll += n;
      set.add((long)n);
    }
    for(Long s : set) 
      sumOfVisited += s; // Mistake : if done in single pass along with sumOfAll then long->int issue
    return (int)((3 * sumOfVisited - sumOfAll) / 2);
  }
}
// Algo 2 : HashMap : O(n) , O(n)
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer , Integer> freqMap = new HashMap<>();
        for(int n : nums) 
            freqMap.put(n , 1 + freqMap.getOrDefault(n , 0));
        for(int k : freqMap.keySet())
            if(freqMap.get(k) == 1)
                return k;
        return -1;
    }
}
// Algo 3 : Bit Manipulation : O(n) , O(1)
// 1. first appearence: add n to seenOnce don't add to seenTwice because of presence in seenOnce
// 2. second appearance: remove num from seenOnce add num to seenTwice
// 3. third appearance: don't add to seenOnce because of presence in seenTwice remove num from seenTwice
class Solution {
  public int singleNumber(int[] nums) {
    int seenOnce = 0, seenTwice = 0;
    for (int num : nums) {
      seenOnce = ~seenTwice & (seenOnce ^ num);
      seenTwice = ~seenOnce & (seenTwice ^ num);
    }
    return seenOnce;
  }
}