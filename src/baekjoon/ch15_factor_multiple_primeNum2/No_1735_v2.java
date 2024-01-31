package baekjoon.ch15_factor_multiple_primeNum2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/** No_1735 분수 합 (그냥 통분, 이게 더 빠름)
 * 분수 A/B는 분자가 A, 분모가 B인 분수를 의미한다. A와 B는 모두 자연수라고 하자.
 * 두 분수의 합 또한 분수로 표현할 수 있다. 두 분수가 주어졌을 때, 그 합을 기약분수의 형태로 구하는 프로그램을 작성하시오. 기약분수란 더 이상 약분되지 않는 분수를 의미한다.

 * 입력
 * 첫째 줄과 둘째 줄에, 각 분수의 분자와 분모를 뜻하는 두 개의 자연수가 순서대로 주어진다. 입력되는 네 자연수는 모두 30,000 이하이다.

 * 출력
 * 첫째 줄에 구하고자 하는 기약분수의 분자와 분모를 뜻하는 두 개의 자연수를 빈 칸을 사이에 두고 순서대로 출력한다.
 */
public class No_1735_v2 {
    public static void main(String[] args) throws IOException {
        //A/B와 C/D일 때 분모를 B*D로 통분하고, 나중에 그 합을 분자와 분모의 최대공약수로 각각 나눠준다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 분자
        int b = Integer.parseInt(st.nextToken()); // 분모

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken()); // 분자
        int d = Integer.parseInt(st.nextToken()); // 분모

        //분모를 bd로 통분하고 더한 결과: (ad + cb)/bd = e/f
        int e = a*d + c*b; //분자
        int f = b*d; //분모

        //분자와 분모의 최대공약수를 구해 각각 나눠주면 기약 분수가 된다.
        int gcd = gcd(e, f);
        System.out.println(e/gcd + " " + f/gcd);

    }

    //최대공약수 구하기 - 유클리드 호제법 이용 A를 B로 나눈 나머지 = r, ->  GCD(A,B) = G(B,r)
    private static int gcd(int n1, int n2){
        while(n2 != 0){
            int r = n1 % n2;
            n1 = n2;
            n2 = r;
        }
        return n1;
    }
}
