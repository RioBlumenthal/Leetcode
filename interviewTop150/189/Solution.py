
class Solution(object):
  def rotate(self, nums, k):
    """
    Rotates the given list of numbers to the right by k steps.

    Args:
      nums (List[int]): The list of numbers to be rotated.
      k (int): The number of steps to rotate the list.

    Returns:
      List[int]: The rotated list of numbers.
    """
    k = k % len(nums) #make sure k is within the range of the list
    nums[:] = nums[-k:] + nums[:-k] #split the list at k, and then rotate each part
    return nums
