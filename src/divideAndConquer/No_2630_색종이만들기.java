package divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2630_색종이만들기 {

    private static int[][] board;
    private static int w_count;
    private static int b_count;

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
        System.out.println(w_count);
        System.out.println(b_count);

    }

    private static void divide(int x, int y, int size){
        int result = check(x,y,size);
        if (result == 0) {
            w_count++;
        } else if (result == size * size) {
            b_count++;
        } else {
            //다시 재귀를 호출해야한다
            int newSize = size /2;
            for (int i = x; i <= x+newSize; i+=newSize) {
                for (int j = y; j <= y+newSize; j+=newSize) {
                    divide(i, j, newSize);
                }
            }
        }
    }

    private static int check(int x, int y, int size) {
        int sum = 0;
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                sum += board[i][j];
            }
        }
        return sum;
    }
}
