package baekjoon.ch15_factor_multiple_primeNum2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_17103 골드바흐 파티션 (시간: 1984ms, 메모리: 72008KB)
 * 골드바흐의 추측: 2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있다.
 * 짝수 N을 두 소수의 합으로 나타내는 표현을 골드바흐 파티션이라고 한다. 짝수 N이 주어졌을 때, 골드바흐 파티션의 개수를 구해보자. 두 소수의 순서만 다른 것은 같은 파티션이다.

 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T (1 ≤ T ≤ 100)가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 N은 짝수이고, 2 < N ≤ 1,000,000을 만족한다.

 * 출력
 * 각각의 테스트 케이스마다 골드바흐 파티션의 수를 출력한다.
 */
public class No_17103_v1 {
    public static void main(String[] args) throws IOException {
        //N/2까지의 소수 a를 구하고 a + b = N, b가 소수인지 확인
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<T;i++){
            int num = Integer.parseInt(br.readLine());
            sb.append(primeNumCheck1(num)).append("\n");
        }
        System.out.println(sb);
    }

    private static int primeNumCheck1(int num){
        int count = 0; //골드바흐 파티션의 수
        boolean[] check = new boolean[num+1];
        check[0] = check[1] = true;

        //소수 찾기
        for(int i=2;i<=Math.sqrt(num);i++){
            if(check[i]) {continue;}
            for(int j=i*i;j<check.length;j+=i){
                check[j] = true;
            }
        }

        for(int i=2;i<=check.length/2;i++){
            if(!check[i]){
                if(primeNumCheck2(num - i)) {count++;}
            }
        }
        return count;
    }

    //b가 소수인지 check
    private static boolean primeNumCheck2(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
