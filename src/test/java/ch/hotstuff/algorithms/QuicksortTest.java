package ch.hotstuff.algorithms;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QuicksortTest {

	@Test
	public void quicksortProperlySortsSimpleArray() {
		int[] array = {2, 3, 5, 1, 9, 10, -1, 3, 100, -3, 0,0,0, 4, 4, 4};
		Quicksort.quicksort(array);
		assertTrue(isSorted(array));
	}

	private boolean isSorted(int[] array) {

		if (array.length <= 1)
			return true;
		else {
			for (int i = 1; i < array.length; i++)
				if (array[i] < array[i-1])
					return false;
			return true;
		}
	}
}
