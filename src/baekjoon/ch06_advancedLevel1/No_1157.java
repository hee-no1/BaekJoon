package baekjoon.ch06_advancedLevel1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_1157 단어 공부
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

 * 입력
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

 * 출력
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */


public class No_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        //1. 입력된 알파벳을 count할 수 있는 배열을 하나 만든다.
        int[] arr = new int['Z'-'A'+1];

        //2. 알파벳을 모두 대문자로 바꾼다. toUpperCase()
        str = str.toUpperCase();

        //3. 문자열의 각 자리 알파벳을 아스키 코드로 변환해서 맞는 인덱스에 넣는다.
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'A']++;
        }

        //4. 해당 배열의 max값와 그 max값의 index값을 ch에 넣자.
        int max = 0;
        char ch = ' ';

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
                ch = (char)(i+'A');
            } else if(max == arr[i]){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
