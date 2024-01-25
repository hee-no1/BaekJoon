package baekjoon.ch09_factor_multiple_primeNum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/** No_1978 소수 찾기
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

 * 입력
 * 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

 * 출력
 * 주어진 수들 중 소수의 개수를 출력한다.
 */
public class No_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0; //소수의 갯수

        for(int i=0;i<T;i++){
            int num = Integer.parseInt(st.nextToken());
            if(check(num)) count++;
        }

        System.out.println(count);
    }

    static boolean check(int num){
        if(num == 1) return false; //1은 소수도 아니고 합성수도 아니다.

        for(int i=2;i<num;i++){
            if(num%i==0) return false; //1과 자기자신 이외인 약수가 하나라도 있으면 소수가 아니다.
        }
        return true;
    }
}
