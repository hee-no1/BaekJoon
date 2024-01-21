package ch13_sort;

import java.io.*;

/** No_10989 수 정렬하기 3
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.

 * 출력
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

 * 카운팅 정렬 이용하기
 * 1. count배열을 만들고 채운다.
 * 2. count배열을 누적합으로 채운다.
 * 3. arr배열을 기반으로 count배열의 값-1을 통해 result 배열을 채운다.
 */
public class No_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] count = new int[10001]; //count 배열
        int[] result = new int[arr.length]; //정렬한 결과 배열

        //count 배열에 값 채우기
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
            count[arr[i]]++;
        }

        //count 배열에 누적합 채우기
        for(int i=1;i<count.length-1;i++){
            count[i+1] += count[i];
        }

        //arr 배열을 뒤에 인덱스부터 count 배열의 -1을 해서 result배열을 채운다.
        for(int i=arr.length-1;i>=0;i--){
            result[--count[arr[i]]] = arr[i];
        }

        for(int i:result){
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }
}
