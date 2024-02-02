package baekjoon.ch15_factor_multiple_primeNum2;

import java.io.*;
import java.util.StringTokenizer;

/** No_1929 소수 구하기 (시간 복잡도: O(N√N), 496ms)
 * M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

 * 출력
 * 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 */
public class No_1929_v1_root {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for(int i=M;i<=N;i++){
            if(primeNumCheck(i)) { sb.append(i).append("\n"); }
        }
        System.out.println(sb);
    }

    private static boolean primeNumCheck(int num){
        if(num == 1) {return false;}
        for(int i=2;i<=Math.sqrt(num);i++){ //루트를 씌울때는 등호가 들어가야한다.
            if(num % i == 0) {return false;}
        }
        //num=2, 3일 때 for문이 실행이 안돼서 자동으로 true가 된다.
        return true;
    }
}
