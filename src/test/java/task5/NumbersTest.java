package task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void shouldSayThatNumber40IsEven() {
        boolean isEven = Numbers.isNumberEven(40);
        Assertions.assertTrue(isEven);
    }

    @Test
    void shouldSayThatNumber45IsOdd() {
        boolean isOdd = Numbers.isNumberOdd(45);
        Assertions.assertTrue(isOdd);
    }
}