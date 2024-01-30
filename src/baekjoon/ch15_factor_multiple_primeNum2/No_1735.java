package baekjoon.ch15_factor_multiple_primeNum2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/** No_1735 분수 합 (돌아가는 버전)
 * 분수 A/B는 분자가 A, 분모가 B인 분수를 의미한다. A와 B는 모두 자연수라고 하자.
 * 두 분수의 합 또한 분수로 표현할 수 있다. 두 분수가 주어졌을 때, 그 합을 기약분수의 형태로 구하는 프로그램을 작성하시오. 기약분수란 더 이상 약분되지 않는 분수를 의미한다.

 * 입력
 * 첫째 줄과 둘째 줄에, 각 분수의 분자와 분모를 뜻하는 두 개의 자연수가 순서대로 주어진다. 입력되는 네 자연수는 모두 30,000 이하이다.

 * 출력
 * 첫째 줄에 구하고자 하는 기약분수의 분자와 분모를 뜻하는 두 개의 자연수를 빈 칸을 사이에 두고 순서대로 출력한다.
 */
public class No_1735 {
    public static void main(String[] args) throws IOException {
        // A/B, C/D
        //1. B와 D,  분모의 최소 공배수 구하기 = LCM
        //2. (LCM/B * A + LCM/D * C)/LCM = E/F
        //3. E와 F의 최대공약수 구하기
        //4. (E/GCD)/(F/GCD)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); //분자
        int b = Integer.parseInt(st.nextToken()); //분모

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        //b와 d의 최소공배수 구하기
        int lcm = lcm(b, d);
        int e = lcm/b * a + lcm/d * c; //더한 결과값의 분자
        int f = lcm; //더한 결과값의 분모

        //e와 f의 최대 공약수 구하기
        int gcd = gcd(e, f);
        e = e/gcd;
        f = f/gcd;

        System.out.println(e + " " + f);

    }

    private static int gcd(int n1, int n2){
        while(n2 !=0){
            int r = n1 % n2;
            n1 = n2;
            n2 = r;
        }
        return n1;
    }

    private static int lcm(int n1, int n2){
        return n1 * n2 / gcd(n1, n2);
    }
}
