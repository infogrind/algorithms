package ch.hotstuff.algorithms.babynames;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;

public class Graph {

    private Map<String, Node> nodes;
    private Map<Node, Set<Node>> edges;

    public Graph() {
        nodes = new HashMap<String, Node>();
        edges = new HashMap<Node, Set<Node>>();
    }

    public void addNode(String name, int count) {
        nodes.put(name, new Node(name, count));
    }

    public void addEdge(String name1, String name2) {

        if (!nodes.containsKey(name1) || !nodes.containsKey(name2))
            throw new IllegalArgumentException("node not found");

        Node n1 = nodes.get(name1);
        Node n2 = nodes.get(name2);

        Set<Node> s1 = edges.getOrDefault(n1, new HashSet<Node>());
        Set<Node> s2 = edges.getOrDefault(n2, new HashSet<Node>());

        s1.add(n2);
        s2.add(n1);
        edges.put(n1, s1);
        edges.put(n2, s2);
    }

    public Map<String, Integer> equivalenceSums() {

        Map<String, Integer> result = new HashMap<String, Integer>();
        for (Node n: nodes.values())
            if (!n.isVisited())
                result.put(n.name(), dfsCount(n));

        return result;
    }

    // Returns the total count of the node and all connected nodes
    private int dfsCount(Node n) {

        int count = n.count();
        n.markVisited();

        for (Node c: neighbors(n))
            if (!c.isVisited())
                count += dfsCount(c);

        return count;
    }

    private Set<Node> neighbors(Node n) {
        return edges.getOrDefault(n, new HashSet<Node>());
    }
}
