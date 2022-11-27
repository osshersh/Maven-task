package task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeTest {

    @Test
    void shouldSayThat18IsInRange() {
        boolean isAdult = Age.isAdult((short) 18);
        Assertions.assertTrue(isAdult);
    }

    @Test
    void shouldSayThatMoreThan18(){
        boolean isMore18 = Age.isAdult((short) 19);
        Assertions.assertTrue(isMore18);
    }

    @Test
    void shouldSayThatLessThan18(){
        boolean isLess18 = Age.isAdult((short) 17);
        Assertions.assertFalse(isLess18);
    }
}