import java.io.*;

/**
 * Created by Yael_Zaritsky on 04/12/2016.
 */
public class MyConsole {
    public void go() throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("> ");
            System.out.println(inputReader.readLine());
        }
    }

}
