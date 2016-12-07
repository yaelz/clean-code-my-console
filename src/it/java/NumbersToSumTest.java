import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Yael_Zaritsky on 07/12/2016.
 */
public class NumbersToSumTest {
    @Test
    public void testGetOutputStringForSingleNumber() throws Exception {
        NumbersToSum numbersToSum = new NumbersToSum("2 2");
        assertThat(numbersToSum.getOutputString(),is("Sum of 2, 2 is 4"));
    }

    @Test
    public void testGetOutputString() throws Exception {
        NumbersToSum numbersToSum = new NumbersToSum("231 3");
        assertThat(numbersToSum.getOutputString(),is("Sum of 231, 3 is 234"));
    }
}
