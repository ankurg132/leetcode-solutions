class Solution(object):
    def shuffle(self, nums, n):
        """
        :type nums: List[int]
        :type n: int
        :rtype: List[int]
        """
        newarr = []
        for i in range(0,n):
            newarr.append(nums[i])
            newarr.append(nums[n+i])
        return newarr
        