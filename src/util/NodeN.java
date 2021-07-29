package util;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class NodeN {

    private String name;
    private List<NodeN> shortestPath = new LinkedList();
    private Integer distance = Integer.MAX_VALUE;
    Map<NodeN, Integer> adjacentNodes = new HashMap();

    public NodeN(String name) {
        this.name = name;
    }

    public void addDestination(NodeN destination, int distance) {
        adjacentNodes.put(destination, distance);
    }

    public String getName() {
        return name;
    }

    public List<NodeN> getShortestPath() {
        return shortestPath;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public void setShortestPath(List<NodeN> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public Map<NodeN, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    @Override
    public String toString() {
        return "(" + name + ")";
    }
}
