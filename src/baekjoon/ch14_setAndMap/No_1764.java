package baekjoon.ch14_setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/** No_1764 듣보잡
 * 김진영이 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때, 듣도 보도 못한 사람의 명단을 구하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다. 이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다. 이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다.
 * 듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.

 * 출력
 * 듣보잡의 수와 그 명단을 사전순으로 출력한다.
 */
public class No_1764 {
    public static void main(String[] args) throws IOException {
        //map에 먼저 듣도 못한 사람 저장(name, false), 보도 못한 사람 저장할 때 값이 있으면 true로 바꿔준다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Boolean> store = new HashMap<>();

        //듣도 못한 명단
        for(int i=0;i<N;i++){
            store.put(br.readLine(),false);
        }

        //듣보잡을 저장하기 위한 set
        ArrayList<String> list = new ArrayList<>();

        for(int i=0;i<M;i++){
            String name = br.readLine();
            if(store.containsKey(name)){
                list.add(name);
            }
        }

        //사전 순으로 정렬
        Collections.sort(list);
        //출력
        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append("\n");
        list.forEach(str -> sb.append(str).append("\n"));
        System.out.println(sb);
    }
}
