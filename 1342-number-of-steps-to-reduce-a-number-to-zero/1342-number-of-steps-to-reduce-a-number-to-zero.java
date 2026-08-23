class Solution {
    static public int numberOfStep(int num, int count){
        if(num == 0){
            return count;
        }
        if(num%2 == 0){
            return numberOfStep(num/2, ++count);
        }else{
            return numberOfStep(num-1, ++count);
        }
    }
    public int numberOfSteps(int num) {
        int count = 0;

        count = numberOfStep(num, count);
        return count;
        
    }
}