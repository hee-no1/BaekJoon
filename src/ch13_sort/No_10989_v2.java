package ch13_sort;

import java.io.*;

/** No_10989 수 정렬하기 3
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.

 * 출력
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

 * 이것 또한 카운팅 정렬
 */
public class No_10989_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] count = new int[10001];

        //입력한 것을 그대로 count 배열에 넣는다.
        for(int i=0;i<N;i++){
            count[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        //count의 값이 0보다 큰것인 것만 그만큼 반복적으로 출력해주면된다.
        for(int i=1;i<count.length;i++){
            while(count[i] > 0){
                bw.write(i+"\n");
                count[i]--;
            }
        }
        bw.flush();
        bw.close();
    }
}
