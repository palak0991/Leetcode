class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        new = s.split()
        new.reverse()
        return " ".join(new)
        