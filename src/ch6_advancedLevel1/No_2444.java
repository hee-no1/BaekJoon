package ch6_advancedLevel1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_2444 별 찍기 -7
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 5

 * 출력
 * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */

public class No_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<2*N-1;i++){
            for(int j=0;j<2*N-1;j++){
                if(i+j>=N-1&& i+j<=3*N-3 && Math.abs(j-i)<=N-1){
                    System.out.print("*");
                }else if (i+j<N-1 || i-j>N-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
