//Imagine a histogram where the bars' heights are given by the array A. Each bar is of uniform width, which is 1 unit. When it rains, water will accumulate in the valleys between the bars.
//
//Your task is to calculate the total amount of water that can be trapped in these valleys.

package oneD_array;

public class RainWaterTrapped {
    public static int solve(final int[] A) {
        int n = A.length;
        int [] leftMaxHeight = new int[n];
        int [] rightMaxHeight = new int[n];

        int leftCurrMax = A[0];
        leftMaxHeight[0] = leftCurrMax;
        for(int i = 1; i < n; i++){
            leftCurrMax = Math.max(leftCurrMax, A[i]);
            leftMaxHeight[i] = leftCurrMax;
        }

        int rightCurrMax = A[n - 1];
        rightMaxHeight[n - 1] = rightCurrMax;
        for(int i = n - 1; i >= 0; i--){
            rightCurrMax = Math.max(rightCurrMax, A[i]);
            rightMaxHeight[i] = rightCurrMax;
        }

        int totalTrapedWater = 0;
        for(int i = 1; i < n; i++){
            int currentMinHeight = Math.min(leftMaxHeight[i], rightMaxHeight[i]);
            totalTrapedWater += currentMinHeight - A[i];
        }

        return totalTrapedWater;
    }

    public static void main(String[] args) {
        int[] A = {5, 4, 1, 4, 3, 2, 7};
        RainWaterTrapped obj = new RainWaterTrapped();
        System.out.println("ans " + obj.solve(A));
    }
}
