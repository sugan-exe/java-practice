import java.util.*;

public class DetectGraph {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    static boolean dfs(int node, int parent) {

        visited[node] = true;

        for (int neighbor : graph.get(node)) {

            if (!visited[neighbor]) {

                if (dfs(neighbor, node))
                    return true;

            } else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int V = 4;

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(3);
        graph.get(3).add(1);

        graph.get(3).add(2);
        graph.get(2).add(3);

        graph.get(2).add(0);
        graph.get(0).add(2);

        visited = new boolean[V];

        if (dfs(0, -1))
            System.out.println("Cycle Found");
        else
            System.out.println("No Cycle");
    }
}