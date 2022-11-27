package task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void shouldSayThatNumberIsEven() {
        boolean isEven = Numbers.isNumberEven(40);
        Assertions.assertTrue(isEven);
    }
    @Test
    void shouldSayThatNumberIsNotEven(){
        boolean isNotEven = Numbers.isNumberEven(41);
        Assertions.assertFalse(isNotEven);
    }
    @Test
    void shouldSayThatNumberIsOdd() {
        boolean isOdd = Numbers.isNumberOdd(45);
        Assertions.assertTrue(isOdd);
    }
    @Test
    void shouldSayThatNumberIsNotOdd(){
        boolean isNotOdd = Numbers.isNumberOdd(40);
        Assertions.assertFalse(isNotOdd);
    }
}