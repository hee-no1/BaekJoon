package baekjoon.ch14_setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/** No_1620 나는야 포켓몬 마스터 (HashMap 2개 이용)
 * 일단 네가 현재 가지고 있는 포켓몬 도감에서 포켓몬의 이름을 보면 포켓몬의 번호를 말하거나, 포켓몬의 번호를 보면 포켓몬의 이름을 말하는 연습을 하도록 하여라. 나의 시험을 통과하면, 내가 새로 만든 도감을 주도록 하겠네.

 * 입력
 * 첫째 줄에는 도감에 수록되어 있는 포켓몬의 개수 N이랑 내가 맞춰야 하는 문제의 개수 M이 주어져. N과 M은 1보다 크거나 같고, 100,000보다 작거나 같은 자연수인데, 자연수가 뭔지는 알지? 모르면 물어봐도 괜찮아. 나는 언제든지 질문에 답해줄 준비가 되어있어.
 * 둘째 줄부터 N개의 줄에 포켓몬의 번호가 1번인 포켓몬부터 N번에 해당하는 포켓몬까지 한 줄에 하나씩 입력으로 들어와. 포켓몬의 이름은 모두 영어로만 이루어져있고, 또, 음... 첫 글자만 대문자이고, 나머지 문자는 소문자로만 이루어져 있어. 아참! 일부 포켓몬은 마지막 문자만 대문자일 수도 있어. 포켓몬 이름의 최대 길이는 20, 최소 길이는 2야. 그 다음 줄부터 총 M개의 줄에 내가 맞춰야하는 문제가 입력으로 들어와. 문제가 알파벳으로만 들어오면 포켓몬 번호를 말해야 하고, 숫자로만 들어오면, 포켓몬 번호에 해당하는 문자를 출력해야해. 입력으로 들어오는 숫자는 반드시 1보다 크거나 같고, N보다 작거나 같고, 입력으로 들어오는 문자는 반드시 도감에 있는 포켓몬의 이름만 주어져. 그럼 화이팅!!!

 * 출력
 * 첫째 줄부터 차례대로 M개의 줄에 각각의 문제에 대한 답을 말해줬으면 좋겠어!!!. 입력으로 숫자가 들어왔다면 그 숫자에 해당하는 포켓몬의 이름을, 문자가 들어왔으면 그 포켓몬의 이름에 해당하는 번호를 출력하면 돼

 * 시간: 760ms, 메모리: 100592KB
 */
public class No_1620_v2_2HashMap {
    public static void main(String[] args) throws IOException {
        //Map을 2개 이용해서 입력값이 무엇인지에 따라 조회해보자.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String,Integer> nameMap = new HashMap<>();
        HashMap<Integer,String> numMap = new HashMap<>();

        for(int i=1;i<=N;i++){
            String name = br.readLine();
            nameMap.put(name, i);
            numMap.put(i, name);
        }

        //출력
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<M;i++){
            String input = br.readLine();
            if(check(input)){ //true이면 int, false이면 String
                sb.append(numMap.get(Integer.parseInt(input))).append("\n");
            }else{
                sb.append(nameMap.get(input)).append("\n");
            }
        }
        System.out.println(sb);
    }

    /*  입력된 값이 숫자인지 문자인지 확인하는 방법은
        일반 문자열은 Integer.parseInt()로 변환이 안돼서 NumberFormatException이 터진다.
        예외를 이용해서 구분해보자.
     */
    static boolean check(String input){
        try{
            Integer.parseInt(input);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
