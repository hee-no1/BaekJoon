package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 조합
 */

public class No_15650_N과M2_조합 {
    private static int N;
    private static int M;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        N = Integer.parseInt(split[0]);
        M = Integer.parseInt(split[1]);

        arr = new int[M];

        dfs(0, 0);

    }

    private static void dfs(int at, int depth) {
        if (depth == M) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
            return;
        }

        for (int i = at; i < N; i++) {

            arr[depth] = i+1;
            dfs(i + 1, depth + 1);

        }
    }

}
