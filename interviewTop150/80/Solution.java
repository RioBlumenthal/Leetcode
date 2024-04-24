public class Solution {
   public int removeDuplicates(int[] nums) {
      int length = nums.length;
      if (length <= 2) {
         return length; // If the length of the array is less than or equal to 2, there are no duplicates to remove, so return the length as it is
      }
      
      int index = 1; // Initialize the index to 1, as the first element is always unique
      for (int j = 1; j < length; j++) {
         if (nums[j] != nums[index-1]) { // If the current element is not equal to the previous unique element
            index++; // Increment the index to move to the next unique element
            if (index != j+1) {
               nums[index] = nums[j]; // If the current element is not in its correct position, move it to the correct position
            }
         }
      }
      
      return index+1; // Return the length of the modified array
   }
}
