package ch08_generalMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_1193 분수찾기
 * 이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.

 * 출력
 * 첫째 줄에 분수를 출력한다.
 */
public class No_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //1. N이 몇번째 그룹인지 알아야한다.
        int end = 2;
        int start = 1;
        int d = 1; //공차인 동시에 몇번째 그룹인지
        while(N >= end){
            start = end;
            d++;
            end += d;
        }

        //2. d+1은 각 대각선 그룹의 분자와 분모의 합이된다.
        int i = d+1;

        //3. i가 짝수일때는 분모부터 1이 시작되고, i가 홀수일때는 분자부터 1이 시작된다.
        int numerator = 1; //분자
        int denominator = 1; //분모
        if(i%2==0){ //i가 짝수일 때
            //분모
            denominator = 1 +(N-start);
            //분자
            numerator = i - denominator;

        }else{ //i가 홀수일 때
            //분자
            numerator = 1+(N-start);
            //분모
            denominator = i - numerator;
        }
        System.out.println(numerator +"/"+denominator);
    }
}
