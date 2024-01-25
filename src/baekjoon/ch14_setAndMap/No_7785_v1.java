package baekjoon.ch14_setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/** No_7785 회사에 있는 사람 (문자열 배열 list 사전 역순으로 정렬)
 * 상근이는 모든 사람의 출입카드 시스템의 로그를 가지고 있다. 이 로그는 어떤 사람이 회사에 들어왔는지, 나갔는지가 기록되어져 있다. 로그가 주어졌을 때, 현재 회사에 있는 모든 사람을 구하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 로그에 기록된 출입 기록의 수 n이 주어진다. (2 ≤ n ≤ 106) 다음 n개의 줄에는 출입 기록이 순서대로 주어지며, 각 사람의 이름이 주어지고 "enter"나 "leave"가 주어진다. "enter"인 경우는 출근, "leave"인 경우는 퇴근이다.

 * 회사에는 동명이인이 없으며, 대소문자가 다른 경우에는 다른 이름이다. 사람들의 이름은 알파벳 대소문자로 구성된 5글자 이하의 문자열이다.

 * 출력
 * 현재 회사에 있는 사람의 이름을 사전 순의 역순으로 한 줄에 한 명씩 출력한다
 */
public class No_7785_v1 {
    public static void main(String[] args) throws IOException {
        //HashMap에 정보 저장한 다음에, value값이 enter인 것만 꺼내와서 사전 역순으로 정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, String> store = new HashMap<>();

        //HashMap에 정보 저장, 이미 key가 있었다면, value 값은 덮어써진다.
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            store.put(st.nextToken(), st.nextToken());
        }

        //value값이 enter인 것만 꺼내와서 저장하고 싶다. list에 저장하자
        ArrayList<String> list = new ArrayList<>();

        store.forEach((key,value) -> {
            if(value.equals("enter")){
                list.add(key);
            }
        });

        //list 사전 역순으로 정렬
        list.sort(Comparator.reverseOrder());
//        list.sort((str1, str2) -> str2.compareTo(str1));

        //list 출력
        StringBuilder sb = new StringBuilder();
        list.forEach((str)-> sb.append(str).append("\n"));
        System.out.println(sb);
    }
}
