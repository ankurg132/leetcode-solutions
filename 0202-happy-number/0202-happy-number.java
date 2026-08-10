class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do{
            fast = findNext(findNext(fast));
            slow = findNext(slow);
        }while(fast != slow);
        //fast == slow in 2 conditions: both equal to 1, or both are cycle and stops at a fixed point.
        if(fast == 1){
            return true;
        }
        return false;
    }
    public int findNext(int n){
        int result = 0;
        while(n != 0){
            int rem = n % 10;
            result += rem*rem;
            n = n/10;
        }
        return result;
    }
}
