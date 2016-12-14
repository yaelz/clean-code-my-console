import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Yael_Zaritsky on 07/12/2016.
 */
public class NumbersToSumPrinterTest {
    @Test
    public void testGetOutputStringForSingleNumber() throws Exception {
        assertThat(NumbersToSumPrinter.getOutputString("2 2"),is("Sum of 2, 2 is 4"));
    }

    @Test
    public void testGetOutputString() throws Exception {
        assertThat(NumbersToSumPrinter.getOutputString("231 3"),is("Sum of 231, 3 is 234"));
    }
}
