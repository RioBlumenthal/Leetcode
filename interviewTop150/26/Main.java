public class Main {
   public static void main(String[] args) {
      // Create an instance of the Solution class
      Solution solution = new Solution();

      // Test your solution by calling its methods
      // and printing the results
      int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
      int length = solution.removeDuplicates(nums);
      System.out.println("Length of the array after removing duplicates: " + length);
      System.out.println("Array elements after removing duplicates:");
      for (int i = 0; i < length; i++) {
         System.out.print(nums[i] + " ");
      }
   }
}