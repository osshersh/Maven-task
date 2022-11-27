package task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {

    @Test
    void shouldReturn8WhenAdd4and4() {
       int value = Calculator.sum(4,4);
       Assertions.assertEquals(8,value);
    }

    @Test
    void shouldReturn0When4Subtract4() {
        int value = Calculator.subtract(4,4);
        Assertions.assertEquals(0,value);
    }

    @Test
    void shouldReturn16When4Multiply4() {
        int value = Calculator.multiply(4,4);
        Assertions.assertEquals(16,value);
    }

    @Test
    void shouldReturn1When4Divide4() {
        Assertions.assertEquals(Calculator.divide(4,4),1);
    }
}