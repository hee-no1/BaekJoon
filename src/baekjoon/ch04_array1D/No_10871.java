package baekjoon.ch04_array1D;

import java.util.Scanner;
/** X보다 작은 수
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 */
public class No_10871 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //1. N: 배열의 크기, 또는 반복문의 횟수, X는 비교 대상
        int N = sc.nextInt();
        int X = sc.nextInt();

        //2. 바로 X와 입력값을 비교해서 X보다 작으면 print()
        for(int i=0;i<N;i++){
            int A = sc.nextInt();
            if(A < X){
                System.out.print(A + " ");
            }
        }
    }
}