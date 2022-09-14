class Solution {
    static void swap(int[] arr, int i, int correct){
            int temp = arr[i];
            arr[i] = arr[correct];
            arr[correct] = temp;
        }
    public List<Integer> findDuplicates(int[] nums) {
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
        List<Integer> dupElem = new ArrayList<Integer>();
        for(int j=1;j<=nums.length;j++){
            if(j!=nums[j-1]){
                dupElem.add(nums[j-1]);
            }
        }
        return dupElem;
    }
}