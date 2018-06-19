package ch.hotstuff.algorithms.binarysearch;

public class BinarySearch {

    public static int binarySearch(int[] array, int val) {
        return binarySearch(array, val, 0, array.length);
    }

    private static int binarySearch(int[] array, int val, int from, int until) {
        if (from == until)
            return -1;

        int mid = (from + until) / 2;

        if (array[mid] == val)
            return mid;
        else if (val < array[mid])
            return binarySearch(array, val, from, mid);
        else // val > array[mid]
            return binarySearch(array, val, mid + 1, until);
    }
}
