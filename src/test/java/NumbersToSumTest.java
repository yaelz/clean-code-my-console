import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Yael_Zaritsky on 07/12/2016.
 */
public class NumbersToSumTest {
    @Test
    public void testGetOutputString() throws Exception {
        String[] numbers = {"4", "230"};
        NumbersToSum numbersToSum = new NumbersToSum(numbers);
        assertThat(numbersToSum.sum(),is(234));
    }
}