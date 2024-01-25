package baekjoon.ch07_array2D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_2566 최댓값
 * 입력
 * 첫째 줄부터 아홉 번째 줄까지 한 줄에 아홉 개씩 수가 주어진다. 주어지는 수는 100보다 작은 자연수 또는 0이다.

 * 출력
 * 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력한다. 최댓값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력한다.
 */
public class No_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //9x9배열 2차원 배열을 만들어서 저장할 필요는 없을 것 같다.
        int max = -1;
        int N = 0; //max일 때 행
        int M = 0; //max일 때 열

        for(int i=0;i<9;i++){
            String[] arr = br.readLine().split(" ");
            for(int j=0;j<9;j++){
                if(max < Integer.parseInt(arr[j])){
                    max = Integer.parseInt(arr[j]);
                    N=i+1; M=j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(N +" "+M);
    }
}
