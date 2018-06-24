package ch.hotstuff.algorithms.majority;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static ch.hotstuff.algorithms.majority.Majority.majority;

public class MajorityTest {

    @Test
    public void edgeCaseOneElement() {
        int[] array = {23};
        assertEquals(23, majority(array));
    }

    @Test
    public void bookExample() {
        int[] array = {1, 2, 5, 9, 5, 9, 5, 5, 5};
        assertEquals(5, majority(array));
    }

    @Test
    public void noMajority() {
        int[] array = {1, 2, 5, 9, 5, 9, 8, 8, 8};
        assertEquals(-1, majority(array));
    }

    @Test
    public void allAtBeginning() {
        int[] array = {7, 7, 7, 7, 7, 1, 2, 3, 4};
        assertEquals(7, majority(array));
    }

    @Test
    public void allAtEnd() {
        int[] array = {1, 2, 3, 4, 7, 7, 7, 7, 7};
        assertEquals(7, majority(array));
    }

    @Test
    public void intermixed() {
        int[] array = {7, 7, 7, 3, 3, 3, 7, 7, 7, 3, 3, 3, 3, 7, 7, 7};
        assertEquals(7, majority(array));
    }
}
