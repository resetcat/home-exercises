package io.codelex.dateandtime;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServerUpdateTime {
    private static final LocalDate launchDate = LocalDate.of(2021, Month.SEPTEMBER, 5);

    public static String updateDaysInMonth(int year, Month month) {
        LocalDate date = LocalDate.of(year, month, month.maxLength());
        LocalDate updates = launchDate;
        if (date.isBefore(launchDate)) {
            return "You must enter date which is after server launch!";
        }
        List<LocalDate> updateDates = new ArrayList<>();
        while (updates.isBefore(date)) {
            updates = updates.plusDays(14);
            updateDates.add(updates);
        }
        List<LocalDate> updateMonth = new ArrayList<>();
        for (LocalDate dates : updateDates) {
            if (dates.getYear() == year && dates.getMonth().equals(month)) {
                updateMonth.add(dates);
            }
        }
        return "In " + month.toString().toLowerCase() + " you have to update at: " + updateMonth;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year:");
        int year = scan.nextInt();
        System.out.print("Enter month:");
        scan.nextLine();
        Month month = Month.valueOf((scan.nextLine().toUpperCase()));


        System.out.println(updateDaysInMonth(year, month));
    }


}
