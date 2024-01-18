package ch12_bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_2839 설탕 배달
 * 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 * 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)

 * 출력
 * 상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
 */
public class No_2839 {
    public static void main(String[] args) throws IOException {
        //N을 입력받는다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //5로 나눈 최대 몫을 저장
        int fiveShare = N/5;
        boolean check = false; //N킬로그램을 만들 수 있는 지 check
        int min = Integer.MAX_VALUE;

        while (true) {
            int share = fiveShare;
            int tmp = N;
            tmp = tmp - fiveShare * 5; //share = 3, N = 18 -> 3
            if(tmp % 3 == 0){
                share += tmp/3; //share = 3 -> 4
                check = true;
                min = Math.min(min,share);
            }
            //마지막에 tmp가 0일때 break
            if(fiveShare == 0){break;}

            fiveShare--; //5로 나눈 몫을 하나씩 줄여가면서 check
            //이걸 위의 if문 위에 두면 N이 5보다 작을 경우 에러 발생
        }

        if(check){
            System.out.println(min);
        }else{
            System.out.println(-1);
        }
    }
}
