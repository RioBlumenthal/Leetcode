class Solution(object):
   def jump(self, nums):
      # dynamic programming solution:
      # start from the end and work backwards

      if len(nums) <= 2:
         return len(nums) - 1
      
      steps = [0] * len(nums)
      for i in range(len(nums) - 2, -1, -1):
         mini = float('inf')
         nums_max = min(len(nums), i + nums[i] + 1)
         for j in range(nums[i], nums_max):
            if steps[j] < mini:
               mini = steps[j]
         steps[i] = mini + 1
      return steps[0]