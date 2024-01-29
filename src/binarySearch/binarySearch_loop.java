package binarySearch;

import java.io.*;
import java.util.Arrays;

/**이진탐색을 반복문을 이용해서 구현
 */
public class binarySearch_loop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = {3, 5, 1, 6, 7, 2, 8, 4, 9}; //1 이상의 자연수 배열

        //arr를 오름차순으로 정렬한다.
        Arrays.sort(arr);

        //반복문을 통해 이진 탐색을 시작한다.
        int result = binarySearchLoop(arr, num);
        if(result > 0){
            System.out.println("find, num: "+ result);
        }else{
            System.out.println("not find");
        }
    }
    static int binarySearchLoop(int[] arr, int num){
        //이진 탐색에 pointer역할을 해줄 변수 선언
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while(left <= right){                   //left > right은 arr에서 num을 찾지 못했다는 뜻
            mid = (left + right) / 2;           //left와 right의 중간값 구하기
            if(arr[mid] < num){                 //오른쪽 부분 탐색
                left = mid + 1;                 //mid값이 num과 같지 않음을 확인했으므로, mid + 1부터 탐색
            }else if (arr[mid] > num) {         //왼쪽 부분 탐색
                right = mid - 1;
            }else {                             //arr[mid] == num
                return arr[mid];
            }
        }
        return -1;
    }
}
