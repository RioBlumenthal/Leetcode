class Solution(object):
    def majorityElement(self, nums):
        candidate = -1
        count = 0
        for num in nums:
            if num == candidate:
                count += 1
            else:
                count -= 1
                if count <= 0:
                    candidate = num
                    count = 1
        return candidate