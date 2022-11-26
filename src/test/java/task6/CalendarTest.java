package task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {

    @Test
    void shouldSayWhenNumberOfDayIsNotWeekend() {
        String monday = Calendar.showNameDayOfWeek(1);
        String tuesday = Calendar.showNameDayOfWeek(2);
        String wednesday = Calendar.showNameDayOfWeek(3);
        String thursday = Calendar.showNameDayOfWeek(4);
        String friday = Calendar.showNameDayOfWeek(5);

        Assertions.assertEquals("Monday", monday);
        Assertions.assertEquals("Tuesday",tuesday);
        Assertions.assertEquals("Wednesday",wednesday);
        Assertions.assertEquals("Thursday",thursday);
        Assertions.assertEquals("Friday",friday);
    }

    @Test
    void shouldSayWhenNumberOfDayIsWeekend() {
        String saturday = Calendar.showNameDayOfWeek(6);
        String sunday = Calendar.showNameDayOfWeek(7);

        Assertions.assertEquals("Weekend",saturday);
        Assertions.assertEquals("Weekend",sunday);
    }
}