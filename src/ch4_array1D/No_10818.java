package ch4_array1D;

import java.util.Scanner;
/** 최대, 최소
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

 * 출력
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */


public class No_10818 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //1. N: 배열의 크기 -> 배열을 쓰지 않아도 된다.
        int N = sc.nextInt();

        //2. 최소값, 최대값 지정
        int min = 1000001;
        int max = -1000001;

        //3. 배열 생성, 입력받은 걸 배열에 대입, for문 이용
        for(int i=0;i<N;i++){
            int A = sc.nextInt();
            //4. 배열의 각 인덱스를 비교해서 max보다 크면 max로, min보다 작으면 min으로 값을 대입해준다.
            if(max < A) max = A;
            if(min > A) min = A;
        }

        System.out.println(min + " " + max);

    }

}

/*
    Arrays.sort를 이용해서 문제를 풀 수도 있다.
 */
