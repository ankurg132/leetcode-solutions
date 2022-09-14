class Solution {
    static void swap(int[] arr, int i, int correct){
            int temp = arr[i];
            arr[i] = arr[correct];
            arr[correct] = temp;
        }
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int j=1;j<=nums.length;j++){
            if(j!=nums[j-1]){
                return nums[j-1];
            }
        }
        return 0;
    }
}