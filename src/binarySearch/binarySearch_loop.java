package binarySearch;

import java.io.*;
import java.util.Arrays;

/**이진탐색을 반복문을 이용해서 구현
 */
public class binarySearch_loop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = {6, 3, 2, 10, -10, 1, 9, -3};
        int left = 0;
        int right = arr.length-1;
        int mid; //중간값 구하는 방법(두개의 수로 평균 낸다고 생각)

        Arrays.sort(arr);
        while(true){
            if(left > right){
                System.out.println("not found"); break;
            }
            mid = (left + right)/2;
            if(arr[mid] > num) { //왼쪽을 비교해야한다.
                right = mid - 1;
            }else if(arr[mid] < num){
                left = mid + 1;
            }else{
                System.out.println("found, index = "+mid);
                break;
            }
        }
    }
}
