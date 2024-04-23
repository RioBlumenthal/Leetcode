Approach
I realized that everything after the first k elements didn't matter, and there are exactly len-k bad elements, so we can just move those elements to the end when we find them. My code loops through each element and whenever it finds a bad element it switches it for the last element that doesn't already have a bad element, and then terminates the loop once it reaches the end of the good elements.

Complexity
Time complexity: O(n)
Space complexity: O(1)