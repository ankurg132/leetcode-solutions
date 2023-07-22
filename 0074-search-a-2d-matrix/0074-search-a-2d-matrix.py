import math

class Solution:  
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        initial = -math.inf
        for items in matrix:
            if items[-1] >= target and initial <= target:
                print(items)
                for item in items:
                    if item == target:
                        return True
            else:
                inital = items[0]
        return False