package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * No_14501 퇴사
 */

public class No_14501 {

    static ArrayList<Consulting> list;
    static int N;
    static int max;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        String[] split;

        for(int i=0;i<N;i++){
            split = br.readLine().split(" ");
            list.add(new Consulting(Integer.parseInt(split[0]), Integer.parseInt(split[1])));
        }

        check(0, 0);
        System.out.println(max);

    }

    static void check(int term, int pay) {
        if(term == N){
            max = Math.max(max, pay);
            return;
        }

        if(term > N){
            return;
        }

        check(term + list.get(term).term, pay + list.get(term).pay);

        check(term+1, pay);

    }

}

class Consulting{
    int term; //걸리는 시간
    int pay; //금액

    Consulting(int term, int pay){
        this.term = term;
        this.pay = pay;
    }

}
