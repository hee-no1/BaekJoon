package baekjoon.ch11_timeComplexity;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_24266
 * 시간 복잡도: O(N^3) - for문 3번
 */
public class No_24266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.println(n*n*n);
        System.out.println(3);
    }
}
