package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * No_13305 주유소
 */

public class No_13305 {
    public static void main(String[] args) throws IOException {
        /*
            1. 인접한 두 도시를 비교해서 작은 값이 나오는 가격 * 거리 해준다. (x)
            -> 루프돌면서 리터당 가격이 최소값을 구하고 이것과 거리를 곱해주면 된다. (o)
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine()); //도로 길이
        StringTokenizer st2 = new StringTokenizer(br.readLine()); // 기름 가격

        int[] distance_list = new int[N-1];
        int[] price_list = new int[N];

        //도로 길이
        for(int i=0;i<distance_list.length;i++){
            distance_list[i] = Integer.parseInt(st1.nextToken());
        }

        //기름 가격
        for(int i=0;i<price_list.length;i++){
            price_list[i] = Integer.parseInt(st2.nextToken());
        }

        int now_min_price = price_list[0];
        long total_min_price = 0;
//        int total_min_price = 0;  58점에서 타입으로 int에서 long으로 바꾸니깐 100점 나옴
        /*  거리는 1이상 1,000,000,000 이하의 자연수이다. 리터당 가격은 1 이상 1,000,000,000 이하의 자연수
            위의 제약 조건 때문에 총 가격이 int의 범위를 훌쩍 넘을 수 있다.
         */

        for(int i=0;i<N-1;i++){
            if(now_min_price >= price_list[i]){
                now_min_price = price_list[i];
            }
                total_min_price += (long)now_min_price * distance_list[i];
        }

        System.out.println(total_min_price);

    }
}
