    package BFS;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.LinkedList;
    import java.util.Queue;

    /**
     * No_2178 미로 탐색
     */
    public class No_2178_visited {
        static int[][] board;
        static boolean[][] visited;
        static Queue<Node> queue = new LinkedList<>();
        static int[][] dir = {
                {1,0},{0,1},{-1,0},{0,-1}
        };

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] split = br.readLine().split(" ");
            int N = Integer.parseInt(split[0]);
            int M = Integer.parseInt(split[1]);
            board = new int[N][M];
            visited = new boolean[N][M];
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                split = br.readLine().split("");
                for (int j = 0; j < M; j++) {
                    board[i][j] = Integer.parseInt(split[j]);
                }
            }

            //초기세팅 - (0,0)
            visited[0][0] = true;
            queue.offer(new Node(0,0,0));

            while(!queue.isEmpty()){
                //큐의 front를 poll
                Node node = queue.poll();
                node.count++;

                //N,M 일때
                if(node.x==N-1 && node.y==M-1){
                    //(N,M)에서는 visited 배열에 방문한 것을 남기지 않음
                    min = Math.min(node.count, min);
                    node.count--;
                    continue;
                }

                for (int i = 0; i < dir.length; i++) {
                    int x = node.x + dir[i][0];
                    int y = node.y + dir[i][1];

                    if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) { continue; }
                    if (visited[x][y] || board[x][y] == 0) { continue; }

                    visited[x][y] = true;
                    queue.offer(new Node(x,y, node.count));
                }
            }
            System.out.println(min);
        }

        static class Node{
            int x, y, count;

            public Node(int x, int y, int count) {
                this.x = x;
                this.y = y;
                this.count = count;
            }
        }
    }
