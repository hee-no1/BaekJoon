package baekjoon.ch11_timeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_24264
 * 시간 복잡도: O(N^2) - for문 2개
 * 주의: int타입으로 계산할 때 결과값이 거질거같으면 long으로 타입 변환을 해야한다.
 */
public class No_24264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println((long)Math.pow(Double.parseDouble(br.readLine()), 2));
        System.out.println(2);
    }
}
