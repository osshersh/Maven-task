package task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {

    @Test
    void shouldFridayWhenNumberIs5() {
        String day = Calendar.showNameDayOfWeek(5);
        Assertions.assertEquals("Friday",day);
    }
}