public class Solution {
   public int removeDuplicates(int[] nums) {
      int numUnique = nums.length;
      for(int i = 1; i < nums.length; i++) {
         if(nums[i] == nums[i-1]) {
            numUnique--;
            for(int j = i; j < nums.length; j++) {
               nums[j-1] = nums[j];
            }
         }
      }
      return numUnique;
   }
}

