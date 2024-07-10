package divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1992_쿼드트리 {
    private static int[][] board;
    private static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                board[i][j] = str.charAt(j)-'0';
            }
        }

        divide(0,0,N);
        System.out.println(sb.toString());

    }

    private static void divide(int x, int y, int size){
        if(check(x,y,size) == 0){
            sb.append("0");
        } else if (check(x,y,size)==size*size) {
            sb.append("1");
        }else{
            int newSize = size/2;
            sb.append("(");
            divide(x, y, newSize);
            divide(x, y+newSize, newSize);
            divide(x+newSize, y, newSize);
            divide(x+newSize, y+newSize, newSize);
            sb.append(")");
        }
    }

    private static int check(int x, int y, int size){
        int result = 0;
        for (int i = x; i < x+size; i++) {
            for (int j = y; j < y+size; j++) {
                result += board[i][j];
            }
        }
        return result;
    }
}
