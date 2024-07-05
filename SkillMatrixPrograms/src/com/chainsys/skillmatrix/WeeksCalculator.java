package com.chainsys.skillmatrix;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class WeeksCalculator {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 1, 1);
        LocalDate date2 = LocalDate.of(2023, 3, 15);
        long weeksBetween = calculateWeeks(date1, date2);
        System.out.println("Number of weeks between " + date1 + " and "+ date2 + ":" + weeksBetween);
    }

    public static long calculateWeeks(LocalDate date1, LocalDate date2) {
        if (date1.isAfter(date2)) {
            LocalDate temp = date1;
            date1 = date2;
            date2 = temp;
        }
        long days = 0;
        LocalDate current = date1;
        while (current.isBefore(date2)) {
            current = current.plusDays(1);
            days++;
        }

        long weeksBetween = days / 7;
        return weeksBetween;
    }
}





