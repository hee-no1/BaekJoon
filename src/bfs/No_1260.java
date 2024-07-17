package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * No_1260번 DFS와 BFS
 */
public class No_1260 {

    static int[][] line;
    static int n;
    static int m;
    static int v;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        /*  1. 정점과 간선을 어떤 자료구조를 이용해서 연결해야하는가?
            처음에는 linkedlist 아니면 tree, 배열 이용해야하는 건가?
            -> 2차원 배열을 이용해보자
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);
        v = Integer.parseInt(split[2]);
        line = new int[n+1][n+1];

        for (int i = 0; i < m; i++) {
            split = br.readLine().split(" ");
            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[1]);
            line[x][y] = line[y][x] = 1;
        }

        dfs();
        sb.append("\n");
        bfs();
        System.out.println(sb.toString());

    }

    static void dfs() {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[n + 1];

        stack.push(v);

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                visited[node] = true;
                sb.append(node).append(" ");

                // 인접 노드를 역순으로 스택에 넣기 (작은 번호부터 방문하기 위함)
                for (int i = n; i >= 1; i--) {
                    if (line[node][i] == 1 && !visited[i]) {
                        stack.push(i);
                    }
                }
            }
        }
    }
    static void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];

        //초기세팅
        visited[v] = true;
        queue.offer(v);

        while (!queue.isEmpty()) {
            Integer node = queue.poll();
            sb.append(node).append(" ");
            for (int i = 1; i <= n; i++) {
                if(line[node][i] == 0 || visited[i]){continue;}
                visited[i] = true;
                queue.offer(i);
            }
        }
    }
}
