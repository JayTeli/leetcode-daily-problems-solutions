https://leetcode.com/problems/merge-sorted-array/
// Algo 1 : Merge and sort : O((m+n)log(m+n)) , O(n)
class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        for(int i = 0 ; i < n ; i++) {
            a[i+m] = b[i];
        }
        Arrays.sort(a);
    }
}
// Algo 2 : Three Pointers (Start from beginning) : O(m+n) , O(m)
// Make copy of a , say a1 , read from a1 and b using two pointers and write in a using 3rd pointer
class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int[] a1 = Arrays.copyOf(a , a.length);
        int p1 = 0 , p2 = 0 , p3 = 0;
        while(p3 < m+n) {
            if(p2 >= n || (p1 < m && p2 < n && a1[p1] < b[p2]))
                a[p3++] = a1[p1++];
            else
                a[p3++] = b[p2++];
        }
    }
}
// Algo 3 : Three Pointers (Start from end) : O(m+n) , O(1)
class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int p1 = m-1 , p2 = n-1 , p3 = m+n-1;
        while(p2 >= 0) {
            if(p1 >= 0 && a[p1] > b[p2])
                a[p3--] = a[p1--];
            else
                a[p3--] = b[p2--];
        }
    }
}