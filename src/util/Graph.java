package util;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Graph {

    private Set<NodeN> nodes = new HashSet();

    public void addNode(NodeN node) {
        nodes.add(node);
    }

    public Set<NodeN> getNodes() {
        return nodes;
    }

    public void setNodes(Set<NodeN> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return nodes.stream().map(NodeN::toString).collect(Collectors.joining(" "));
    }
}
