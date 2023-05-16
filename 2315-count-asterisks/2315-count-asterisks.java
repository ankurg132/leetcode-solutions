class Solution {
    public int countAsterisks(String s) {
        int symbolCount = 0, answer = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '|'){
                symbolCount ++;
            }
            if(symbolCount%2==0 && s.charAt(i)=='*'){
                answer++;
            }
        }
        return answer;
    }
}