package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * No_2212 센서
 */

public class No_2212 {
    public static void main(String[] args) throws IOException {
        /*  문제를 파악하는 것부터 어려웠음
            1. 센서 좌표 정렬
            2. 센서 좌표 사이의 거리
            3. 센서 좌표 오름차순 정렬
            5. (N-1)-(K-1) = 작은 순서대로 N-K개의 합을 구함

            (초안 - 완전 잘못됨)
            1. 오름차순으로 정렬
            1-1) 근데 여기서 중복되는 부분을 생략해도 된다고 생각 -> set
            1-2) 다시 list로 변환 후 정렬
            2. for K번 돌리는 건 말이 안됨
            위의 방법 완전 잘못됨
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");
        int[] censors = new int[N]; //센서 좌표
        int[] distanceList = new int[N-1]; //거리
        int sum = 0;

        for(int i=0;i<N;i++){
            censors[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(censors); //센서 좌표 정렬

        for(int i=0;i<N-1;i++){
            distanceList[i] = censors[i + 1] - censors[i];
        }
        Arrays.sort(distanceList); //센서 좌표 거리 정렬

        for(int i=0;i<N-K;i++){
            sum+=distanceList[i];
        }

        System.out.println(sum);

    }
}
