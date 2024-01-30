package baekjoon.ch15_factor_multiple_primeNum2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/** No_13241 최소공배수 (유클리드 호제법, 재귀함수 이용)
 * 당신은 두 수에 대하여 최소공배수를 구하는 프로그램을 작성 하는 것이 목표이다.
 *
 * 입력
 * 한 줄에 두 정수 A와 B가 공백으로 분리되어 주어진다.
 * 50%의 입력 중 A와 B는 1000(103)보다 작다. 다른 50%의 입력은 1000보다 크고 100000000(108)보다 작다.
 * 추가: 큰 수 입력에 대하여 변수를 64비트 정수로 선언하시오. C/C++에서는 long long int를 사용하고, Java에서는 long을 사용하시오.

 * 출력
 * A와 B의 최소공배수를 한 줄에 출력한다.

 * <유클리드 호제법이란>
 * A와 B의 최대 공약수 GCD
 * A를 B로 나눴을 때 나머지를 r이라고 했을 때
 * GCD(A,B) = GCD(B,r) = q
 *
 * A와 B의 최소공배수 LCM
 * A = aq, B = bq
 * LCM(A,B) = abq = A*B/GCD(A,B) = (aq * bq)/q
 */
public class No_13241_v2_recursive {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long q = gcd(a,b); //최대 공약수
        long lcm = a * b / q; //최소 공배수
        System.out.println(lcm);
    }

    private static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
