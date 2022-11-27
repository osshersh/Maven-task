package task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {

    @Test
    void shouldSayWhenNumberOfDayIsNotWeekend() {
        String monday = Calendar.getNameDayOfWeek(1);
        String tuesday = Calendar.getNameDayOfWeek(2);
        String wednesday = Calendar.getNameDayOfWeek(3);
        String thursday = Calendar.getNameDayOfWeek(4);
        String friday = Calendar.getNameDayOfWeek(5);

        Assertions.assertEquals("Monday", monday);
        Assertions.assertEquals("Tuesday",tuesday);
        Assertions.assertEquals("Wednesday",wednesday);
        Assertions.assertEquals("Thursday",thursday);
        Assertions.assertEquals("Friday",friday);
    }

    @Test
    void shouldSayWhenNumberOfDayIsWeekend() {
        String saturday = Calendar.getNameDayOfWeek(6);
        String sunday = Calendar.getNameDayOfWeek(7);

        Assertions.assertEquals("Weekend",saturday);
        Assertions.assertEquals("Weekend",sunday);
    }

    @Test
    void shouldSayWhenNumberIsNotWeek(){
        String outRange = Calendar.getNameDayOfWeek(8);
        Assertions.assertEquals("There is no such a day!",outRange);
    }
}