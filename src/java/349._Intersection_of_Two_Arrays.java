https://leetcode.com/problems/intersection-of-two-arrays
// Algo 1 : Two Sets : O(m+n) ,O(m+n)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int n1 : nums1){
            s1.add(n1);
        }
        for(int n2 : nums2){
            s2.add(n2);
        }
        ArrayList<Integer> output = new ArrayList<>();
        for(int s : s1) {
            if(s2.contains(s)) {
                output.add(s);
            }
        }
        Integer[] outputArr = output.toArray(new Integer[output.size()]);
        int[] ans = new int[outputArr.length];
        for(int i = 0 ; i < outputArr.length ; i++) {
            ans[i] = outputArr[i];
        }
        return ans;
    }
}
// Algo 2 : Two Sets : O(m+n) ,O(m+n)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int n1 : nums1) s1.add(n1);
        for(int n2 : nums2) s2.add(n2);
        
        s1.retainAll(s2);   // O(m+n)
        
        int[] ans = new int[s1.size()];
        int idx = 0;
        for (int s : s1) 
            ans[idx++] = s;
        return ans;
    }
}