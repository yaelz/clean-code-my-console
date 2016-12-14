import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Yael_Zaritsky on 07/12/2016.
 */
public class NumbersToSumTest {
    @Test
    public void testGetOutputString() throws Exception {
        assertThat(NumbersToSum.sum(4, 230),is(234));
    }
}