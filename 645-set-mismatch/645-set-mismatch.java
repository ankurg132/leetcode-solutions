class Solution {
    static void swap(int[] arr, int i, int correct){
            int temp = arr[i];
            arr[i] = arr[correct];
            arr[correct] = temp;
        }
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[correct]!=nums[i]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        //sorted array
        System.out.println(Arrays.toString(nums));
        int[] ans = new int[2];
        for(int j=1;j<=nums.length;j++){
            if(j!=nums[j-1]){
                ans[0] = nums[j-1];
                ans[1] = j;
            }
        }
        return ans;
    }
}