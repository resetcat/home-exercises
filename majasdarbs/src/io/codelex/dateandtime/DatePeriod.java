package io.codelex.dateandtime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class DatePeriod {
    private LocalDate start;
    private LocalDate end;

    private List<LocalDate> dateList;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
        this.dateList = getDateList(start, end);
    }

    private List<LocalDate> getDateList(LocalDate start, LocalDate end) {
        List<LocalDate> local = new ArrayList<>();
        long daysBetween = ChronoUnit.DAYS.between(start, end);
        for (int i = 0; i <= daysBetween; i++) {
            local.add(start);
            start = start.plusDays(1);
        }
        return local;
    }

    public void intersection(DatePeriod date) {
//        List<LocalDate> intersection = dateList.stream().distinct()
//                .filter(singleDate->date.dateList.contains(singleDate)).toList();
        List<LocalDate> intersection;
        if (date.start.isBefore(start)) {
            intersection = getIntersectionList(date.dateList, dateList);
        } else {
            intersection = getIntersectionList(dateList, date.dateList);
        }
        System.out.println("Overlap starts at: " + intersection.get(0) +
                " and ends at: " + intersection.get(intersection.size() - 1));
    }

    private List<LocalDate> getIntersectionList(List<LocalDate> dateList1, List<LocalDate> dateList2) {
        List<LocalDate> local = new ArrayList<>();
        for (LocalDate date : dateList1) {
            if (dateList2.contains(date)) {
                local.add(date);
            }
        }
        return local;
    }


}
