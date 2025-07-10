class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int lowestGas = 0;
        int currentLowestPos = 0;
        int currentGas = 0;
        for (int i = 0; i < gas.length; i++) {
            currentGas = currentGas + gas[i] - cost[i];
            if (currentGas < lowestGas) { 
                lowestGas = currentGas;
                currentLowestPos = i;
            }
        }
        currentGas = 0;
        for (int i = currentLowestPos; i < gas.length + currentLowestPos; i++) {
            currentGas = currentGas + gas[i % gas.length] - cost[i % gas.length];
            if (currentGas < 0) {
                return -1;
            }
        }
        return currentLowestPos;
    }
}