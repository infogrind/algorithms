package ch.hotstuff.algorithms.mergesort;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class MergesortTest {

	@Test
	public void mergesortProperlySortsSimpleArray() {
		int[] array =    {2, 3, 5, 1, 9, 10, -1, 3, 100, -3, 0, 0, 0, 4, 4, 4};
		int[] expected = {-3, -1, 0, 0, 0, 1, 2, 3, 3, 4, 4, 4, 5, 9, 10, 100};
		Mergesort.mergesort(array);
		assertArrayEquals(expected, array);
	}

	@Test
	public void mergesortWorksForEmptyArray() {
		int[] array = {};
		Mergesort.mergesort(array);
		assertEquals(0, array.length);
	}

	@Test
	public void mergesortWorksForSizeOneArray() {
		int[] array = {77};
		Mergesort.mergesort(array);
		assertEquals(1, array.length);
		assertEquals(77, array[0]);
	}
}
