package ch5_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/** No_5622 다이얼
 * 전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
 * 숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
 * 상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
 * 할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.
 *
 * 출력
 * 첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.
 */
public class No_5622 {
    public static void main(String[] args) throws IOException {
        //이 문제에서 고민은 알파벳에 해당하는 시간을 어떻게 나타낼 것인가.
        //처음엔 map에 하드코딩으로 각 알파벳에 따른 번호를 저장하고 map에서 키에 해당하는 값을 꺼내서 시간을 구하는 방식으로 풀었다.
        //그런데 이 문제의 경우 총 시간을 묻는 것이기 때문에 map에 A=2, W=9를 자료구조에 저장할 필요는 없다.
        //switch문이나 if문을 통해 총 시간을 해당하는 알파벳에 맞게 더해주면 된다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int time = 0;
        for(int i=0;i<str.length();i++){
            switch (str.charAt(i)){
                case 'A': case 'B': case 'C': time+=3; break;
                case 'D': case 'E': case 'F': time+=4; break;
                case 'G': case 'H': case 'I': time+=5; break;
                case 'J': case 'K': case 'L': time+=6; break;
                case 'M': case 'N': case 'O': time+=7; break;
                case 'P': case 'Q': case 'R': case 'S':time+=8; break;
                case 'T': case 'U': case 'V': time+=9; break;
                case 'W': case 'X': case 'Y': case 'Z':time+=10; break;
            }
        }
        System.out.println(time);

    }
}
