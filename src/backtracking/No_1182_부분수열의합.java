package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1182_부분수열의합 {
    private static int N;
    private static int S;
    private static int[] arr;
    private static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        N = Integer.parseInt(split[0]);
        S = Integer.parseInt(split[1]);

        arr = new int[N];

        split = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        for (int i = 1; i <= N; i++) {
            dfs(i, 0, 0,0);
        }

        System.out.println(count);
    }

    private static void dfs(int M, int at, int depth,int sum) {
        if (depth == M) {
            if (S == sum) {
                count++;

            }
            return;

        }

        for (int i = at; i < N; i++) {
            sum+=arr[i];
            dfs(M, i+1, depth+1,sum);
            sum-=arr[i];
            //여기서 sum = 0으로 해서는 안된다. 다시 reset된다. 이전걸 그대로 가지고 가야한다.
        }
    }
}
