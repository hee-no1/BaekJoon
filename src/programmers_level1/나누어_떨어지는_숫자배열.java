package programmers_level1;

import java.util.ArrayList;
import java.util.Comparator;

public class 나누어_떨어지는_숫자배열 {
//    static int[] arr = {5, 9, 7, 10};
    static int[] arr = {2, 36, 1, 3};
    static int divisor = 5;

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(i % divisor ==0){
                list.add(i);
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        list.sort((a,b)->a-b);
//        list.sort(Comparator.comparingInt(a -> a));

        list.forEach(System.out::println);
    }
}
