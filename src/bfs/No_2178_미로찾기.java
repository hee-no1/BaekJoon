package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class No_2178_미로찾기 {

    private static int[][] board;
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);
        board = new int[N][M];

        for (int i = 0; i < N; i++) {
            String string = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = string.charAt(j) - '0';
            }
        }

        boolean[][] visited = new boolean[N][M];
        Queue<Node> queue = new LinkedList<>();

        visited[0][0] = true;
        queue.offer(new Node(0, 0, 1));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.println(node);

            for (int i = 0; i < dx.length; i++) {
                int x = node.x + dx[i];
                int y = node.y + dy[i];

                if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) {continue;}
                if (visited[x][y] || board[x][y] == 0) {continue;}

                visited[x][y] = true;
                queue.offer(new Node(x, y, node.count+1));
            }

            if (node.x == N - 1 && node.y == M - 1) {
                System.out.println(node.count);
            }
        }
    }

    private static class Node{
        int x,y,count;

        public Node(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}
