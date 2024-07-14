package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 순열
 */
public class No_15649_N과M1_순열 {
    private static int N;
    private static int M;
    private static boolean[] visited; //해당 숫자를 방문했는지 check
    private static int[] arr; //해당 숫자를 출력하기 위해 저장

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        N = Integer.parseInt(split[0]);
        M = Integer.parseInt(split[1]);

        visited = new boolean[N];
        arr = new int[M];

        dfs(0);
    }

    private static void dfs(int depth) {
        if (depth == M) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < N; i++) {
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
