import java.io.*;

/**
 * Created by Yael_Zaritsky on 04/12/2016.
 */
public class MyConsole {
    public void go() throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Please enter one of the following actions: sum / copycat");

            String input = inputReader.readLine();
            if ("copycat".equals(input)) {
                printUserInput(inputReader);
            } else if ("sum".equals(input)) {
                waitForInputAndSumNumbers(inputReader);
            }
        }
    }

    private void waitForInputAndSumNumbers(BufferedReader inputReader) throws IOException {
ֿ        System.out.println("Enter numbers to sum, separated by space. For example: '233 67 8 456086'");
        String numbersToSumInput = inputReader.readLine();

        String str = NumbersToSumPrinter.getOutputString(numbersToSumInput);
        System.out.println(str);
    }

    private void printUserInput(BufferedReader inputReader) throws IOException {
        System.out.print(">");
        System.out.println(inputReader.readLine());
    }
}
