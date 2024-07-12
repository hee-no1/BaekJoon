package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class No_1926_그림 {

    private static int N;
    private static int M;
    private static int[][] board;
    private static final int[] dx = {0, 0, 1, -1};
    private static final int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        N = Integer.parseInt(split[0]);
        M = Integer.parseInt(split[1]);

        board = new int[N][M];
        boolean[][] visited = new boolean[N][M];

        int count = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            split = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(split[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(board[i][j] == 1 &&  !visited[i][j]){
                    max = Math.max(bfs(i, j, visited), max);
                    count++;
                }
            }
        }

        System.out.println(count);
        System.out.println(max);

    }

    private static int bfs(int x, int y, boolean[][] visited) {

        Queue<Node> queue = new LinkedList<>();
        int area = 0;

        visited[x][y] = true;
        queue.offer(new Node(x, y));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            area++;

            for (int i = 0; i < dx.length; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (nx < 0 || nx >= board.length || ny < 0 || ny >= board[0].length) { continue; }
                if (visited[nx][ny] || board[nx][ny] == 0) { continue; }
                visited[nx][ny] = true;
                queue.offer(new Node(nx, ny));
            }
        }
        return area;
    }

    private static class Node{
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}