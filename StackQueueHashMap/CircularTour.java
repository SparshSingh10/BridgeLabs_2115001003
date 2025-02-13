
public class CircularTour {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currGas = 0; 
        int startIndex = 0; 

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i]; 
            totalCost += cost[i];

            currGas += gas[i] - cost[i];

            if (currGas < 0) {
                currGas = 0;
                startIndex = i + 1; 
            }
        }

        if (totalGas < totalCost) {
            return -1;
        }

        return startIndex;
    }

    public static void main(String[] var0) {
        int[] var1 = new int[] { 1, 2, 3, 4, 5 };
        int[] var2 = new int[] { 3, 4, 5, 1, 2 };
        System.out.println(canCompleteCircuit(var1, var2)); // Should return 3
    }
}
