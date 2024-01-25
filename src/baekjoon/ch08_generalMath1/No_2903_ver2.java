package baekjoon.ch08_generalMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_2093 중앙 이동 알고리즘
 * 수열의 차이가 공비인 경우
 * 관점2. 수열의 차이를 d-1로 본 경우
 */
public class No_2903_ver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int d = 2;
        for(int i=0;i<N;i++){
            d = d + (d-1);
        }
        System.out.println(d*d);
    }
}
