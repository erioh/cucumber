package tester;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class GraphSearcher {
    private Set<Integer> visited = new HashSet<>();

    public static void main(String[] args) {
        List<GraphElement> graph = new ArrayList<>();

        graph.add(new GraphElement(new int[]{1, 2, 3}, 0));
        graph.add(new GraphElement(new int[]{0, 3, 4}, 1));
        graph.add(new GraphElement(new int[]{0, 3}, 2));
        graph.add(new GraphElement(new int[]{0, 1, 2, 4}, 3));
        graph.add(new GraphElement(new int[]{1, 3}, 4));
        GraphSearcher searcher = new GraphSearcher();
//        searcher.dfs(graph, 3);
        searcher.visited.clear();
        searcher.bfs(graph, 1);
    }

    public void dfs(List<GraphElement> graph, int start) {
        visited.add(start);
        GraphElement graphElement = graph.get(start);
        System.out.println("Value = " + graphElement.value);
        for (int edge : graphElement.edges) {
            if (!visited.contains(edge)) {
                dfs(graph, edge);
            }
        }
    }

    public void bfs(List<GraphElement> graph, int start) {
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        visited.add(start);
        queue.add(start);
        Integer current;
        while ((current = (queue.peek())) != null) {
            Integer currentVertex = queue.poll();
            GraphElement element = graph.get(currentVertex);
            int[] edges = element.getEdges();
            for (int edge : edges) {
                if (!visited.contains(edge)) {
                    queue.add(edge);
                    visited.add(edge);
                    System.out.println(current + ":" + edge);
                }
            }
        }
    }

    private static class GraphElement {
        private int[] edges;
        private int value;

        private GraphElement(int[] edges, int value) {
            this.edges = edges;
            this.value = value;
        }

        public int[] getEdges() {
            return edges;
        }

        public int getValue() {
            return value;
        }
    }
}
