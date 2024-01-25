package baekjoon.ch06_advancedLevel1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_2941 크로아티아 알파벳

 * 입력
 * 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
 * 단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.

 * 출력
 * 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 */
public class No_2941 {
    public static void main(String[] args) throws IOException {
        //1. 변경된 크로아티아 알파벳을 String 배열에 넣는다.
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for(String s:arr){
            str = str.replace(s,"A");
        }
        System.out.println(str.length());
    }
}
