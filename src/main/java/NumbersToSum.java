/**
 * Created by Yael_Zaritsky on 07/12/2016.
 */
public class NumbersToSum {
    private String[] numbersToSum;

    public NumbersToSum(String[] numbersToSum) {
        this.numbersToSum = numbersToSum;
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < numbersToSum.length; i++) {
            sum += Integer.parseInt(numbersToSum[i]);
        }
        return sum;
    }
}
