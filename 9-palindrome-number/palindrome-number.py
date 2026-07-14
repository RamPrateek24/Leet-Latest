class Solution:
    def isPalindrome(self, x: int) -> bool:
        s = str(x)
        m = len(s)
        p1, p2 = 0, m-1
        while p1 < p2:
            if s[p1] == s[p2]:
                p1 += 1
                p2 -= 1
            else:
                return False
        return True       