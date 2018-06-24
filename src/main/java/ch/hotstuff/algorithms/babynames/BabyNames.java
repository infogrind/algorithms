package ch.hotstuff.algorithms.babynames;

import java.util.Map;

public class BabyNames {
   
    public static Map<String, Integer> babyNames(Map<String, Integer> nameCount,
            String[][] equivalences)
    {
        Graph nameGraph = new Graph();

        for (String name: nameCount.keySet())
            nameGraph.addNode(name, nameCount.get(name));

        for (String[] pair: equivalences)
            nameGraph.addEdge(pair[0], pair[1]);

        return nameGraph.equivalenceSums();
    }
}
