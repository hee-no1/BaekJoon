package programmers_level1;

public class 가운데_글자_가져오기 {
//    static String s = "abcde";
    static String s = "qwer";

    public static void main(String[] args){
        int l = s.length();
//        System.out.println(l % 2 == 0 ? s.substring(l / 2 - 1, l / 2 + 1) : s.substring(l / 2, l / 2 + 1));
        System.out.println(s.substring((l-1)/2, l/2+1));
    }
}
