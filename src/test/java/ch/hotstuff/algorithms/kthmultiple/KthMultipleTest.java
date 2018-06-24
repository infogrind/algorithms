package ch.hotstuff.algorithms.kthmultiple;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static ch.hotstuff.algorithms.kthmultiple.KthMultiple.kthMultiple;

public class KthMultipleTest {

    @Test
    public void firstFewElements() {
        assertEquals(1, kthMultiple(1));
        assertEquals(3, kthMultiple(2));
        assertEquals(5, kthMultiple(3));
        assertEquals(7, kthMultiple(4));
        assertEquals(9, kthMultiple(5));
        assertEquals(15, kthMultiple(6));
        assertEquals(21, kthMultiple(7));
        assertEquals(25, kthMultiple(8));
    }
}
