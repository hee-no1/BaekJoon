    package greedy;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Arrays;
    import java.util.StringTokenizer;

    /**
     * No_1931 회의실 배정
     */
    public class No_1931 {
        public static void main(String[] args) throws IOException {
            /*  1. 회의 종료 시간 순으로 정렬
                1-1) 정렬 시 어떤 자료구조를 사용할 것인가?
                -> 객체 하나 생성, 해당 객체 배열을 통해 정려

                2. 종료시간 <= 시간 중에서 종료 시간이 가장 이른 것을 택함 <- 이 과정을 반복
            */

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            int T = Integer.parseInt(br.readLine());
            Meeting[] meetings = new Meeting[T];
    //        int max;
            int count = 0;

            // 입력값을 통해 객체를 만든 후, 객체 배열에 대입
            for(int i=0;i<T;i++){
                st = new StringTokenizer(br.readLine());
                int t1 = Integer.parseInt(st.nextToken());
                int t2 = Integer.parseInt(st.nextToken());
                meetings[i] = new Meeting(t1, t2);
            }

            //Comparator 이용해서 t2를 기준으로 정렬하기
//            Arrays.sort(meetings, (m1, m2) -> m1.t2 - m2.t2);
            Arrays.sort(meetings, (m1, m2) -> {
                if (m1.t2 == m2.t2) {
                    return m1.t1 - m2.t1;
                } else {
                    return m1.t2 - m2.t2;
                }
            });


            //meetings 배열을 순회하면서 i번째 종료시간 <= i+1번째 시작시간인 것 중 종료시간이 가장 작은 것을 선택
    //        int i = 0, j =i+1;
    //        while(j<meetings.length) {
    //            if (meetings[i].t2 <= meetings[j].t1) {
    //                max++;
    //                i = j++;
    //            } else {
    //                j++;
    //            }
    //        }
    //      이 방식은 meetings[0]가 무조건 포함한다는 전제가 있으므로 옳지 못하다.

            int end_time = 0;
            for(int i=0;i<meetings.length;i++){
                if(end_time<=meetings[i].t1){
                    count++;
                    end_time = meetings[i].t2;
                }
            }

            System.out.println(count);
        }

    }

    class Meeting{
        int t1;
        int t2;
        Meeting(int t1, int t2){
            this.t1 = t1;
            this.t2 = t2;
        }

        @Override
        public String toString() {
            return "Meeting{" +
                    "t1=" + t1 +
                    ", t2=" + t2 +
                    '}';
        }
    }
