class Solution {
    public boolean isPerfectSquare(int num) {
        long start = 2;
        long end = num/2;
        if(start>end){
            return true;
        }
        while(start<=end){
            long mid = start + (end-start)/2;
            long square = mid*mid;
            if(square == num){
                return true;
            }
            else if(square<num){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
}