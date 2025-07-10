class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            int totalGas = 0;
            boolean success = true;
            for (int j = 0; j < gas.length; j++) {
                totalGas += gas[(i+j) % (gas.length)];
                totalGas -= cost[(i+j) % (gas.length)];
                if (totalGas < 0) {
                    i = i+j;
                    success = false;
                    break;
                }
            }
            if (success) {
                return i;
            }
        }
        return -1;
    }
}