package baekjoon.ch15_factor_multiple_primeNum2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/** No_4134 다음 소수 (BigInteger 이용)
 *  정수 n(0 ≤ n ≤ 4*109)가 주어졌을 때, n보다 크거나 같은 소수 중 가장 작은 소수 찾는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다.

 * 출력
 * 각각의 테스트 케이스에 대해서 n보다 크거나 같은 소수 중 가장 작은 소수를 한 줄에 하나씩 출력한다.
 */
public class No_4134_v3_BigInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<T;i++){
            BigInteger num = new BigInteger(br.readLine());
            //sb.append(num.nextProbablePrime()).append("\n"); 를 바로 사용하면 결과가 틀렸다고 나온다.
            if(num.isProbablePrime(10)){ //isProbablePrime의 매개변수에 2로 하면 결과가 틀렸습니다로 나옴
                sb.append(num).append("\n");
            }else{
                sb.append(num.nextProbablePrime()).append("\n");
            }
        }


        System.out.println(sb);
    }
}

