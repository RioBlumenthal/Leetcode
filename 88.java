import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tempArray = Arrays.copyOf(nums1, nums1.length);
        int numAtArray1 = 0, numAtArray2 = 0;
        for(int i = 0; i<(m+n); i++) {
            if(numAtArray1 >= m) {
                nums1[i] = nums2[numAtArray2];
                numAtArray2++;
                continue;
            }
            else if(numAtArray2 >= n) {
                nums1[i] = tempArray[numAtArray1];
                numAtArray1++;
                continue;
            }
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