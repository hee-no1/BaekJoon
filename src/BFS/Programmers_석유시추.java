package BFS;

import java.util.*;

/**
 * 프로그래머스
 * [PCCP 기출문제] 2번 / 석유 시추
 */
public class Programmers_석유시추 {

    private static final int[] dx = {0, 0, 1, -1};
    private static final int[] dy = {1, -1, 0, 0};
    private static Set<Node> set = new HashSet<>();
    public static void main(String[] args) {
        int[][] land = {{0, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 0, 0, 0, 1, 1, 0}, {1, 1, 1, 0, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0, 1, 1}};
//        int[][] land = new int[][]{{1, 0, 1, 0, 1, 1}, {1, 0, 1, 0, 0, 0}, {1, 0, 1, 0, 0, 1}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 1}, {1, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1}};
        int x = land.length;
        int y = land[0].length;

        boolean[][] visited = new boolean[x][y];
        int max = 0;
        int sum = 0;

        for (int j = 0; j < y; j++) {

            sum = 0;
            for (int i = 0; i < x; i++) {
                if(land[i][j] == 1 && !visited[i][j]){
                    sum += bfs(i, j, visited,land);
                }
            }
            max = Math.max(sum, max);
        }

        System.out.println(max);
    }

    private static int bfs(int x, int y, boolean[][] visited, int[][] land){
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

                if (nx < 0 || nx >= land.length || ny < 0 || ny >= land[0].length) {continue;}
                if (visited[nx][ny] || land[nx][ny] == 0) {continue;}

                visited[nx][ny] = true;
                queue.offer(new Node(nx, ny));
                set.add(new Node(nx, ny));
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
