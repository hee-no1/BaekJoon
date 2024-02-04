package baekjoon.ch16_stack_queue_deque;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/** No_28278 스택 2
 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * 명령은 총 다섯 가지이다.
 * 1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
 * 2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
 * 3: 스택에 들어있는 정수의 개수를 출력한다.
 * 4: 스택이 비어있으면 1, 아니면 0을 출력한다.
 * 5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.

 * 입력
 * 첫째 줄에 명령의 수 N이 주어진다. (1 ≤ N ≤ 1,000,000)
 * 둘째 줄부터 N개 줄에 명령이 하나씩 주어진다.
 * 출력을 요구하는 명령은 하나 이상 주어진다.

 * 출력
 * 출력을 요구하는 명령이 주어질 때마다 명령의 결과를 한 줄에 하나씩 출력한다.
 */
public class No_28278 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            switch(num){
                case 1:{
                    stack.push(Integer.parseInt(st.nextToken())); break;
                } case 2:{
                    if (stack.empty()) { sb.append(-1).append("\n"); }
                    else { sb.append(stack.pop()).append("\n"); }
                    break;
                } case 3:{
                    sb.append(stack.size()).append("\n"); break;
                } case 4:{
                    if(stack.empty()){sb.append(1).append("\n");}
                    else {sb.append(0).append("\n");}
                    break;
                } case 5:{
                    if(stack.empty()){sb.append(-1).append("\n");}
                    else { sb.append(stack.peek()).append("\n");}
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
