package baekjoon.ch16_stack_queue_deque;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/** No_12789 도키도키 간식드리미 (시간: 136ms, 푸는 시간 너무 오래 걸렸음)
 * 학생들이 순서대로 줄을 서려고 했지만 공간이 너무 협소해서 마음대로 이동할 수 없었다. 다행히도 대기열의 왼쪽에는 1열로 설 수 있는 공간이 존재하여 이 공간을 잘 이용하면 모두가 순서대로 간식을 받을 수 있을지도 모른다. 자칫 간식을 못 받게 될지도 모른다는 위기감을 느낀 승환이는 자신의 컴퓨터 알고리즘적 지식을 활용해 과연 모든 사람들이 순서대로 간식을 받을 수 있는지 확인하는 프로그램을 만들기로 했다. 만약 불가능 하다면 승환이는 이번 중간고사를 망치게 될 것 이고 가능하다면 힘을 얻어 중간고사를 잘 볼 수 있을지도 모른다.
 * 사람들은 현재 1열로 줄을 서있고, 맨 앞의 사람만 이동이 가능하다. 인규는 번호표 순서대로만 통과할 수 있는 라인을 만들어 두었다. 이 라인과 대기열의 맨 앞 사람 사이에는 한 사람씩 1열이 들어갈 수 있는 공간이 있다. 현재 대기열의 사람들은 이 공간으로 올 수 있지만 반대는 불가능하다. 승환이를 도와 프로그램을 완성하라.
 * 현재 간식 배부 공간을 그림으로 나타내면 다음과 같다.
 * 위 예제는 다음 그림과 같이 움직였을 때 모두가 순서대로 간식을 받을 수 있다..

 * 입력
 * 입력의 첫째 줄에는 현재 승환이의 앞에 서 있는 학생들의 수 N(1 ≤ N ≤ 1,000,자연수)이 주어진다.
 * 다음 줄에는 승환이 앞에 서있는 모든 학생들의 번호표(1,2,...,N) 순서가 앞에서부터 뒤 순서로 주어진다.

 * 출력
 * 승환이가 무사히 간식을 받을 수 있으면 "Nice"(따옴표는 제외)를 출력하고 그렇지 않다면 "Sad"(따옴표는 제외)를 출력한다.
 */
public class No_12789_wrong {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        //입력값을 저장할 int[] 1개, 값을 임시로 저장할 stack 1개 필요
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        bw.write(check(arr));
        bw.flush();
        bw.close();
    }

    static String check(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int order = 1; //순번

        //순번을 기준으로 arr와 stack을 비교해가며 먼저 arr를
        //arr를 순회하면서 order와 arr값을 비교
        for(int i=0;i<arr.length;i++){
            //arr의 현재 index값과 order가 같다면
            if(arr[i] == order){
                //order만 + 1 해주면 된다.
                order++;
            }else if(!stack.empty() && stack.peek() == order) {//arr의 현재 index값과 order가 같지 않다면 stack이 비어있지 않다면 stack과 order를 비교해봐야한다.
                //만약 stack이 비어있지 않고 stack의 값과 같다면
                stack.pop();
                order++;
                i--; //현재 arr 값은 다시 비교 대상이 되야한다.
            } else { //arr에도 없고 stack에도 없으면 현재 arr의 값을 stack에 넣어줘야한다.
                stack.push(arr[i]);
            }
        }

        //arr의 순회가 끝났으면 남은 stack 순회도 해야한다.
        //order와 비교하는데 여기서 값 비교가 다르면 return "Sad"
        //만약 같으면 stack.pop하고 order + 1 해주면된다.
        for(int i=0;i<stack.size();i++){
            if(stack.peek() == order){
                stack.pop();
                order++;
            }else{
                return "Sad";
            }
        }
        return "Nice";
    }
}
