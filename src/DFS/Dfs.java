package DFS;

import java.util.Stack;

/**
 * DFS 구현 로직
 * DFS는 스택을 이용한다.
 *
 * 목표: (0,0)과 상하좌우로 이어진 모든 파란칸(1)을 확인
 *
 * 1. (0,0)에서 시작
 * 2. 상하좌우로 check
 * 3. 모든 파란칸을 탐색 - dfs => visited배열, Stack
 */
public class Dfs {
    static int[][] board = {
            {1, 1, 1, 0, 1, 0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 1, 0, 0, 0, 0, 0},
            {1, 1, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    }; //파란칸:1, 빨간칸:0
    static boolean[][] visited = new boolean[board.length][board[0].length];
    static Stack<Pair> stack = new Stack<>();
    static int[][] dir = {
            {0,1},{1,0},{0,-1},{-1,-0}  // →, ↑, ←, ↓ 순 - {행, 열}
    };

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //초기 세팅 - (0,0)에서 시작
        visited[0][0] = true;
        stack.push(new Pair(0, 0));

        while (!stack.isEmpty()) {
            Pair pair = stack.pop();
            System.out.println(pair);

            for (int i = 0; i < dir.length; i++) {
                int x = pair.x + dir[i][0];
                int y = pair.y + dir[i][1];

                if (x < 0 || x > board.length || y < 0 || y > board[0].length) { continue; } //인덱스 범위 벗어나지 않게 check
                if (visited[x][y] || board[x][y] == 0) { continue; }

                visited[x][y] = true;
                stack.push(new Pair(x, y));
            }
        }
    }

    static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
