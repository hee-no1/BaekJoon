package ch5_String;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/** No_10809 알파벳 찾기
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

 * 출력
 * 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
 * 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
 */
public class No_10809 {
    public static void main(String[] args) throws IOException{
        //문자열 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        //바로 바로 출력할 수 있는 건 배열에 굳이 담을 필요없다.
        //1. String.indexOf()는 input되는 문자나 문자열이 해당 String에 없다면 -1을 반환한다.
        for(int i='a'; i<='z';i++){
            System.out.print(str.indexOf(i) + " ");
            //2. char은 숫자이다!!
        }
    }
}

