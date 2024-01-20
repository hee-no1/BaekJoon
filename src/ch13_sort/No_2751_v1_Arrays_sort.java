package ch13_sort;

import java.io.*;
import java.util.Arrays;

/** No_2751 수 정렬하기 2
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

 * 출력
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 *
 * Arrays.sort()를 이용하면
 * println은 시간초과가 나는데 BufferedWriter을 이용하면 시간초과가 안난다.
 */
public class No_2751_v1_Arrays_sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        for(int i:arr){
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
