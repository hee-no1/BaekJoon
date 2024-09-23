package programmers_level1;

public class _2016년 {

    static int a = 5;
    static int b = 24;

    public static void main(String[] args){
        //입력되는 날짜를 '일'수로 바꿔서 요일계산
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] monthDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int date = 0;
        for(int i=0;i<a-1;i++){
            date+=monthDay[i];
        }
        date += b;
        System.out.println(date);
        System.out.println (date % 7 == 0 ? day[6] : day[date%7-1]);

//
//        switch (a){
//            case 12: date +=30;
//            case 11: date +=31;
//            case 10: date +=30;
//            case 9: date +=31;
//            case 8: date +=31;
//            case 7: date +=30;
//            case 6: date +=31;
//            case 5: date +=30;
//            case 4: date +=31;
//            case 3: date +=29;
//            case 2: date +=31;
//        }
//        date+=b;
//
//        if(date%7 == 0){
//            System.out.println(day[6]);
//        }else{
//            System.out.println(day[date%7-1]);
//        }

    }
}
