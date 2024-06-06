package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * No_1926 그림
 */
public class No_1926 {
    static int[][] board;
    static int n; //세로, 행
    static int m; //가로, 열
    static int count; //그림의 개수
    static int max; //최대 넓이
    static boolean[][] visited;
    static int[][] dir = {
            {1,0},{0,1},{-1,0},{0,-1}
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        n = Integer.parseInt(split[0]);  //세로, 행
        m = Integer.parseInt(split[1]);  //가로, 열
        board = new int[n][m];
        visited = new boolean[n][m];


        // board 배열에 입력값 넣기
        for (int i = 0; i < n; i++) {
            split = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(split[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(!visited[i][j] && board[i][j] == 1){
                    bfs(i,j);
                }
            }
        }

        System.out.println(count);
        System.out.println(max);

    }

    static void bfs(int x, int y) {

        count++;
        Queue<Element> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.offer(new Element(x,y));
        int area = 0;

        while (!queue.isEmpty()) {
            area++;
            Element element = queue.poll();
            for (int i=0; i < dir.length; i++) {
                int dx = element.x + dir[i][0];
                int dy = element.y + dir[i][1];

                if (dx < 0 || dx >= n || dy < 0 || dy >= m) { continue; } //인덱스 범위 확인
                if (visited[dx][dy] || board[dx][dy] == 0) { continue; } //방문한 곳인지 파란색인지 확인

                visited[dx][dy] = true;
                queue.offer(new Element(dx, dy));
            }
        }

        max = Math.max(max, area);

    }
    static class Element{
        int x;
        int y;

        Element(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}


