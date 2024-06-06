package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * No_9079 동전 게임
 */
public class No_9079 {
    static final int MAX_VALUE = Integer.MAX_VALUE;
    static final int SIZE = 3;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            char[][] board = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                String line = br.readLine();
                board[i] = line.replace(" ", "").toCharArray();
            }

            int minFlips = findMinFlips(board);
            sb.append(minFlips == MAX_VALUE ? -1 : minFlips).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static int findMinFlips(char[][] board) {
        int minFlips = MAX_VALUE;
        
        for (int mask = 0; mask < (1 << 8); mask++) {  //1<<8: 2의 8승(row:3, colum:3, cross:1, anti_cross:1 => 뒤집을 수도 안뒤집을 수도)
            char[][] tempBoard = copyBoard(board); //각 연산의 원본 보존
            int flips = applyOperations(tempBoard, mask); //연산
            if (checkIsSame(tempBoard)) {
                minFlips = Math.min(minFlips, flips);
            }
        }

        return minFlips;
    }

    private static int applyOperations(char[][] board, int mask) {
        int flips = 0;
        for (int i = 0; i < 8; i++) {
            if ((mask & (1 << i)) != 0) {
                flips++;
                if (i < 3) { // Row 뒤집기
                    flipRow(board, i);
                } else if (i < 6) { // Column 뒤집기
                    flipColumn(board, i - 3);
                } else if (i == 6) { // 대각선 뒤집기
                    flipMainCross(board);
                } else { // anti 대각선 뒤집기
                    flipAntiCross(board);
                }
            }
        }
        return flips;
    }

    private static void flipRow(char[][] board, int row) {
        for (int i = 0; i < SIZE; i++) {
            board[row][i] = flip(board[row][i]);
        }
    }

    private static void flipColumn(char[][] board, int col) {
        for (int i = 0; i < SIZE; i++) {
            board[i][col] = flip(board[i][col]);
        }
    }

    private static void flipMainCross(char[][] board) {
        for (int i = 0; i < SIZE; i++) {
            board[i][i] = flip(board[i][i]);
        }
    }

    private static void flipAntiCross(char[][] board) {
        for (int i = 0; i < SIZE; i++) {
            board[i][SIZE - i - 1] = flip(board[i][SIZE - i - 1]);
        }
    }

    private static char flip(char c) {
        return c == 'H' ? 'T' : 'H';
    }

    private static boolean checkIsSame(char[][] board) {
        char first = board[0][0];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] != first) {
                    return false;
                }
            }
        }
        return true;
    }

    private static char[][] copyBoard(char[][] board) {
        char[][] newBoard = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                newBoard[i][j] = board[i][j];
            }
        }
        return newBoard;
    }

}
