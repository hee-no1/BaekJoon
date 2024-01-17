package ch12_bruteForce;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/** No_19532 수학은 비대면 강의입니다.
 * ax + by = c
 * dx + ey = f

 * 입력
 * 정수 a, b, c, d, e, f가 공백으로 구분되어 차례대로 주어진다.(-999<=a,b,c,d,e,f<=999)
 * 문제에서 언급한 방정식을 만족하는 (x,y)가 유일하게 존재하고, 이때x와 y가 각각 -999이상 999 이하의 정수인 경우만 입력으로 주어짐이 보장된다.

 * 출력
 * 문제의 답인 x와 y를 공백으로 구분해 출력한다.
 */
public class No_19532_ver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close(); //BufferedReader 닫음
        int a = parseInt(st.nextToken());
        int b = parseInt(st.nextToken());
        int c = parseInt(st.nextToken());
        int d = parseInt(st.nextToken());
        int e = parseInt(st.nextToken());
        int f = parseInt(st.nextToken());

        int x = (c*e-b*f)/(a*e-b*d);
        int y = (c*d-a*f)/(b*d-a*e);

        bw.write(x +" " + y);
        bw.flush(); //버퍼에 있는거 모두 출력, 스트림 비움
        bw.close(); //스트림 종료

    }
}
