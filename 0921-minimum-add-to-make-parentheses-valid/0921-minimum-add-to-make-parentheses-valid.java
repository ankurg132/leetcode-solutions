class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            }
            else if(c == ')' && stack.peek() == '('){
                stack.pop();
            } else{
                stack.push(c);
            }
        }
        return stack.size();
    }
}