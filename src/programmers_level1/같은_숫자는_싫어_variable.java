package programmers_level1;

import java.util.ArrayList;

public class 같은_숫자는_싫어_variable {

    static int[] arr = {1,1,3,3,0,1,1};
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        int num = 10;
        for(int i : arr){
            if(num != i){
                list.add(i);
                num = i;
            }
        }

        list.forEach(System.out::print);
    }
}
