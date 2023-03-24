package homeworkThirteen;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class MyDate {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private  LocalDate date;

    public void getDayOfWeek(String value) {
        date = LocalDate.parse(value, formatter);
        System.out.println("Day of the week is "
                + date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru")));
    }

    public void getNextTuesday(String value) {
        date = LocalDate.parse(value, formatter);
        while (true) {
            if ((date = date.plusDays(1)).getDayOfWeek() == DayOfWeek.MONDAY){
                System.out.println("Date of the next Tuesday is: " + date.plusDays(1).format(formatter));
                return;
            }
        }
    }
}
