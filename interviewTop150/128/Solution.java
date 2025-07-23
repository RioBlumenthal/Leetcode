import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        HashSet<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            uniqueNums.add(num);
        }

        int longest = 1;
        for (int num : uniqueNums) {
            if (!uniqueNums.contains(num - 1)) {
                int currentLength = 1;
                while (true) {
                    if (uniqueNums.contains(num + currentLength)) {
                        currentLength++;
                    } else {
                        break;
                    }
                }
                longest = Math.max(currentLength, longest);
            }
        }
        return longest;
    }
}