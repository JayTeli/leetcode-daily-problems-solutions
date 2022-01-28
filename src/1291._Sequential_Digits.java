// Algo 1 : Sliding Window + Precomputation : O(1) , O(1)
class Solution {
    private static SlidingWindowSequences sequences = new SlidingWindowSequences();
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        for(int n : sequences.candidates) {
            if(n >= low && n <= high) {
                result.add(n);
            }
        }
        return result;
    }
}
class SlidingWindowSequences {
    public List<Integer> candidates = new ArrayList<>();
    private String input = "123456789"; 
    public  SlidingWindowSequences() {
        for(int window = 2 ; window < 10 ; window++) {
            for(int index = 0 ; index < (10 - window) ; index++) {
                candidates.add(Integer.parseInt(input.substring(index , index + window)));
            }
        }
    }
}