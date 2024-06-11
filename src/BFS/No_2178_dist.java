package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * No_2178 미로 찾기
 */

public class No_2178_dist {

    static int[][] board;
    static int[] nx = {1,0,-1,0};
    static int[] ny = {0,1,0,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);
        board = new int[N][M];

        Queue<Node> queue = new LinkedList<>();
        int[][] dist = new int[N][M];

        for (int i = 0; i < N; i++) {
            split = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(split[j]);
                dist[i][j] = -1;
            }
        }

        //초기 세팅
        dist[0][0] = 1;
        queue.offer(new Node(0,0));

        while (!queue.isEmpty()) {
            //queue의 front poll
            Node node = queue.poll();

            //poll한 Node의 인접한 상하좌우로 살펴본다.
            for (int i = 0; i < nx.length; i++) {
                int x = node.x + nx[i];
                int y = node.y + ny[i];

                if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) { continue; } //인덱스 범위 확인
                if (dist[x][y] != -1 || board[x][y] == 0) { continue; } //board 값이 1일 때와 dist의 값이 -1이 아닐때만 아래 로직 실행

                dist[x][y] = dist[node.x][node.y]+1;
                queue.offer(new Node(x, y));

            }
        }
        System.out.println(dist[N-1][M-1]);
    }

    static class Node{
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
