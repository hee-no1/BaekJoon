package baekjoon.ch15_factor_multiple_primeNum2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_4134 다음 소수 (반복문 두번 - O(N^2))
 *  정수 n(0 ≤ n ≤ 4*109)가 주어졌을 때, n보다 크거나 같은 소수 중 가장 작은 소수 찾는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다.

 * 출력
 * 각각의 테스트 케이스에 대해서 n보다 크거나 같은 소수 중 가장 작은 소수를 한 줄에 하나씩 출력한다.
 */
public class No_4134_v1_TimeOver {
    public static void main(String[] args) throws IOException {
        //정수n 타입을 long으로 하자.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<T;i++){
            long num = Long.parseLong(br.readLine());
            long result = nextPrimeNumber(num);
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }

    //다음 소수를 찾는 메서드
    private static long nextPrimeNumber(long num){
        if(num <= 2){ //num이 0과 1일때 다음 소수는 2
            return 2;
        }

        //이중 반복문 사용
        boolean primeNum = false;
        while(!primeNum){ //소수가 아니면 계속 반복
            int i = 2;
            while(i < num){ //등호 붙이면 안된다. 붙이는 순간 마지막에 무조건 primeNum은 false가 나온다.
                if(num % i == 0){
                    primeNum = false;
                    break;
                }else{
                    i++;
                    primeNum = true;
                }
            }
            num++;
        }
        return num-1;
    }
}
