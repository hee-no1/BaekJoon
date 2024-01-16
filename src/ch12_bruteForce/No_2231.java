package ch12_bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_2231 분해합
 * 어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다. 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
 * 자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.

 * 출력
 * 첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.
 */
public class No_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //1. N을 입력 받는다.
        String str = br.readLine();
        int N = Integer.parseInt(str);

        //2. 임의의 M을 만든다. M = 첫번째 자리 숫자와 나머지 자리수에 들어올 수 있는 최대값인 9를 N에서 빼준다.
        int M = N - str.length()*9;

        //여기서 부터 과정이 반복된다.
        while(true){
            String M_String = M + ""; //분해 합을 위해 String으로 만들어준다.

            //3. M의 분해합을 구한다. 이때 분해합과 N을 비교할 수 있게 새로운 변수를 저장
            int sum = M;
            for(int i=0;i<M_String.length();i++){
                sum += M_String.charAt(i)-'0';
            }

            //4. sum과 N을 비교한다.
            if(N == sum){ //N과 sum이 같다면
                System.out.println(M);
                break;
            }else{ //같지 않다면
                if(N > M){  //주의! 여기서는 sum이 아니라 M과 비교해야한다.
                    M++;
                }else{
                    System.out.println(0);
                    break;
                }
            }
        }
    }
}
