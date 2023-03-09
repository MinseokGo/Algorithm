import java.util.LinkedList;
import java.util.Queue;
class BFS {
    public static void main(String[] args) {
        boolean[] visited = new boolean[9];
        int[][] graph = {{}, {2, 3, 8}, {1, 7}, {1, 4, 5}, {3, 5}, {3, 4}, {7}, {2, 6, 8}, {1, 7}};
        Queue<Integer> queue = new LinkedList<>();

        //시작 노드는 1
        queue.add(1);
        visited[1] = true;

        //큐가 빌 때까지 반복
        while(!queue.isEmpty()) {
            int node = queue.poll();    //큐에 들어있는 첫번째 노드를 반환
            System.out.print(node + " ");
            for(int nextnode:graph[node]) {
                if(!visited[nextnode]) {
                    queue.add(nextnode);
                    visited[nextnode] = true;
                }
            }
        }
    }
}