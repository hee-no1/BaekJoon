package programmers_level1;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
    static int[] nums = {3,3,3,2,2,2};
    static int max;

    public static void main(String[] args){
        /* nums 배열 길이/2를 선택해야함
           nums 배열에서 N/2의 갯수만큼 선택하는 것 -> 조합
           고른 폰켓몬의 종류는 set에 넣어서 max 길이 구하면됨
           => 그러나 이 방법은 복잡하고 비효율적
         */

        /* nums를 set에 넣어
           set의 길이가 N/2보다 크거나 같으면 최대길이가 무조건 N/2이고,
           set의 길이가 N/2보다 작으면 그냥 그게 최대 길이
         */

        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }

        max = Math.min(nums.length/2, set.size());
        System.out.println("max = "+ max);

    }
}
