import java.io.IOException;

/**
 * Created by Yael_Zaritsky on 07/12/2016.
 */
public class Main {
    public static void main(String[] args) {
        final MyConsole myConsole = new MyConsole();
        try {
            myConsole.go();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
