class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int num: nums){
            if(count.get(num) != null){
                count.put(num,count.get(num) + 1);
                
            }else{
                count.put(num, 1);
            }
            if(count.get(num) > (nums.length/2)){
                    return num;
                }
        }
        return -1;
    }
}