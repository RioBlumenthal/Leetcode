public class Solution {
   public int removeDuplicates(int[] nums) {
      int length = nums.length;
      if (length <= 2) {
         return length;
      }
      
      int index = 1;
      for (int j = 1; j < length; j++) {
         if (nums[j] != nums[index-1]) {
            index++;
            if (index != j+1) {
               nums[index] = nums[j];
            }
         }
      }
      
      return index+1;
   }
}  



