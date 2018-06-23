package ch.hotstuff.algorithms.loopdetect;

public class LoopDetect {

    public static Node detectLoop(Node head) {

        if (head == null)
            return null;

        Node slow = head;
        Node fast = head;

        do {
            if (fast.getSucc() == null || fast.getSucc().getSucc() == null)
                return null; // end found

            slow = slow.getSucc();
            fast = fast.getSucc().getSucc();
        } while (fast != slow);

        slow = head;
        while (slow != fast) {
            slow = slow.getSucc();
            fast = fast.getSucc();
        }
        return slow;
    }
}
