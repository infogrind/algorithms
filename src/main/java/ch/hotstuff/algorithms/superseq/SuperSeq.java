package ch.hotstuff.algorithms.superseq;

import java.util.Arrays;

public class SuperSeq {

    public static int[] shortestSuperSeq(int[] array, int[] numbers) {

        int[] result = new int[2];

        if (array.length == 0) {
            result[0] = -1;
            result[1] = -1;
            return result;
        }
        else if (numbers.length == 0) {
            return result; // {0, 0}
        }

        int[] max = computeMax(array, numbers);
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (max[i] == -1)
                break; // no valid subarray past this point

            int diff = max[i] - i;
            if (diff < minDiff) {
                minDiff = diff;
                result[0] = i;
                result[1] = max[i];
            }
        }

        return result;
    }

    private static int[] computeMax(int[] array, int[] numbers) {

        int[] max = new int[array.length];

        for (int n: numbers) {
            int lastSeen = -1;
            for (int i = max.length - 1; i >= 0; i--) {
                if (array[i] == n)
                    lastSeen = i;

                if (lastSeen == -1)
                    max[i] = -1;
                else if (max[i] != -1)
                    max[i] = Math.max(max[i], lastSeen);
            }
        }

        return max;
    }
}
