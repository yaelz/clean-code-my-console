import java.util.Arrays;

/**
 * Created by Yael_Zaritsky on 07/12/2016.
 */
public class NumbersToSumPrinter {

    public static String getOutputString(String numbersToSumInput) {
        String[] numbersToSum = numbersToSumInput.split(" ");

        String str = "Sum of ";

        for (int i = 0; i < numbersToSum.length; i++) {
            str += numbersToSum[i] + ", ";
        }
        str = str.substring(0, str.length() - 2);

        int sum = NumbersToSum.sum(intArrayFromStrings(numbersToSum));

        str += " is " + sum;
        return str;
    }

    private static int[] intArrayFromStrings(String[] numbersToSum) {
        int[] intarray = new int[numbersToSum.length];
        for(int i=0 ; i<numbersToSum.length ; i++) {
            intarray[i]=Integer.parseInt(numbersToSum[i]);
        }
        return intarray;
    }

}
