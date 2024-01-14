package ch10_geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/** No_3009 네 번째 점
 * 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

 * 입력
 * 세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

 * 출력
 * 직사각형의 네 번째 점의 좌표를 출력한다.
 */
public class No_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //x,y 각각 쌍을 이루지 못한 좌표를 찾아내면 된다.
        int[] x_arr = new int[3]; //x좌표를 모두 저장한 배열
        int[] y_arr = new int[3]; //y좌표를 모두 저장한 배열
        StringTokenizer st;

        for(int i=0;i<x_arr.length;i++){
            st = new StringTokenizer(br.readLine());
            x_arr[i] = Integer.parseInt(st.nextToken());
            y_arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = 0; //네번째 점의 x좌표
        int y = 0; //네번째 점의 y좌표

        //쌍을 이루지 목한 좌표 x좌표 찾기
        if(x_arr[0] == x_arr[1]){
            x = x_arr[2];
        } else if(x_arr[0] == x_arr[2]){
            x = x_arr[1];
        } else if(x_arr[1] == x_arr[2]){
            x = x_arr[0];
        }

        //쌍을 이루지 목한 좌표 y좌표 찾기
        if(y_arr[0] == y_arr[1]){
            y = y_arr[2];
        } else if(y_arr[0] == y_arr[2]){
            y = y_arr[1];
        } else if(y_arr[1] == y_arr[2]){
            y = y_arr[0];
        }

        System.out.print(x + " " + y);
    }
}
