package ch08_generalMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/** No_11005 진법 변환 2
 * 10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
 * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
 * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

 * 입력
 * 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36) N은 10억보다 작거나 같은 자연수이다.

 * 출력
 * 첫째 줄에 10진법 수 N을 B진법으로 출력한다.
 */
public class No_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        StringBuilder result = new StringBuilder(10);

        //N/B < B가 되면 반복문 중단
        //몫이 0이면 그 값은 포함안된다.
        while (N != 0) {
            int i = N % B;
            if (10 <= i && i <= 35) { //10~35가 나오면 A~Z로 바꿔서 append해야한다.
                result.append((char) (i + 'A' - 10));
            } else {
                result.append(i);
            }
            N /= B;
        }
        System.out.println(result.reverse());
    }
}
