package BFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 프로그래머스
 * [PCCP 기출문제] 2번 / 석유 시추
 */
public class programmers_석유시추 {

    static int[] nx = {0,0,1,-1};
    static int[] ny = {1,-1,0,0};

    public static void main(String[] args) {
//        int[][] land = {{0, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 0, 0, 0, 1, 1, 0}, {1, 1, 1, 0, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0, 1, 1}};
        int[][] land = {{1, 0, 1, 0, 1, 1}, {1, 0, 1, 0, 0, 0}, {1, 0, 1, 0, 0, 1}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 1}, {1, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1}};

        int N = land.length;
        int M = land[0].length;
        int max = Integer.MIN_VALUE;

        boolean[][] visited ;
        Queue<Node> queue = new LinkedList<>();

        for (int j = 0; j < M; j++) {
            int sum = 0;
            visited = new boolean[N][M];
            for(int i = 0; i < N; i++){
                if(land[i][j] == 1 && !visited[i][j]){
                    sum += bfs(i, j, land, visited, queue);
                }
            }
            max = Math.max(sum, max);
        }

        System.out.println(max);
    }

    private static int bfs(int x, int y, int[][] land, boolean[][] visited, Queue<Node> queue){
        int count = 0;
        visited[x][y] = true;
        queue.offer(new Node(x,y));

        while(!queue.isEmpty()){
            Node node = queue.poll();
            count++;
            for (int i = 0; i < nx.length; i++) {
                int r = node.x + nx[i];
                int c = node.y + ny[i];

                if (r < 0 || r >= land.length || c < 0 || c >= land[0].length) { continue; }
                if (land[r][c] == 1 && !visited[r][c]) {
                    visited[r][c] = true;
                    queue.offer(new Node(r, c));

                }
            }
        }
        return count;
    }

    static class Node{
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
