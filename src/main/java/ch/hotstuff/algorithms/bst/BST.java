package ch.hotstuff.algorithms.bst;

public class BST<T extends Comparable<T>> {
    private Node root;

    public BST() {
        root = null;
    }

    public boolean contains(T value) {
        if (root == null)
            return false;
        else
            return root.contains(value);
    }

    /**
     * Inserts the given value if it doesn't exist yet.
     */
    public void insert(T value) {
        if (root == null)
            root = new Node(value, null, null);
        else
            root.insert(value);
    }

    @Override
    public String toString() {
        if (root == null)
            return "(empty tree)";
        else
            return root.toString();
    }
}
