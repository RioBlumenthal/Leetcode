//moves all elements equal to val to the end of the array
//and returns how many elements that was
class Solution {
   public int removeElement(int[] nums, int val) {
       int numElementsRemoved = 0;
       int lastIndex = nums.length - 1;
       for(int i = 0; i<=lastIndex; i++) {
           if(nums[i] == val) {    
               while(nums[lastIndex] == val && lastIndex > i) {
                   lastIndex--;
                   numElementsRemoved++;
               }
               numElementsRemoved++;
               nums[i] = nums[lastIndex];
               nums[lastIndex] = val;
               lastIndex--;
           }
       }
       return numElementsRemoved;
   }
}