package ch4_array1D;

import java.util.Scanner;

/** 개수 세기
 * 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
 */
public class No_10807 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //1. 입력 받을 총 정수의 개수 -> 배열의 크기
        int size = Integer.parseInt(sc.nextLine());

        //2. 입력 받은 정수들을 띄워쓰기로 spilt를 해서 배열에 집어넣고
        String[] arr = sc.nextLine().split(" ");

        //3. 찾고자 하는 정수와 같은 게 있는지 count를 이용해서 구한다.
        String v = sc.next();
        int count = 0;
        for(int i=0;i<size;i++){
            if(arr[i].equals(v)) count++;
        }
        System.out.println(count);

    }
}
/*
 * scanner을 이용할 때
 * nextInt()와 next()는 입력값을 공백으로 구분하고
 *                      공백과 개행문자(엔터)를 버퍼에서 가져오지 않는다.
 * 그래서 바로 뒤에 scanner을 한번 더 사용하면 버퍼에 남아있던 개행문자(엔터)거 해당 scanner에 들어가게 된다.
 *
 * nextLine()은 엔터 입력지점까지의 공백을 포함한 모든 입력값을 버퍼에서 가져온다.
 *
 * 따라서 next()나 nextInt() 뒤에 nextLine()을 사용할 때 주의가 필요하다.
 */