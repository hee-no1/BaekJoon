package programmers_level1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _2016년_LocalDate {
    static int a = 5;
    static int b = 24;

    public static void main(String[] args){
        System.out.println(LocalDate.of(2016, a, b).getDayOfWeek());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.of(2024,9,24));
        System.out.println(LocalTime.of(12, 1, 53));
        System.out.println(LocalDateTime.of(2024, 9, 24, 12, 1));

    }
}
