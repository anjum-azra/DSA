class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        # brute force 
        clean = ""
        for ch in s:
            if ch.isalnum():
                clean += ch.lower()
            reverse=""
        for i in range(len(clean)-1,-1,-1):
            reverse +=clean[i]
        return clean==reverse    