class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currentLowSum = 0;
        int currentHighSum = 0;
        int minSum = nums[0];
        int maxSum = nums[0];
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            currentLowSum += nums[i];
            currentHighSum += nums[i];
            if (currentLowSum < minSum) {
                minSum = currentLowSum;
            }
            if (currentHighSum > maxSum) {
                maxSum = currentHighSum;
            }
            if (currentLowSum > 0) {
                currentLowSum = 0;
            }
            if (currentHighSum < 0) {
                currentHighSum = 0;
            }
        }
        //System.out.println("minSum: " + minSum + ", maxSum: " + maxSum + ", total: " + total);
        if (minSum == total) {
            return maxSum;
        }
        
        return Math.max(total - minSum, maxSum);
    }
}