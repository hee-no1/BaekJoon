package baekjoon.ch11_timeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_24313 점근적 표기1
 */
public class No_24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int a1 = Integer.parseInt(split[0]);
        int a0 = Integer.parseInt(split[1]);
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        System.out.println((a1 * n0 + a0 <= c * n0) && (c >= a1)?1:0);
    }
}
