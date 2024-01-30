package baekjoon.ch15_factor_multiple_primeNum2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/** No_13241 최소공배수 (유클리드 호제법 이용)
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
public class No_13241_v1_loop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long q; //최대 공약수

        q = gcd(a, b);
        //여기서 a와 b의 대소관계는 신경쓰지 않아도 된다.
        //a < b일 때 결국엔 둘의 자리가 바껴서 큰게 왼쪽에 가고 작은게 오른쪽에 오게된다.

        long lcm = a * b / q;
        System.out.println(lcm);

    }

    static long gcd(long a, long b){
        while(b != 0){
            long r = a % b;
            a = b;
            b = r;
        }
        //b == 0이 되면
        return a;
    }
}
