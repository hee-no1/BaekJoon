package bfs;

import java.util.*;

/**
 * 프로그래머스
 * [PCCP 기출문제] 2번 / 석유 시추
 */
public class Programmers_석유시추 {

    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
//        int[][] land = {{0, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 0, 0, 0, 1, 1, 0}, {1, 1, 1, 0, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0, 1, 1}};
        int[][] land = new int[][]{{1, 0, 1, 0, 1, 1}, {1, 0, 1, 0, 0, 0}, {1, 0, 1, 0, 0, 1}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 1}, {1, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1}};
        int n = land.length;
        int m = land[0].length;
        boolean[][] visited = new boolean[n][m];
        int[] column = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && land[i][j] == 1) {
                    HashSet<Integer> set = new HashSet<>();
                    int area = bfs(i, j, land, visited, set);

                    for (int index : set) {
                        column[index] += area;
                    }
                }
            }
        }

        int max = Arrays.stream(column).max().getAsInt();
        System.out.println(max);
    }


    private static int bfs(int x, int y, int[][] land, boolean[][] visited, HashSet<Integer> set) {
        Queue<Node> queue = new LinkedList<>();
        int area = 0;

        visited[x][y] = true;
        queue.offer(new Node(x, y));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            area++;
            set.add(node.y);

            for (int i = 0; i < dx.length; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (nx < 0 || nx >= land.length || ny < 0 || ny >= land[0].length) {continue; }
                if (land[nx][ny] == 0 || visited[nx][ny]) {continue; }

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
