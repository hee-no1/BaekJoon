package baekjoon.ch10_geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/** No_5073 삼각형과 세변
 * 삼각형의 세 변의 길이가 주어질 때 변의 길이에 따라 다음과 같이 정의한다.
 * Equilateral :  세 변의 길이가 모두 같은 경우
 * Isosceles : 두 변의 길이만 같은 경우
 * Scalene : 세 변의 길이가 모두 다른 경우
 * 단 주어진 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우에는 "Invalid" 를 출력한다. 예를 들어 6, 3, 2가 이 경우에 해당한다. 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.
 * 세 변의 길이가 주어질 때 위 정의에 따른 결과를 출력하시오.

 * 입력
 * 각 줄에는 1,000을 넘지 않는 양의 정수 3개가 입력된다. 마지막 줄은 0 0 0이며 이 줄은 계산하지 않는다.

 * 출력
 * 각 입력에 맞는 결과 (Equilateral, Isosceles, Scalene, Invalid) 를 출력하시오.
 */
public class No_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            int[] arr = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
            int max = Integer.MIN_VALUE;
            int index = 0;
            int sum = 0; //두변의 길이의 합
            String result;

            if(arr[0] == 0 && arr[1]==0 && arr[2]==0) {break;}

            //1. 세변의 길이가 같을 때
            if(arr[0] == arr[1] && arr[1] == arr[2]) {
                result = "Equilateral";
            }else{
                //2. max 값 구하고 나머지 두변의 길이의 합이 max보다 큰지를 확인한다.
                //max값과 해당 index 구하기
                for(int i=0;i<arr.length;i++){
                    if(max < arr[i]) {
                        max = arr[i];
                        index = i;
                    }
                }
                //max를 제외한 두변의 길이의 합을 구한다.
                for(int i=0;i<arr.length;i++){
                    if(i!=index) {sum+=arr[i];}
                }

                if(max < sum){
                    if(arr[0]==arr[1] || arr[1]==arr[2] || arr[2]==arr[0]){
                        result = "Isosceles";
                    }else{
                        result = "Scalene";
                    }
                }else{
                    result = "Invalid";
                }
            }
            System.out.println(result);
        }
    }
}
