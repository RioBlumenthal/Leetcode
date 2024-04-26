class Solution(object):
    def majorityElement(self, nums):
        """
        Finds the majority element in a given list of integers.

        Args:
            nums (List[int]): A list of integers.

        Returns:
            int: The majority element in the list.

        Algorithm:
            This function uses the Boyer-Moore Voting Algorithm to find the majority element.
            It iterates through the list and keeps track of a candidate element and its count.
            If the current element is the same as the candidate, the count is incremented.
            If the current element is different, the count is decremented.
            If the count becomes zero, a new candidate is chosen.
            The final candidate is the majority element.

        Complexity Analysis:
            - Time Complexity: O(n), where n is the length of the input list.
            - Space Complexity: O(1), as no extra space is used.

        """
        candidate = -1  # Initialize the candidate element
        count = 0  # Initialize the count of the candidate element

        for num in nums:
            if num == candidate:
                count += 1  # Increment the count if the current element is the same as the candidate
            else:
                count -= 1  # Decrement the count if the current element is different from the candidate
                if count <= 0:
                    candidate = num  # Choose a new candidate if the count becomes zero or negative
                    count = 1

        return candidate  # Return the majority element
    