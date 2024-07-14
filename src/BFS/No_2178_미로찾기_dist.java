package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class No_2178_미로찾기_dist {
    private static int N;
    private static int M;
    private static int[][] board;
    private static int[][] dist;
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        N = Integer.parseInt(split[0]);
        M = Integer.parseInt(split[1]);
        board = new int[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = str.charAt(j) - '0';
            }
        }

        Queue<Node> queue = new LinkedList<>();
        dist = new int[N][M];

        dist[0][0] = 1;
        queue.offer(new Node(0, 0));

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            for (int i = 0; i < dx.length; i++) {
                int x = node.x + dx[i];
                int y = node.y + dy[i];

                if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) {continue;}
                if (dist[x][y] != 0 || board[x][y] == 0) {continue;}

                dist[x][y] = dist[node.x][node.y] + 1;
                queue.offer(new Node(x,y));
            }
        }

        System.out.println(dist[N-1][M-1]);
    }

    private static class Node{
        int x,y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
