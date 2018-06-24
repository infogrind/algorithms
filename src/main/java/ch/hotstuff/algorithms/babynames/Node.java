package ch.hotstuff.algorithms.babynames;

public class Node {

    private final String _name;
    private final int _count;
    private boolean _visited;

    public Node(String name, int count) {
        this._name = name;
        this._count = count;
        _visited = false;
    }

    public String name() { return _name; }
    public int count() { return _count; }
    public boolean isVisited() { return _visited; }

    public void markVisited() {
        _visited = true;
    }
}
