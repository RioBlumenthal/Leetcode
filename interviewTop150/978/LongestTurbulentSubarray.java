class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int maxLength = 1;
        int currentLength = 1;
        boolean greater = false;
        for (int i = 1; i < arr.length; i++) {
            if (currentLength == 1) {
                if (arr[i] > arr[i - 1]) {
                    greater = true;
                } else if (arr[i] < arr[i - 1]) {
                    greater = false;
                } else {
                    continue;
                }
            }
            if (greater && arr[i] > arr[i - 1]
                    || !greater && arr[i] < arr[i - 1]) {
                currentLength++;
                greater = !greater;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
                i--;
            }
        }
        return maxLength;
    }
}