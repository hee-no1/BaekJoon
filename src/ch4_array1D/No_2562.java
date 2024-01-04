package ch4_array1D;

import java.util.Scanner;

/** 최댓값
 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 * 예를 들어, 서로 다른 9개의 자연수
 * 3, 29, 38, 12, 57, 74, 40, 85, 61
 * 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

 * 입력
 * 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.

 * 출력
 * 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
 */
public class No_2562 {
    public static void main(String[] args){

        //1. 크기가 9인 배열 생성
        int[] arr = new int[9];

        //2. 최댓값을 임의로 index 0인 것으로 선언하고, maxIndex도 0으로 선언한다.
        int max = 0; //자연수니깐 = 0이 가능
        int index = 0;

        Scanner sc = new Scanner(System.in);
        //3. 9개의 자연수를 입력하고 그것을 배열에 대입힌다.
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(sc.nextLine());

            //4. max값고 배열의 index끼리의 비교를 통해 최댓값을 구한다.
            if(max < arr[i]) {
                max = arr[i];
                index = i + 1;
            }
        }

        System.out.print(max + "\n" + index); //이제 max와 index모두 문자열로 인식
    }

}
