class DFS {
    static void DFS_method(int[][] graph, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for(int nextnode:graph[node]) {
            if(!visited[nextnode])
                DFS_method(graph, nextnode, visited);
        }
    }
    public static void main(String[] args) {
        boolean[] visited = new boolean[9];
        int[][] graph = {{}, {2, 3, 8}, {1, 7}, {1, 4, 5}, {3, 5}, {3, 4}, {7}, {2, 6, 8}, {1, 7}};
        DFS_method(graph, 1, visited);
    }
}
