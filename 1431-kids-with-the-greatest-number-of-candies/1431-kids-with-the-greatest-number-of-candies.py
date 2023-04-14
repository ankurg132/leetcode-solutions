class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        maxCandy = max(candies)
        result = []
        for candy in candies:
            if candy + extraCandies >= maxCandy:
                result.append(True)
            else:
                result.append(False)
        return result
                
        