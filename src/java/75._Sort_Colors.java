https://leetcode.com/problems/sort-colors/
// Algo 1 : Dutch National Flag problem solution (Three pointers) : O(n) , O(1)
class Solution {
    public void sortColors(int[] a) {
        int i = 0 , zeroEnd = 0 , twoStart = a.length - 1;
        while(i <= twoStart) { // Note : <= and not <
           if(a[i] == 0) {
                swap(a , zeroEnd++ , i++);
            } else if(a[i] == 2) {
                swap(a , twoStart-- , i);   // Note : i and not i++
            } else {    // a[i] == 1
               i++;
           }
        }
    }
    private void swap(int[] a , int x , int y) {
        int temp = a[x];    a[x] = a[y];    a[y] = temp; 
    }
}