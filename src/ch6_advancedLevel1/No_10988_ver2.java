package ch6_advancedLevel1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/** No_10988 팰린드롬인지 확인하기
 * 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
 * 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
 * level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.

 * 입력
 * 첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.

 * 출력
 * 첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.
 */
public class No_10988_ver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = str.toCharArray();
        //순서를 바꿔준다. 이때 (length-1)/2 이런식으로 바꾸지말고 left, right를 이용해서 바꾸자.
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            char tmp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = tmp;
        }
        String reverse = new String(arr);
        System.out.println(str.equals(reverse)?1:0);
    }
}
