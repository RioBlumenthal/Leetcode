public class Solution {
   public int removeDuplicates(int[] nums) {
      int length = nums.length;
      if (length <= 2) {
         return length;
      }
      
      int i = 1;
      for (int j = 1; j < length; j++) {
         if (nums[j] != nums[i-1]) {
            i++;
            nums[i] = nums[j];
         }
      }
      
      return i+1;
   }
}




