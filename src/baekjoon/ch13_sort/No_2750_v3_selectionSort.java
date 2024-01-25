package baekjoon.ch13_sort;

import java.io.*;

/** No_2750 수 정렬하기
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

 * 출력
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

 * 메서드가 아닌 for문 만을 이용해서 정렬해보자.
 * 선택 정렬
 */
public class No_2750_v3_selectionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];

        for(int i=0;i<T;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        for(int i=0;i<T-1;i++){
            int tmp;
            for(int j=i+1;j<T;j++){
                if(arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for(int i:arr){
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
