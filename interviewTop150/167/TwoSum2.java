class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int firstIndex = 0;
        int lastIndex = numbers.length - 1;

        for (int i = 0; i < numbers.length-1; i++) {
            int sum = numbers[firstIndex] + numbers[lastIndex];
            if (sum == target) {
                return new int[]{firstIndex+1, lastIndex+1};
            }
            else if (sum < target) {
                firstIndex++;
            }
            else {
                lastIndex--;
            }
        }
        return null;
    }
}