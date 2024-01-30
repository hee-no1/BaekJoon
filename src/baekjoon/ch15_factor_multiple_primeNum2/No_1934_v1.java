package baekjoon.ch15_factor_multiple_primeNum2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/** No_1934 최소공배수(소인수 구하기, 최소공배수 구하기)
 * 두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다. 이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.
 * 두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 둘째 줄부터 T개의 줄에 걸쳐서 A와 B가 주어진다. (1 ≤ A, B ≤ 45,000)

 * 출력
 * 첫째 줄부터 T개의 줄에 A와 B의 최소공배수를 입력받은 순서대로 한 줄에 하나씩 출력한다.
 */
public class No_1934_v1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            sb.append(leastCommonMultiple(num1, num2)).append("\n");
        }

        System.out.println(sb);
    }

    //최소공배수 구하기
    //num1의 소인수를 구하고 그 소인수를 순회하면서 그 소인수가 num2의 약수이면 num2 = num2/소인수로 한다.
    //소인수는 입력들어온 2개의 숫자 중 하나만 구하면된다.
    static int leastCommonMultiple(int num1, int num2){
        int multiple = 1;
        ArrayList<Integer> list1 = new ArrayList<>();
        factorization(list1, num1);
        for(int i : list1){
            if(num2 % i == 0){
                num2 = num2/i;
            }
            multiple *= i;
        }
        return multiple * num2;
    }

    //소인수 구하기
    static void factorization(ArrayList<Integer> list, int num){
        if(num == 1) {
            list.add(num);
        }

        //2부터 시작해서 소인수를 구한다.
        int factor = 2;
        while(num!=1){
            if(num % factor == 0){
                num = num/factor;
                list.add(factor);
            }else{
                factor++;
            }
        }
    }
}
