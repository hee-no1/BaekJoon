package BFS;


import java.util.Stack;

public class Test {
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
            {1,0},{0,1},{-1,0},{0,-1}
    };

    public static void main(String[] args) {

        //초기세팅 - (0,0)에서 시작
        visited[0][0] = true;
        stack.push(new Pair(0, 0));

        while (!stack.isEmpty()) {
            //stack의 top을 pop
            Pair node = stack.pop();
            System.out.println(node);

            for (int i = 0; i < dir.length; i++) {
                int x = node.x + dir[i][0];
                int y = node.y + dir[i][1];

                if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) { continue; }
                if (visited[x][y] || board[x][y] == 0) { continue; }

                visited[x][y] = true;
                stack.push(new Pair(x, y));
            }
        }
    }

    static class Pair{
        int x;
        int y;

        public Pair(int x, int y) {
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
