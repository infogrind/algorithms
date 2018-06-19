package ch.hotstuff.algorithms.quicksort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QuicksortTest {

	@Test
	public void quicksortProperlySortsSimpleArray() {
		int[] array =    {2, 3, 5, 1, 9, 10, -1, 3, 100, -3, 0, 0, 0, 4, 4, 4};
		int[] expected = {-3, -1, 0, 0, 0, 1, 2, 3, 3, 4, 4, 4, 5, 9, 10, 100};
		Quicksort.quicksort(array);
		assertArrayEquals(expected, array);
	}
}
