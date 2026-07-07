class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0 ; i < nums.length && nums[i] <= 0; i++){
            if(i==0 || nums[i] != nums[i-1]){
                twoSum(nums, i, 0 - nums[i], answer);
            }
        }
        return answer;
    }

    void twoSum(int[] nums, int i, int target, List<List<Integer>> answer){
        int start = i + 1;
        int end = nums.length - 1;
        while(start < end){
            if(nums[start] + nums[end] == target){
                answer.add(Arrays.asList(nums[i], nums[start], nums[end]));
                while(start < end && nums[end] == nums[end-1]){
                    end--;
                }
                while(start < end && nums[start] == nums[start+1]){
                    start++;
                }
                start ++;
                end --;
            }else if(nums[start] + nums[end] > target){
                end = end - 1;
            }else{
                start = start + 1;
            }
        }
    }
}