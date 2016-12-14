/**
 * Created by Yael_Zaritsky on 07/12/2016.
 */
public class NumbersToSum {
    public static int sum(int ... numbersToSum) {
        int sum = 0;
        for (int i = 0; i < numbersToSum.length; i++) {
            sum += numbersToSum[i];
        }
        return sum;
    }
}
