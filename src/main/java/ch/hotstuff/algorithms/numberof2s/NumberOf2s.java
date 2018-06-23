package ch.hotstuff.algorithms.numberof2s;

public class NumberOf2s {

    /**
     * Returns the number of 2 digits in all the numbers from 1 to n.
     */
    public static int numberOf2s(int n) {

        int count = 0;
        int len = String.valueOf(n).length();
        for (int i = 0; i < len; i++)
            count += numberOf2sByPosition(n, i);

        return count;
    }

    /**
     * Returns the number of 2 digits appearing at position d in all the numbers
     * from 1 to n.
     */
    private static int numberOf2sByPosition(int n, int d) {

        int powerOf10 = (int) Math.pow(10, d); 
        int nextPowerOf10 = powerOf10 * 10;
        int rest = n % powerOf10;

        int roundDown = (n / nextPowerOf10) * nextPowerOf10;
        int roundUp = roundDown + nextPowerOf10;
        int digit = (n / powerOf10) % 10;

        if (digit < 2)
            return roundDown / 10;
        else if (digit == 2)
            return roundDown / 10 + rest + 1;
        else
            return roundUp / 10;
    }
}
