package ch.hotstuff.algorithms.majority;

public class Majority {

    public static int majority(int[] array) {
        
        int d = 0;
        int candidate = -1;

        for (int i = 0; i < array.length; i++) {

            if (d == 0) 
                candidate = array[i];

            if (array[i] == candidate)
                d++;
            else
                d--;
        }

        if (validate(array, candidate))
            return candidate;
        else
            return -1;
    }

    private static boolean validate(int[] array, int candidate) {
        int count = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] == candidate)
                count++;

        return count > array.length / 2;
    }
}
