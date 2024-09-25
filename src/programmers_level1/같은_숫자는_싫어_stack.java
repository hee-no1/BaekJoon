package programmers_level1;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.Stack;

public class 같은_숫자는_싫어_stack {
    static int[] arr = {1,1,3,3,0,1,1};
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        for(int i : arr){
           if(stack.empty() || stack.peek() != i){
               stack.push(i);
           }
        }
        stack.forEach(System.out::println);

//        int[] array = stack.stream().mapToInt(Integer::intValue).toArray();
//
//        Arrays.stream(array).forEach(System.out::println);
    }
}
