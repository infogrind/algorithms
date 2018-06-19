package ch.hotstuff.algorithms;

public class Quicksort {

	public static void quicksort(int[] array) {
		if (array.length <= 1)
			return;

		quicksort(array, 0, array.length - 1);
	}

	private static void quicksort(int[] array, int start, int end) {

		if (start >= end)
			return;

		int p = partition(array, start, end);
		quicksort(array, start, p-1);
		quicksort(array, p+1, end);
	}

	private static int partition(int[] array, int start, int end) {

		// Invariant:
		// Everything up to l is smaller than pivot.
		// Everything after l up to firsthigh is larger or equal pivot element.
		// Everything after i is unexplored.
		int l = start;
		int firsthigh = start;
		int p = end;

		for (int i = l; i < end; i++) {
			if (array[i] < array[p]) {
				swap(array, i, firsthigh);
				firsthigh++;
			}
		}
		swap(array, firsthigh, p);

		return firsthigh;
	}

	private static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
}
