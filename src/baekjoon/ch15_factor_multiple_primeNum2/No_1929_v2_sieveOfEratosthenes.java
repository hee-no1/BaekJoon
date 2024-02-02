package baekjoon.ch15_factor_multiple_primeNum2;

import java.io.*;
import java.util.StringTokenizer;

/** No_1929 소수 구하기 (에라토스테네스의 체 이용, 시간 복잡도: O(Nlog(logN)), 268ms)
 * M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

 * 출력
 * 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 */
public class No_1929_v2_sieveOfEratosthenes {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] check = new boolean[N+1];
        //소수인 것은 false, 소수가 아니면 true (boolean의 기본값이 false이기 때문에 소수가 아닌것은 true 바꿔준다.)
        check[0] = check[1] = true;

        for(int i=2;i<=Math.sqrt(N);i++){
            if(check[i]) { continue; }

            for(int j=i*i;j<check.length;j+=i){
                //초기값을 i*i를 하는 이유는 처음 들어오는 i는 소수이기 때문이다. ex) 2는 소수 4부터 소수가 아니다.
                check[j] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=M;i<=N;i++){
            if(!check[i]) {sb.append(i).append("\n"); }
        }

        System.out.println(sb);
    }
}
