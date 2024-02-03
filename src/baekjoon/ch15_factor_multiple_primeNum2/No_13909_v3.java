package baekjoon.ch15_factor_multiple_primeNum2;

import java.io.*;

/** No_13909 창문 닫기
 * 서강대학교 컴퓨터공학과 실습실 R912호에는 현재 N개의 창문이 있고 또 N명의 사람이 있다. 1번째 사람은 1의 배수 번째 창문을 열려 있으면 닫고 닫혀 있으면 연다.  2번째 사람은 2의 배수 번째 창문을 열려 있으면 닫고 닫혀 있으면 연다. 이러한 행동을 N번째 사람까지 진행한 후 열려 있는 창문의 개수를 구하라. 단, 처음에 모든 창문은 닫혀 있다.
 * 예를 들어 현재 3개의 창문이 있고 3명의 사람이 있을 때,
 * 1번째 사람은 1의 배수인 1,2,3번 창문을 연다. (1, 1, 1)
 * 2번째 사람은 2의 배수인 2번 창문을 닫는다. (1, 0, 1)
 * 3번째 사람은 3의 배수인 3번 창문을 닫는다. (1, 0, 0)
 * 결과적으로 마지막에 열려 있는 창문의 개수는 1개 이다.

 * 입력
 * 첫 번째 줄에는 창문의 개수와 사람의 수 N(1 ≤ N ≤ 2,100,000,000)이 주어진다.

 * 출력
 * 마지막에 열려 있는 창문의 개수를 출력한다.
 */
public class No_13909_v3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for(int i=1;i*i<=N;i++){
            count++;
        }

        System.out.println(count);
    }
}
/*
    사람이 아닌 창문을 기준으로 생각
    그 창문의 약수들만 창문으로 열었다 닫을 수 있다.
    그리고 약수의 개수가 홀수일 때 최종적으로 문이 열려있다.
    그럼 약수의 개수가 홀수일 때는 언제일까?
    약수의 보통 다른 수와 짝을 이루는데, 같은 수와 짝을 이룰 때는 약수가 하나로 카운팅되기 때문에 총 약수의 개수가 홀수가된다.
    같은 수와 짝을 이루는 약수를 같는 수 => 제곱수
 */
