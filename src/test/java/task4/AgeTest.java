package task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeTest {

    @Test
    void shouldSayThat18IsInRange() {
        boolean isAdult = Age.isAdult(18);
        Assertions.assertTrue(isAdult);

    }
}