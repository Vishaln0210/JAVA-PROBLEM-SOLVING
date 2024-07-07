import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String dayString = dayOfWeek.toString().toLowerCase();
        return Character.toUpperCase(dayString.charAt(0)) + dayString.substring(1);
    }
}
