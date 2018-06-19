package ch.hotstuff.algorithms.mergesort;

public class Mergesort {

	public static void mergesort(int[] array) {
		mergesort(array, 0, array.length);
	}

	private static void mergesort(int[] array, int start, int until) {

		if (until - start <= 1)
			return;

		int mid = (start + until)/2;
		mergesort(array, start, mid);
		mergesort(array, mid, until);
		merge(array, start, mid, until);
	}

	private static void merge(int[] array, int start, int mid, int until) {

		int buffer[] = new int[until - start];

		int left = start;
		int right = mid;
		int i = 0;
		while (left < mid) {
			if (right >= until || array[left] <= array[right]) {
				buffer[i] = array[left];
				left++;
			}
			else {
				buffer[i] = array[right];
				right++;
			}
			i++;
		}

		while (right < until) {
			buffer[i] = array[right];
			right++;
			i++;
		}

		for (i = 0; i < buffer.length; i++)
			array[start + i] = buffer[i];
	}

}
