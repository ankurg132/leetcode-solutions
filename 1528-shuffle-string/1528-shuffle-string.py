class Solution(object):
    def restoreString(self, s, indices):
        """
        :type s: str
        :type indices: List[int]
        :rtype: str
        """
        dt = ""
        for i in range(len(indices)):
            dt += s[indices.index(i)]
        return dt