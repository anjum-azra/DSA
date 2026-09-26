class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        temp=[nums[0]]
        for i in range (1,len(nums)):
            if nums[i]!=temp[-1]:
                temp.append(nums[i])

        for i in range(len(temp)):
            nums[i]=temp[i]
        return len(temp)    

        
        




        
        