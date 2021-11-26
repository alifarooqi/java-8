package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeImplementation {
    public static void main(String... a){
        // Now
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ld);
        System.out.println(lt);
        System.out.println(ldt);

        System.out.println("\nof()\n");
        System.out.println(LocalDate.of(2021, 11, 10));
        System.out.println(LocalTime.of(3, 55));
        System.out.println(LocalDateTime.of(2021, 11, 10, 3, 55));
        System.out.println(LocalDateTime.of(ld, lt));

        System.out.println(LocalDate.of(2021, 14, 10));

        System.out.println(ld.plusDays(15L).plusMonths(3).plusYears(2));
        System.out.println(lt.plusHours(1).plusMinutes(15).plusSeconds(40).plusNanos(456));
        System.out.println(
                ldt.plusDays(15L).plusMonths(3).plusYears(2).plusHours(1).plusMinutes(15).plusSeconds(40).plusNanos(456)
        );

        System.out.println(ld.minusDays(15L).minusMonths(3).minusYears(2));
        System.out.println(lt.minusHours(1).minusMinutes(15).minusSeconds(40).minusNanos(456));
        System.out.println(
                ldt.plusDays(15L).minusMonths(3).minusYears(2).minusHours(1).minusMinutes(15).minusSeconds(40).minusNanos(456)
        );

        System.out.println(LocalDate.of(2021, Month.NOVEMBER, 10));

        Period p = Period.ofDays(5); // Period.of(0, 0, 5)

        System.out.println(ld.plus(p));

        Period p2 = Period.of(5, 4,3);
        System.out.println(ld.plus(p2));

        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(ld.format(dtf));


        System.out.println(ld.format(DateTimeFormatter.ISO_DATE));

        System.out.println(ldt.format(DateTimeFormatter.ofPattern("MMM dd yyyy (HH:mm:ss)")));
//        System.out.println(ldt.format(DateTimeFormatter.ofPattern("MMM ddd yyyy (HH:mm:ss)"))); // Illegal Argument Error


        System.out.println(DateTimeFormatter.ofPattern("MMM dd yyyy (HH:mm:ss)").format(ldt));



    }
}
