public class Solution {
   public int removeDuplicates(int[] nums) {
      int length = nums.length;
      if (length <= 2) {
         return length;
      }
      
      int i = 2;
      for (int j = 2; j < length; j++) {
         if (nums[j] != nums[i-1] || nums[j] != nums[i-2]) {
            i++;
            nums[i] = nums[j];
         }
      }
      
      return i;
   }
}




