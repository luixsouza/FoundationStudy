package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataExercise {

    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2024-12-23");
        LocalDateTime d05 = LocalDateTime.parse("2024-12-23T01:30:42");
        Instant d06 = Instant.parse("2024-12-23T01:30:42Z");
        Instant d07 = Instant.parse("2024-12-23T01:30:42-03:00");
        LocalDate d08 = LocalDate.parse("23/12/2024", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("23/12/2024 00:00", fmt2);
        LocalDate d10 = LocalDate.now();
        LocalDateTime d11 = LocalDateTime.of(2025, 12, 23, 16, 25, 30);

        System.out.println("Data 01: " + d01);
        System.out.println("Data 02: " + d02);
        System.out.println("Data 03: " + d03);
        System.out.println("Data 04: " + d04);
        System.out.println("Data 05: " + d05);
        System.out.println("Data 06: " + d06);
        System.out.println("Data 07: " + d07);
        System.out.println("Data 08: " + d08);
        System.out.println("Data 09: " + d09);
        System.out.println("Data 10: " + d10);
        System.out.println("Data 11: " + d11);
        
    }

}
