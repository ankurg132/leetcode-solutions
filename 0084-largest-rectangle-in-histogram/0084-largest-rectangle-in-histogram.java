class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        //initial element is heights[0], 0th index.
        stack.push(0);
        //we're comparing the older one (in .peek) with the current index, the next one. Hence heighs[i] < heights[stack.peek()], first case: heights[1] < heights[0]. If current is bigger than prev, than only max can be changed.
        for(int i= 1 ; i < heights.length; i++){
            while(!stack.isEmpty() && heights[i] < heights[stack.peek()]){
                max = getMax(heights, stack, max, i);
            }
            stack.push(i);
        }
        int i = heights.length;
        while(!stack.isEmpty()){
            max = getMax(heights, stack, max, i);
        }
        return max;
    }
    public int getMax(int[] heights, Stack<Integer> stack, int max, int i){
        //first time: 0th index item
        int area;
        int popped = stack.pop(); // equals to 2
        if(stack.isEmpty()){
            area = i * heights[popped];
        }else{
            area = heights[popped] * (i-stack.peek()-1);
        }
        return Math.max(area,max);
    }
}