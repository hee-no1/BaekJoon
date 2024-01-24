package ch13_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/** No_18870 좌표 압축 (Map 이용, ranking을 구하는 문제라 생각)
 * 수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.
 * Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표 Xj의 개수와 같아야 한다.
 * X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.

 * 입력
 * 첫째 줄에 N이 주어진다.
 * 둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.

 * 출력
 * 첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.

 * 시간: 2236ms , 시간 복잡도: O(NlogN)
 */

public class No_18870_v3_Map {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N]; //입력값
        int[] sortArr = new int[N]; //정렬한 것
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            sortArr[i] = arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sortArr);
        int rank = 0;
        for(int num : sortArr){
            if(!map.containsKey(num)){
                map.put(num, rank);
                rank++;
            }
            //map은 key의 중복을 허용하지 않는다.
        }

        StringBuilder sb = new StringBuilder();
        for(int i : arr){
            sb.append(map.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}
