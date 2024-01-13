package ch10_geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_1085 직사각형에서 탈출
 * 한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 x, y, w, h가 주어진다.

 * 출력
 * 첫째 줄에 문제의 정답을 출력한다.
 */
public class No_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[1]);
        int w = Integer.parseInt(arr[2]);
        int h = Integer.parseInt(arr[3]);

        //x, w-x, y, h-y를 비교하면 된다.
        System.out.println(Math.min(Math.min(x,w-x),Math.min(y,h-y)));
    }
}
