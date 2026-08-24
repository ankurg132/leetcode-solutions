class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    public void push(int value) {
        stack.push(value);
        if(!minStack.isEmpty()){
            if(minStack.peek() >= value){
                minStack.push(value);
            }
        }else{
                minStack.push(value);
            
        }
    }
    
    public void pop() {
        int popped = stack.pop();
        if(minStack.peek() == popped ){
            minStack.pop();
        }
    }
    
    public int top() {
        if(!stack.isEmpty()){
            return stack.peek();
        }else{
            return 0;
        }
    }
    
    public int getMin() {
        if(!minStack.isEmpty()){
            return minStack.peek();
        }
        return Integer.MAX_VALUE;
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */