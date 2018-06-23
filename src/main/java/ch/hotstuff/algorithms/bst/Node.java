package ch.hotstuff.algorithms.bst;

public class Node<T extends Comparable<T>> {

    private T value;
    private Node<T> left;
    private Node<T> right;

    public Node(T value, Node<T> left, Node<T> right) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public Node getLeft() { return left; }
    public Node getRight() { return right; }
    public T getValue() { return value; }

    public void setLeft(Node<T> newLeft) {
        left = newLeft;
    }
    public void setRight(Node<T> newRight) {
        right = newRight;
    }
    public void setValue(T newValue) {
        value = newValue;
    }

    public boolean hasLeftChild() {
        return left != null;
    }
    public boolean hasRightChild() {
        return right != null;
    }

    @Override
    public String toString() {
        return "(" + value.toString() + ", " + left + ", " + right + ")";
    }

    /**
     * Returns the given value, if it exists. Otherwise it returns null.
     */
    public boolean contains(T value) {
        if (value.equals(this.value))
            return true;
        else if (value.compareTo(this.value) < 0 && hasLeftChild())
            return left.contains(value);
        else if (value.compareTo(this.value) > 0 && hasRightChild())
            return right.contains(value);
        else
            return false; // no children and value doesn't match
    }

    /**
     * Inserts the given value into the tree if it doesn't exist yet.
     */
    public void insert(T value) {

        if (this.value == value)
            return; // nothing to do
        else if (value.compareTo(this.value) < 0)
            if (hasLeftChild())
                left.insert(value);
            else
                left = new Node<T>(value, null, null);
        else // inserted value larger
            if (hasRightChild())
                right.insert(value);
            else
                right = new Node<T>(value, null, null);
    }
}
