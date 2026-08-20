class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<Character>();
        int answer = 0;
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                stack.push(c);
            }else{
                if(i+1 < s.length() && s.charAt(i+1) == ')'){
                    i++;
                    //)) but no starting (, needs to be appended.
                    if(stack.isEmpty()){
                        answer += 1;
                    }else{
                        stack.pop();
                    }
                }else {
                    //() but no at end )
                    if(stack.isEmpty()){
                        answer += 2;
                    }else{
                        answer += 1;
                        stack.pop();
                    }
                }
            }
        }
        //only ( left now.
        while(!stack.isEmpty()){
            stack.pop();
            answer += 2;
        }
        
        return answer;
    }
}