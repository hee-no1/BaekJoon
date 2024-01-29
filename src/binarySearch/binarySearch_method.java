package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class binarySearch_method {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = {3, 5, 1, 6, 7, 2, 8, 4, 9}; //1 이상의 자연수 배열

        //arr를 오름차순으로 정렬한다.
        Arrays.sort(arr);

        //내장함수를 통해 이진 탐색을 시작한다.
        int result = Arrays.binarySearch(arr, num);
        if(result >= 0){
            System.out.println("find, index: " + result);
        }else{
            System.out.println("not find, result: "+ result);
        }
    }
}
