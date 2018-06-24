package ch.hotstuff.algorithms.kthmultiple;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

public class KthMultiple {

    private static class MinComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer x, Integer y) {
            return x - y;
        }
    }

    public static int kthMultiple(int k) {

        Queue<Integer> q3 = new PriorityQueue<Integer>(11, new MinComparator());
        Queue<Integer> q5 = new PriorityQueue<Integer>(11, new MinComparator());
        Queue<Integer> q7 = new PriorityQueue<Integer>(11, new MinComparator());

        int result = 1;
        q3.add(3);
        q5.add(5);
        q7.add(7);

        for (int i = 2; i <= k; i++) {
            int min = Math.min(q3.peek(), Math.min(q5.peek(), q7.peek()));
            if (min == q3.peek()) {
                result = q3.remove();
                q3.add(result * 3);
                q5.add(result * 5);
                q7.add(result * 7);
            }
            else if (min == q5.peek()) {
                result = q5.remove();
                q5.add(result * 5);
                q7.add(result * 7);
            }
            else {
                result = q7.remove();
                q7.add(result * 7);
            }
        }

        return result;
    }
}
