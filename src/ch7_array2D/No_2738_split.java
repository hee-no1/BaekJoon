package ch7_array2D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_2738 행렬 덧셈
 * N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

 * 출력
 * 첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.
  */
public class No_2738_split {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sizeArr = br.readLine().split(" ");
        int N = Integer.parseInt(sizeArr[0]); //행
        int M = Integer.parseInt(sizeArr[1]); //열

        //NxM의 2차원 행렬을 만들자.
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        //행렬이 2개이기 때문에 2번 반복
        //A
        for(int i=0;i<N;i++){
            String[] arr = br.readLine().split(" ");
            for(int j=0;j<M;j++){
                A[i][j] = Integer.parseInt(arr[j]);
            }
        }
        //B
        for(int i=0;i<N;i++){
            String[] arr = br.readLine().split(" ");
            for(int j=0;j<M;j++){
                B[i][j] = Integer.parseInt(arr[j]);
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(A[i][j] + B[i][j] +" ");
            }
            System.out.println();
        }
    }
}
