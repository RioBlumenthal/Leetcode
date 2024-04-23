
class Solution {
   
   /**
    * Moves all elements equal to the given value to the end of the array and returns the number of elements that were moved.
    *
    * @param nums the input array
    * @param val the value to be moved to the end of the array
    * @return the number of elements that were moved to the end of the array
    */
        
   public int removeElement(int[] nums, int val) {
       int numGoodElements = nums.length;
       int lastIndex = nums.length - 1;
       for(int i = 0; i<=lastIndex; i++) {
           if(nums[i] == val) {    
               while(nums[lastIndex] == val && lastIndex > i) {
                   lastIndex--;
                   numGoodElements--;
               }
               numGoodElements--;
               nums[i] = nums[lastIndex];
               nums[lastIndex] = val;
               lastIndex--;
           }
       }
       return numGoodElements;
   }
}