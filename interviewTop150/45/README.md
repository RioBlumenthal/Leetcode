# Intuition
My first thought was to try to use a greedy algorithm, but I couldn't figure out the greedy condition, so instead I made a dynamic programming solution. 

# Approach
After coding the dynamic programming solution, I realized that I could do better than $$O(n^2)$$ using a 
greedy approach.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```python []
class Solution(object):
   
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
```