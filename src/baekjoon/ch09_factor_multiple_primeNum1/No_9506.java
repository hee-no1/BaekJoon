package baekjoon.ch09_factor_multiple_primeNum1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/** No_9506 약수들의 합
 * 어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.
 * 예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.
 * n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.

 * 입력
 * 입력은 테스트 케이스마다 한 줄 간격으로 n이 주어진다. (2 < n < 100,000)
 * 입력의 마지막엔 -1이 주어진다.

 * 출력
 * 테스트케이스 마다 한줄에 하나씩 출력해야 한다.
 * n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력한다(예제 출력 참고).
 * 이때, 약수들은 오름차순으로 나열해야 한다.
 * n이 완전수가 아니라면 n is NOT perfect. 를 출력한다
 */

public class No_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            if(n == -1) break;

            //배열에 약수 저장하자.
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=1;i<n;i++){ //n은 포함 시키지 않는다.
                if(n % i == 0) {
                    sum += i;
                    arr.add(i); //약수이면 arr에 추가
                }
            }
            if(sum == n){
                System.out.print(n + " = ");
                for(int i=0;i<arr.size();i++){
                    if(i != arr.size()-1){
                        System.out.print(arr.get(i) + " + ");
                    }else{
                        System.out.print(arr.get(i)+"\n");
                    }
                }
            }else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}
