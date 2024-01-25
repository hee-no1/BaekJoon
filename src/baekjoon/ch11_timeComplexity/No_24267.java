package baekjoon.ch11_timeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_24267
 * 시간 복잡도 : O(N^3)
 */
public class No_24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.println((n*(n-1)*(n-2))/6);  //nC3과 같다. 1~n까지 중복 없이 숫자를 3개를 뽑고, 그것을 크기 순으로 나열하는 것과 같다.
        System.out.println(3);
    }
}
