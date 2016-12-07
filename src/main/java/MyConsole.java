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
                System.out.print(">");
                System.out.println(inputReader.readLine());
            } else if ("sum".equals(input)) {
                System.out.println("Enter numbers to sum, separated by space. For example: '233 67 8 456086'");
                String nToSIn = inputReader.readLine();
                String[] nToS = nToSIn.split(" ");

                String str = "Sum of ";

                int sum = 0;

                for (int i = 0; i < nToS.length; i++) {
                    str += nToS[i] + ", ";
                    sum += Integer.parseInt(nToS[0]);
                }
                str = str.substring(0, str.length() - 2);

                str += "is " + sum;

                System.out.println(str);
            }
        }
    }

}
