package ch10_geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/** No_5073 삼각형과 세 변_ver2
 */
public class No_5073_ver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            int[] arr = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
            String result;

            if(arr[0]==0 && arr[1]==0 && arr[2]==0){break;}

            Arrays.sort(arr);
            //삼각형의 조건이 안 될때
            if(arr[2] >= arr[0] + arr[1]) {
                result = "Invalid";
            }else if(arr[0] == arr[1] && arr[1] == arr[2]) { //세변의 길이가 모두 같은 경우
                result = "Equilateral";
            }else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) { //두변의 길이가 같을때
                result = "Isosceles";
            }else {
                result = "Scalene";
            }
            System.out.println(result);
        }
    }
}
