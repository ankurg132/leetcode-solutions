class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for strings in s:
            if strings=='{' or strings=='[' or strings=='(':
                stack.append(strings)
            else:
                if not stack:
                    return False
                if  strings=='}' and stack[-1] == '{':
                    stack.pop()
                elif strings==']' and stack[-1] == '[':
                    stack.pop()
                elif strings==')' and stack[-1] == '(':
                    stack.pop()
                else:
                    return False
        return not stack