import java.util.Stack;
class DFS_Stack {
    public static void main(String[] args) {
        boolean[] visited = new boolean[9];
        int[][] graph = {{}, {2, 3, 8}, {1, 7}, {1, 4, 5}, {3, 5}, {3, 4}, {7}, {2, 6, 8}, {1, 7}};
        int node;
        Stack<Integer> stack = new Stack<>();

        //시작 노드는 1
        stack.push(1);
        visited[1] = true;

        //스택이 빌 때까지 반복
        while(!stack.isEmpty()) {
            node = stack.pop(); //스택에서 꺼낸 최상단 노드
            System.out.print(node + " ");
            for(int nextnode:graph[node]) {
                if(!visited[nextnode]) {
                    stack.push(nextnode);
                    visited[nextnode] = true;
                }
            }
        }
    }
}