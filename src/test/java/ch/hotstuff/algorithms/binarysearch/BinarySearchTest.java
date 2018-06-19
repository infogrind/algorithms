package ch.hotstuff.algorithms.binarysearch;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static ch.hotstuff.algorithms.binarysearch.BinarySearch.binarySearch;

public class BinarySearchTest {

    @Test
    public void binarySearchFindsElementInArray() {
        int[] array = {-5, -4, -2, -1, 2, 5, 18, 22, 29};
        assertEquals(7, binarySearch(array, 22));
        assertEquals(0, binarySearch(array, -5));
        assertEquals(1, binarySearch(array, -4));
        assertEquals(-1, binarySearch(array, 23));
    }

}
