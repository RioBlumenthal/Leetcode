import java.util.Arrays;

/**
 * The Solution class contains methods to merge two sorted arrays.
 */
class Solution {
    
    /**
     * Merges two sorted arrays into the first array.
     * 
     * @param nums1 The first sorted array.
     * @param m     The number of elements in the first array.
     * @param nums2 The second sorted array.
     * @param n     The number of elements in the second array.
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Copy the contents of nums1 into a temporary array
        int[] tempArray = Arrays.copyOf(nums1, nums1.length);

        // Initialize variables to keep track of the current index in each array
        int numAtArray1 = 0, numAtArray2 = 0;

        // Merge the two arrays into nums1
        for(int i = 0; i<(m+n); i++) {
            // If all elements from nums1 have been merged, add remaining elements from nums2
            if(numAtArray1 >= m) {
                nums1[i] = nums2[numAtArray2];
                numAtArray2++;
                continue;
            }
            // If all elements from nums2 have been merged, add remaining elements from tempArray
            else if(numAtArray2 >= n) {
                nums1[i] = tempArray[numAtArray1];
                numAtArray1++;
                continue;
            }
            // Compare the current elements from tempArray and nums2, and add the smaller one to nums1
            else if(tempArray[numAtArray1] <= nums2[numAtArray2]) {
                nums1[i] = tempArray[numAtArray1];
                numAtArray1++;
            }
            else {
                nums1[i] = nums2[numAtArray2];
                numAtArray2++;
            }
        }
    }
}
