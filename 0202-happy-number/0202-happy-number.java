class Solution {
    public boolean isHappy(int n) {
        int s = n;
        int f = n;
        do{
            s = findNext(s);
            f = findNext(findNext(f));
        }while(s!=f);
        return s == 1;
    }
    public int findNext(int n){
        int answer = 0;
        while(n!=0){
            int rem = n%10;
            answer += rem*rem;
            n = n/10;
        }
        return answer;
    }
}
