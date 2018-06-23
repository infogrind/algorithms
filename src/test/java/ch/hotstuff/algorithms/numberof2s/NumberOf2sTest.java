package ch.hotstuff.algorithms.numberof2s;

import static ch.hotstuff.algorithms.numberof2s.NumberOf2s.numberOf2s;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOf2sTest {

    @Test
    public void edgeCaseZero() {
        assertEquals(0, numberOf2s(0));
    }

    @Test
    public void oneToTwo() {
    		assertEquals(1, numberOf2s(2));
    }

    @Test
    public void oneToFive() {
        assertEquals(1, numberOf2s(5));
    }

    @Test
    public void oneTo23() {
        assertEquals(7, numberOf2s(23));
    }

    @Test
    public void oneTo20() {
        assertEquals(3, numberOf2s(20));
    }

    @Test
    public void oneToHundred() {
        assertEquals(20, numberOf2s(100));
    }
}
