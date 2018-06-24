package ch.hotstuff.algorithms.superseq;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static ch.hotstuff.algorithms.superseq.SuperSeq.shortestSuperSeq;

public class SuperSeqTest {

    @Test
    public void bookExample() {
        int[] numbers = {1, 5, 9};
        int[] array = {7, 5, 9, 0, 2, 1, 3, 5, 7, 9, 1, 1, 5, 8, 8, 9, 7};
        int[] result = shortestSuperSeq(array, numbers);
        int[] expected = {7, 10};

        assertArrayEquals(expected, result);
    }
}
