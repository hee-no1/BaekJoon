package baekjoon.ch15_factor_multiple_primeNum2;

import java.io.*;

/** No_17103 골드바흐 파티션 (시간: 380ms, 메모리: 72096KB)
 * 골드바흐의 추측: 2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있다.
 * 짝수 N을 두 소수의 합으로 나타내는 표현을 골드바흐 파티션이라고 한다. 짝수 N이 주어졌을 때, 골드바흐 파티션의 개수를 구해보자. 두 소수의 순서만 다른 것은 같은 파티션이다.

 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T (1 ≤ T ≤ 100)가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 N은 짝수이고, 2 < N ≤ 1,000,000을 만족한다.

 * 출력
 * 각각의 테스트 케이스마다 골드바흐 파티션의 수를 출력한다.
 */
public class No_17103_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            int num = Integer.parseInt(br.readLine());
            boolean[] check = new boolean[num+1];
            int count = 0; //골드바흐 파티션의 개수
            //소수 모두 구하기
            primeCheck(check, num);

            for(int j=2;j<=check.length/2;j++){
                if(!check[j] && !check[num-j]){
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    private static void primeCheck(boolean[] check, int num){
        check[0] = check[1] = true;

        //num보다 작거나 같은 소수를 모두 구하기
        for(int i=2;i<=Math.sqrt(num);i++){
            if(check[i]) {continue;}
            for(int j=i*i;j<check.length;j+=i){
                check[j] = true;
            }
        }
    }
}
