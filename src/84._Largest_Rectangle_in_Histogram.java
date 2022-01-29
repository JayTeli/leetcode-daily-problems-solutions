// Algo 1 : Using Stack : O(n) , O(n)
// Short-Notes : 
// 1. initially put -1 in stack
// 2. for each index , we keep pushing new elements index as long as old stack top index element is less then new element.
// 3. when old stack top element is greater then new element. new element becomes right limit of it. the element below it is the left limit to it. using this , get current height and width for that index.
// 4. when all elements of height are processed , cal height and width for those elements.
public class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        int length = heights.length;
        int maxArea = 0;
        for (int i = 0; i < length; i++) {
            while ((stack.peek() != -1) && (heights[stack.peek()] >= heights[i])) {
                int currentHeight = heights[stack.pop()];
                int currentWidth = i - stack.peek() - 1;
                maxArea = Math.max(maxArea, currentHeight * currentWidth);
            }
            stack.push(i);
        }
        while (stack.peek() != -1) {
            int currentHeight = heights[stack.pop()];
            int currentWidth = length - stack.peek() - 1;
            maxArea = Math.max(maxArea, currentHeight * currentWidth);
        }
        return maxArea;
    }
}