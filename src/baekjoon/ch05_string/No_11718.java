package baekjoon.ch05_string;

import java.io.IOException;
import java.util.Scanner;

/** No_11718 그대로 출력하기
 * 입력 받은 대로 출력하는 프로그램을 작성하시오.

 * 입력
 * 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.

 * 출력
 * 입력받은 그대로 출력한다.
 */

public class No_11718 {
    public static void main(String[] args) throws IOException{
        //무한 반복으로 입력문이 생겨서는 안되고 각 줄 입력하고 출력하고 더이상 입력없으면 끝, 몇 줄 입력이 될지 모른다.
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){  //hasNext()와 hasNextLine()의 차이는 next()와 nextLine()의 차이와 같다.
            System.out.println(sc.nextLine());
        }

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = "";
//        while((str=br.readLine())!=null){
//            System.out.println(str);
//        }

    }
}
