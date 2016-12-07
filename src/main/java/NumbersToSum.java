/**
 * Created by Yael_Zaritsky on 07/12/2016.
 */
public class NumbersToSum {
    private String numbersToSumInput;

    public NumbersToSum(String numbersToSumInput) {
        this.numbersToSumInput = numbersToSumInput;
    }

    public String getOutputString() {
        String[] numbersToSum = numbersToSumInput.split(" ");

        String str = "Sum of ";

        int sum = 0;

        for (int i = 0; i < numbersToSum.length; i++) {
            str += numbersToSum[i] + ", ";
            sum += Integer.parseInt(numbersToSum[0]);
        }
        str = str.substring(0, str.length() - 2);

        str += " is " + sum;
        return str;
    }
}
