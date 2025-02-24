package yandex.algorithms.traveling_salesman;

import java.util.ArrayList;
import java.util.List;

public class BackTracking {
    public int evaluateBacktracking(int[][] graph) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        visited[0] = true;

        List<Integer> path = new ArrayList<>();
        path.add(0);

        int minCost = Integer.MAX_VALUE;

        minCost = evaluate(graph, path, visited, n, 0, minCost);

        return minCost;
    }

    private int evaluate(int[][] graph, List<Integer> path, boolean[] visited, int n, int currCost, int minCost) {
        if (path.size() == n) {
            return currCost + graph[path.get(path.size() - 1)][path.get(0)]; // Close the path
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                path.add(i);
                visited[i] = true;

                int newCost = currCost + graph[path.get(path.size() - 2)][i];

                if (newCost < minCost) {
                    minCost = evaluateBacktracking(graph, path, visited, n, newCost, minCost);
                }

                path.remove(path.size() - 1);
                visited[i] = false;
            }
        }

        return minCost;
    }


}
