package ch13_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** No_2750 수 정렬하기
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

 * 출력
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

 * 메서드가 아닌 for문 만을 이용해서 정렬해보자.
 * 버블 정렬
 */
public class No_2750_v2_bubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        //먼저 입력 값들을 배열에 넣는다.
        for(int i=0;i<T;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        //인덱스 0과 1비교 -> 0이 1보다 크면 자리 change,
        //그 다음 인덱스 1과 2비교 ... => 큰 숫자부터 (인덱스 큰 값) 자리가 고정된다.
        for(int i=0; i<T-1; i++){ //총 4번
            for(int j=0; j<T-1-i; j++){ //4 -> 3 -> 2 -> 1
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        for(int i:arr){
            System.out.println(i);
        }
    }
}
