package ch.hotstuff.algorithms.loopdetect;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static ch.hotstuff.algorithms.loopdetect.LoopDetect.detectLoop;

public class LoopDetectTest {

    @Test
    public void noLoopInEmptyList() {
        assertEquals(null, detectLoop(null));
    }

    @Test
    public void noLoopReturnsNull() {
        Node head = new Node(1, new Node(2, new Node(3, null)));
        assertEquals(null, detectLoop(head));
    }

    @Test
    public void correctLoopStartDetected() {
        Node loopEnd = new Node(99, null);
        Node loop = new Node(4, new Node(5, new Node(6, loopEnd)));
        loopEnd.setSucc(loop);
        Node head = new Node(1, new Node(2, new Node(3, loop)));

        assertTrue(loop == detectLoop(head));
    }
}
