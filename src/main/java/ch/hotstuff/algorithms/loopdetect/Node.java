package ch.hotstuff.algorithms.loopdetect;

public class Node {
    private int value;
    private Node succ;

    public Node(int value, Node succ) {
        this.value = value;
        this.succ = succ;
    }

    public void setSucc(Node succ) {
        this.succ = succ;
    }

    public Node getSucc() {
        return succ;
    }

    @Override
    public String toString() {
        return "(" + value + ", " + succ + ")";
    }
}
