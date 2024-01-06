package ch5_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_11720 숫자의 합
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

 * 출력
 * 입력으로 주어진 숫자 N개의 합을 출력한다.
 */

public class No_11720 {
    public static void main(String[] args) throws IOException {

        //1. N: 숫자를 하나씩 저장할 배열의 크기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[Integer.parseInt(br.readLine())];

        String str = br.readLine();
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            //2. 문자열을 각 자리마다 char로 받아서, 아스키코드를 숫자로 변경
            sum += str.charAt(i)-'0';
        }

        System.out.println(sum);
    }
}
