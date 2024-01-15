package ch11_timeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_24264
 * 시간 복잡도: O(N^2) - for문 2개
 *
 */
public class No_24264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println((int)Math.pow(Double.parseDouble(br.readLine()), 2));
        System.out.println(2);
    }
}
