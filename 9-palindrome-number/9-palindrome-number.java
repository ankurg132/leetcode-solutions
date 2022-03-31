class Solution {
    public boolean isPalindrome(int x) {
        int y = 0;
        int initial = x;
        if(x<0){
            return false;
        }
        while(x>0){
            int n = x%10;
            y = y*10+n;
            x = x/10;
        }
        if(initial==y){
            return true;
        }
        return false;
    }
}