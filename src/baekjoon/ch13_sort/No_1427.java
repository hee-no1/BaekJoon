package baekjoon.ch13_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/** No_1427 소트인사이드
 * 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

 * 입력
 * 첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.

 * 출력
 * 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.

 * 시간 128ms
 */
public class No_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Character[] arr = new Character[str.length()];

        for(int i=0;i<arr.length;i++){
            arr[i] = str.charAt(i);
        }
        Arrays.sort(arr,Collections.reverseOrder());
        //Collections.reverseOrder() 사용하려면 arr의 래퍼클래스 배열이어야한다.

        for(char c : arr){
            System.out.print(c-'0');
        }
    }
}
