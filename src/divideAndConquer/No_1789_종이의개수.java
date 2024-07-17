package divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1789_종이의개수 {
    private static int[][] board;
    private static int m_count;
    private static int z_count;
    private static int o_count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(split[j]);
            }
        }

        divide(0, 0, N);
        System.out.println(m_count);
        System.out.println(z_count);
        System.out.println(o_count);
    }

    private static void divide(int x, int y, int size) {
        boolean result = check(x, y, size);
        if(result){
            switch (board[x][y]){
                case -1: m_count++; break;
                case 0: z_count++; break;
                case 1: o_count++; break;
            }
        }else{
            int newSize = size/3;
            for (int i = x; i <= x + newSize * 2; i += newSize) {
                for (int j = y; j <= y + newSize * 2; j += newSize) {
                    divide(i, j, newSize);
                }
            }
        }

    }

    private static boolean check(int x, int y, int size) {
        int first = board[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if(first != board[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
