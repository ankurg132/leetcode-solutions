class Solution {
    static void swap(int[] arr, int i, int correct){
            int temp = arr[i];
            arr[i] = arr[correct];
            arr[correct] = temp;
        }
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[correct]!=nums[i]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        //sorted now
        System.out.println(Arrays.toString(nums));
        for(int j=1;j<=nums.length;j++){
            if(j!=nums[j-1]){
                return j;
            }
        }
        return nums.length+1;
    }
}