class Solution(object):
    def canJump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        if len(nums) == 0 or nums[0] == 0:
            return False
        for i in range(nums[0]):
            if i >= len(nums):
               return True
            else:
                return self.canJump(nums[i+1:])