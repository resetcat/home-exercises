package io.codelex.dateandtime;

import java.time.LocalDate;

public class WorkTime {
    private LocalDate start = LocalDate.now();
    private LocalDate end = LocalDate.now().plusDays(55);

    public void calcHours(LocalDate start, LocalDate end) {
        int days = 0;
        LocalDate realStart = start;
        while (!start.equals(end)) {
            if (!start.getDayOfWeek().name().equals("SATURDAY") &&
                    !start.getDayOfWeek().name().equals("SUNDAY")) {
                days++;
            }
            start = start.plusDays(1);
        }
        System.out.println("From " + realStart + " to " + end + " you have worked " + (days * 8) + " hours!");
    }


}
