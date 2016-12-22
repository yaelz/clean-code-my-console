import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Yael_Zaritsky on 07/12/2016.
 */
public class NumbersToSumTest {
    @Test
    public void testSumOfMoreThanOneNumber() throws Exception {
        assertThat(NumbersToSum.sum(3, 231),is(234));
    }
}