package BFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 * BFS 구현 로직
 * BFS는 Queue(선입선출)를 이용한다.
 * <p>
 * 목표: (0,0)과 상하좌우로 이어진 모든 파란칸(1)을 확인
 */
public class Bfs {
    static int[][] board = {
            {1, 1, 1, 0, 1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 1, 0, 0, 0, 0, 0},
            {1, 1, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    }; //파란칸:1, 빨간칸:0

    static Queue<Pair> queue = new LinkedList<>();
    static boolean[][] visited = new boolean[board.length][board[0].length];
    static int[][] dir = {
            {1,0},{0,1},{-1,0},{0,-1}  //↓, →, ↑, ← 상하좌우 네방향 {행,열}
    };

    public static void main(String[] args) {

        //초기 세팅하기
        visited[0][0] = true;
        queue.add(new Pair(0, 0));

        while (!queue.isEmpty()) {

            Pair pair = queue.poll(); // 큐에서 선입선출 Pair 하나 꺼내기

            //꺼낸 pair의 상하좌우 살피기
            for (int i = 0; i < 4; i++) {
                int x = pair.x + dir[i][0];
                int y = pair.y + dir[i][1];

                if(x < 0 || x > board.length || y < 0 || y > board[0].length){ continue; } // 인덱스 범위 밖으로 벗어나는 경우, runtime에러를 방지하기 위해 아래 if문보다 먼저 써야한다.
                if(visited[x][y] || board[x][y] == 0){ continue; } // 이미 방문했거나 파란색이 아닐 경우

                visited[x][y] = true;
                queue.add(new Pair(x,y));

            }

        }
    }
    static class Pair{
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}


