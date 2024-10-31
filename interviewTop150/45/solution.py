class Solution(object):
   def jumpDynamic(self, nums):
      # dynamic programming solution:
      # start from the end and work backwards

      if len(nums) <= 2:
         return len(nums) - 1
      
      steps = [0] * len(nums)
      for i in range(len(nums) - 2, -1, -1):
         mini = float('inf')
         nums_max = min(len(nums), i + nums[i] + 1)
         for j in range(i+1, nums_max):
            if steps[j] < mini:
               mini = steps[j]
         steps[i] = mini + 1
      return steps[0]
   
   def jump(self, nums):
      # greedy solution:
      # keep track of the maximum reachable index
      # and the maximum index that can be reached
      # with the current number of jumps
      jumps = 0
      max_reachable = 0
      max_index = 0
      for i in range(len(nums) - 1):
         max_index = max(max_index, i + nums[i])
         if i == max_reachable:
            jumps += 1
            max_reachable = max_index
      return jumps