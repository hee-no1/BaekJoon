package baekjoon.ch15_factor_multiple_primeNum2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_4134 다음 소수 (반복문 두번 - O(N√N))
 *  정수 n(0 ≤ n ≤ 4*109)가 주어졌을 때, n보다 크거나 같은 소수 중 가장 작은 소수 찾는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다.

 * 출력
 * 각각의 테스트 케이스에 대해서 n보다 크거나 같은 소수 중 가장 작은 소수를 한 줄에 하나씩 출력한다.
 */
public class No_4134_v2_root {
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
        } else if(num == 3){ //num 2, 3일때는 다음 소수 자기자신
            return num;
        }
        //소수 찾을 때 2부터 약수로 가지는지 확인해봐야하는데 시간을 줄이기위해 루트N까지만 확인한다.
        //이렇게 되면 num이 2와 3일때는 루트N이 2보다 작으므로 원하는 값이 나오질 않는다. 그래서 따로 정의해준 것

        //이중 반복문 사용
        boolean primeNum = false;
        while(!primeNum){ //소수가 아니면 계속 반복
            int i = 2;
            while(i <= Math.sqrt(num)){
                if(num % i == 0){
                    primeNum = false;
                    break;
                }
                i++;
                primeNum = true;
            }
            num++;
        }
        return num-1;
    }
}

/* num = 16일 때
 * (1,16)
 * (2,8)
 * (4,4)  <- √num을 기준으로 (x,y)가 자리만 바뀔뿐 반복되는 것을 볼 수 있다. 즉, √num까지만 약수가 있는지 확인하면 된다.
 * (8,2)
 * (16,1)
 */
