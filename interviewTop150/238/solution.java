import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] forwardMult = new int[length - 1];
        int[] backwardMult = new int[length - 1];

        forwardMult[0] = nums[0];
        backwardMult[0] = nums[length - 1];

        for (int i = 1; i < nums.length - 1; i++) {
            forwardMult[i] = nums[i] * forwardMult[i - 1];
            backwardMult[i] = nums[length - 1 - i] * backwardMult[i - 1];
        }

        int[] result = new int[length];
        result[0] = backwardMult[length - 2];
        result[length - 1] = forwardMult[length - 2];
        for (int i = 1; i < nums.length - 1; i++) {
            result[i] = forwardMult[i - 1] * backwardMult[length - 2 - i];
        }
        return result;
    }
}