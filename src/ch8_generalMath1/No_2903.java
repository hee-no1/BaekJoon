package ch8_generalMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_2903 중앙 이동 알고리즘
 */
public class No_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int now = 2;
        for(int i=1;i<=N;i++){
            now = now + (int)Math.pow(2,i-1); //Math.pow(i,j)은 i의 j승
        }
        System.out.println(now*now);
    }
}
