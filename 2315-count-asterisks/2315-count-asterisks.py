class Solution(object):
    def countAsterisks(self, s):
        """
        :type s: str
        :rtype: int
        """
        splits = s.split("|")
        print(splits)
        onlyEven = splits[::2]
            
        newstring = ''.join(onlyEven)
        return newstring.count('*')
        