package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**이진탐색을 재귀함수를 이용해서 구현
 */
public class binarySearch_recursive {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = {3, 5, 1, 6, 7, 2, 8, 4, 9}; //1 이상의 자연수 배열

        //arr를 오름차순으로 정렬한다.
        Arrays.sort(arr);

        //재귀함수를 통해 이진 탐색을 시작한다.
        //이진 탐색에 pointer역할을 해줄 변수 선언
        int left = 0;
        int right = arr.length - 1;
        int result = binarySearchRecursive(num, arr, left, right);
        if(result > 0){
            System.out.println("find, num: "+ result);
        }else{
            System.out.println("not find");
        }
    }

    static int binarySearchRecursive(int num, int[] arr, int left, int right){
        if(left > right) { return -1; }
        int mid = (left + right) / 2;
        if(arr[mid] < num){
            return binarySearchRecursive(num, arr, mid + 1, right);
        }else if(arr[mid] > num){
            return binarySearchRecursive(num, arr, left, mid - 1);
        }else{
            return arr[mid];
        }
    }
}
