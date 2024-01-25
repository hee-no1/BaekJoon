package baekjoon.ch08_generalMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_2292 벌집
 */
public class No_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //이 문제는 해당 숫자가 몇번째 라인에 있는지 구하는 문제
        int line = 1;
        int start = 2; //라인의 마지막 숫자 +1이자 처음 시작하는 숫자.

        while(N >= start){
            start += line * 6; //end = 8
            line++; //1, 실제로는 2째줄
        }
        System.out.println(line);
    }
}
