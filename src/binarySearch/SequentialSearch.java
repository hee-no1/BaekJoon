package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SequentialSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = {3, 5, 1, 6, 7, 2, 8, 4, 9}; //1 이상의 자연수 배열
        int result = sequentialSearch(arr, num);
        if(result > 0){
            System.out.println("find, num: " + result);
        }else{
            System.out.println("not find");
        }
    }

    static int sequentialSearch(int[] arr, int num){
        for(int i : arr){
            if(i == num){
               return num;
            }
        }
        return -1;
    }
}
