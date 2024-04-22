class Solution(object):
    def canJump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        if nums[0] == 0:
            if len(nums) == 1:
                return True
            else:
                return False
        nearest_jump = 0
        for i in range(len(nums)-2, -1, -1):
            nearest_jump += 1
            if nums[i] >= nearest_jump:
                nearest_jump = 0
        return nearest_jump == 0