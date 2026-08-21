class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        int min = Math.min(a, b);
        for(int i=1; i <= min; i++){
                if(b%i == 0 && a%i == 0){
                    count++;
                }
            }
        return count;
    }
}