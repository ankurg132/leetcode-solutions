class Solution:
    def search(self, nums: List[int], target: int) -> int:
        lo = 0
        hi = len(nums)-1
        while(lo<=hi):
            mid = int((hi+lo)/2)
            if nums[mid]==target:
                # Answer lies in the left half
                return mid
            if nums[mid]<target:
                # Answer lies in the right half
                lo = mid + 1
            else:
                hi = mid-1
        return -1;
        