class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        if(nums[end-1]<target){
            return end;
        }
        if(nums[0]>target){
            return start;
        }
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target || (nums[mid]>target && nums[mid-1]<target)){
                return mid;
            }
            if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}