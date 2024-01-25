package baekjoon.ch11_timeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_24265
 * 1~n까지의 자연수의 합 = n(n+1)/2
 * 시간복잡도: O(N^2)
 */
public class No_24265 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.println(n*(n-1)/2);  //n*(n+1)/2 -n
        System.out.println(2);
    }
}
