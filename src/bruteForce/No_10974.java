package bruteForce;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * No_10974 모든 순열
 */

public class No_10974 {
    static int N;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        visited = new boolean[N];

        Func(0);
        System.out.println(sb.toString());

    }

    //백트리킹 이용
    static void Func(int depth){

        if(depth == N){ //depth가 다 채워졌을 때
            //이제 arr값들을 append하면 된다.
            for(int i=0;i<N;i++){
                sb.append(arr[i]);
            }
            sb.append("\n");
            return;
        }
        //여기서 말하는 i는 숫자 1~N 그 자체를 말하는 것
        for(int i=0;i<N;i++){

            //숫자 i가 채워져있으면 다음 단계로..
            if(visited[i]){
                continue;
            }
            //숫자 i가 채워져있지 않는 경우
            arr[depth] = i+1; //해당 depth에 i+1 숫자 저장
            visited[i] = true; //숫자 i는 이미 사용했다는 것을 표시
            Func(depth+1);  //다음 depth로 로직 수행
            //하나의 Func 메서드 끝 == depth가 다 참 -> visited 현재 숫자 i부분 다시 false로 바꿔준 후, depth back해서 다시 판단
            visited[i] = false;
        }
    }
}
