package ch6_advancedLevel1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_1316 그룹 단어 체커
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오

 * 입력
 * 첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

 * 출력
 * 첫째 줄에 그룹 단어의 개수를 출력한다.

 * 좀 더 다듬어보자.
 */
public class No_1316_ver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int count = 0; //그룹함수의 갯수

        for(int i=0;i<T;i++){
            if(check(br.readLine())) count++;
        }

        System.out.println(count);
    }

    static boolean check(String str){
        boolean[] arr = new boolean['z'-'a'+1]; // 이전에 해당하는 문자가 나온적 있는지 check
        //prev는 i의 값, now i+1의 값
        char prev = str.charAt(0);
        arr[str.charAt(0)-'a'] = true;
        char now = ' ';

        for(int i=1;i<str.length();i++){
            now = str.charAt(i);
            if(prev != now){ //현재 값과 이전 값이 같지 않으면
                if(arr[now-'a']) {
                    return false;
                }else{
                    arr[now-'a'] = true;
                    prev = now; //이제 현재의 값을 prev로 넣어준다.
                }
            }
        }
        return true;
    }
}
