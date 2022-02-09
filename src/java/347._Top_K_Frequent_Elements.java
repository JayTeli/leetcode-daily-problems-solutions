https://leetcode.com/problems/top-k-frequent-elements
// Algo 1 : Heap + HashMap : O(nlogk) , O(n+k)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length) return nums;
        Map<Integer , Integer> freqMap = new HashMap<>();
        for(int n : nums) { 
            freqMap.put(n , 1 + freqMap.getOrDefault(n , 0));   // Build freqMap
        }
        Queue<Integer> heap = new PriorityQueue((a,b) -> freqMap.get(a)-freqMap.get(b)); // Note : insert in heap based on freq(a),freq(b)
        for(int n : freqMap.keySet()) {
            heap.add(n);    // sorting at insertion will be done based on freq(n)
            if(heap.size() > k)
                heap.poll();    // remove head of queue i.e. least frequent element.
        }
        int[] topK = new int[k];
        for(int i = k-1 ; i >= 0 ; i--) { // first poll will remove least freq element , so place it at last position (k-1)..
            topK[i] = heap.poll();
        }
        return topK;
    }
}
// Algo 2 : Quick Select + Lomuto's Parition scheme : O(n)AC O(n^2)WC , O(n)
class Solution {
    private int[] uniqueArray;
    private Map<Integer, Integer> freqMap;
    private Random random = new Random();

    public int[] topKFrequent(int[] nums, int k) {
        // build hash map : character and how often it appears
        freqMap = new HashMap();
        for (int num: nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        // array of uniqueArray elements
        int n = freqMap.size();
        uniqueArray = new int[n]; 
        int i = 0;
        for (int num: freqMap.keySet()) {
            uniqueArray[i] = num;
            i++;
        }
        
        // kth top frequent element is (n - k)th less frequent.
        // Do a partial sort: from less frequent to the most frequent, till
        // (n - k)th less frequent element takes its place (n - k) in a sorted array. 
        // All element on the left are less frequent.
        // All the elements on the right are more frequent. 
        quickselect(0, n - 1, n - k);
        // Return top k frequent elements
        return Arrays.copyOfRange(uniqueArray, n - k, n);
    }

    /* Sort a list within left..right till kth less frequent element takes its place. */
    public void quickselect(int left, int right, int k_smallest) {
        
        // base case: the list contains only one element
        if (left == right) return;
        // select a random pivotIndex
        
        int pivotIndex = left + random.nextInt(right - left); 

        
        pivotIndex = partition(left, right, pivotIndex);

        // if the pivot is in its final sorted position
        if (k_smallest == pivotIndex) {
            return;    
        } else if (k_smallest < pivotIndex) {
            // go left
            quickselect(left, pivotIndex - 1, k_smallest);     
        } else {
            // go right 
            quickselect(pivotIndex + 1, right, k_smallest);  
        }
    }

    public int partition(int left, int right, int pivotIndex) {
        int pivotFreq = freqMap.get(uniqueArray[pivotIndex]);
        // 1. move pivot to end
        swap(pivotIndex, right);
        int storeIndex = left;

        // 2. move all less frequent elements to the left
        for (int i = left; i <= right; i++) {
            if (freqMap.get(uniqueArray[i]) < pivotFreq) {
                swap(storeIndex, i);
                storeIndex++;
            }
        }
        // 3. move pivot to its final place
        swap(storeIndex, right);

        return storeIndex;
    }

    public void swap(int a, int b) {
        int tmp = uniqueArray[a];
        uniqueArray[a] = uniqueArray[b];
        uniqueArray[b] = tmp;
    }
}