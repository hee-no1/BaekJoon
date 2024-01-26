package baekjoon.ch14_setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/** No_10816 숫자 카드 2
 * 숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.
 * 셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

 * 출력
 * 첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력한다.
 */
public class No_10816_v1 {
    public static void main(String[] args) throws IOException {
        //먼저 map에 해당 입력값들을 저장한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> store = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        /*  입력값을 저장할 때
            이전에 해당 숫자가 없으면 1을 넣어주고
            이전에 해당 숫자가 있으면 count를 올려준다.
         */
        for(int i=0;i<N;i++){
            String input = st.nextToken();
            if(!store.containsKey(input)){
                store.put(input,1);
            }else{
                Integer count = store.get(input);
                store.put(input,++count);
            }
        }

        /*  출력할 때 map에 해당 key값이 있으면 value그대로 출력
            key값이 없으면 0 출력
         */
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++) {
            Integer result = store.get(st.nextToken());
            if(result != null){
                sb.append(result).append(" ");
            }else{
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
    }
}
