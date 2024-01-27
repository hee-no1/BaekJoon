package baekjoon.ch14_setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/** No_1269 대칭 차칩합 (Hashmap 이용)
 * 자연수를 원소로 갖는 공집합이 아닌 두 집합 A와 B가 있다. 이때, 두 집합의 대칭 차집합의 원소의 개수를 출력하는 프로그램을 작성하시오. 두 집합 A와 B가 있을 때, (A-B)와 (B-A)의 합집합을 A와 B의 대칭 차집합이라고 한다.
 * 예를 들어, A = { 1, 2, 4 } 이고, B = { 2, 3, 4, 5, 6 } 라고 할 때,  A-B = { 1 } 이고, B-A = { 3, 5, 6 } 이므로, 대칭 차집합의 원소의 개수는 1 + 3 = 4개이다.

 * 입력
 * 첫째 줄에 집합 A의 원소의 개수와 집합 B의 원소의 개수가 빈 칸을 사이에 두고 주어진다. 둘째 줄에는 집합 A의 모든 원소가, 셋째 줄에는 집합 B의 모든 원소가 빈 칸을 사이에 두고 각각 주어진다. 각 집합의 원소의 개수는 200,000을 넘지 않으며, 모든 원소의 값은 100,000,000을 넘지 않는다.

 * 출력
 * 첫째 줄에 대칭 차집합의 원소의 개수를 출력한다.
 */
public class No_1269_HashMap {
    public static void main(String[] args) throws IOException {
        //map 2개 만들고, A map과 B map을 비교하면서 같은게 있으면 둘 다 제거
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Boolean> map1 = new HashMap<>();
        HashMap<String, Boolean> map2 = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            map1.put(st.nextToken(), true);
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            String input = st.nextToken();
            if(map1.containsKey(input)){//input한 게 map1에 있을 때
                //map2에는 저장하지 않고, map1에서 해당 값을 삭제해준다.
                map1.remove(input);
            }else{
                //input한게 map1에 없을때 map2에 저장
                map2.put(input, true);
            }
        }
        System.out.println(map1.size() + map2.size());
    }
}
