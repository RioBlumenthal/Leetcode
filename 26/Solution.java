public class Solution {
   public int removeDuplicates(int[] nums) {
      int numUnique = nums.length;
      for(int i = 1; i < numUnique; i++) {
         if(nums[i] == nums[i-1]) {
            numUnique--;
            for(int j = i; j < nums.length - 1; j++) {
               nums[j] = nums[j+1];
            }
            i--;
         }
      }
      return numUnique;
   }
}


