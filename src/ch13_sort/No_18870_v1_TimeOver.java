package ch13_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/** No_18870 좌표 압축
 * 수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.
 * Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표 Xj의 개수와 같아야 한다.
 * X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.

 * 입력
 * 첫째 줄에 N이 주어진다.
 * 둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.

 * 출력
 * 첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.

 * -- 시간 초과 --
 */

public class No_18870_v1_TimeOver {
    public static void main(String[] args) throws IOException {
        //카운팅 정렬를 사용해서 count[] 누적합 시키면 될꺼같은데 X의 범위가 너무 크다. 다른 방법으로...
        //스트림을 이용해보자
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for(int i :arr){
            long count = Arrays.stream(arr).filter(num -> num < i).distinct().count();
            sb.append(count).append(" ");
        }
        System.out.println(sb);
    }
}
