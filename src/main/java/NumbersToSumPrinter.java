/**
 * Created by Yael_Zaritsky on 07/12/2016.
 */
public class NumbersToSumPrinter {
    private String numbersToSumInput;

    public NumbersToSumPrinter(String numbersToSumInput) {
        this.numbersToSumInput = numbersToSumInput;
    }

    public String getOutputString() {
        String[] numbersToSum = numbersToSumInput.split(" ");

        String str = "Sum of ";

        for (int i = 0; i < numbersToSum.length; i++) {
            str += numbersToSum[i] + ", ";
        }
        str = str.substring(0, str.length() - 2);

        int sum = new NumbersToSum(numbersToSum).sum();

        str += " is " + sum;
        return str;
    }

}
