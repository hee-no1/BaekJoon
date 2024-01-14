package ch08_generalMath1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/** No_2745 진법 변환
 * B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
 * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
 * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

 * 입력
 * 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)

 * B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.

 * 출력
 * 첫째 줄에 B진법 수 N을 10진법으로 출력한다.
  */

public class No_2745 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        //진법 계산을 쉽게 하기 위해서 입력값으로 뒤바꾼다.
        String N = new StringBuilder(arr[0]).reverse().toString();
        int B = Integer.parseInt(arr[1]);
        int result = 0; //십진수로 나타낸 값
        int tmp = 1;

        //N의 각 자리를 순회하면서 index 만큼 B를 곱한 뒤 최종적으로 해당 index의 값을 곱한 후 더한다.
        for(int i=0;i<N.length();i++){
            //A~Z는 10~35로 바꿔줘야한다.
            char ch = N.charAt(i);
            if('A'<=ch && ch<='Z'){
                result += (ch-'A'+10) * tmp;
            }else {
                result += (ch-'0') * tmp;
            }
            tmp *= B;
        }

        System.out.println(result);
    }
}
