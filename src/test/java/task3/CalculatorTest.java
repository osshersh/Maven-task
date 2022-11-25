package task3;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void sum() {
        Assertions.assertEquals(Calculator.sum(4,4),8);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Assertions.assertEquals(Calculator.subtract(4,4),0);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Assertions.assertEquals(Calculator.multiply(4,4),16);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Assertions.assertEquals(Calculator.divide(4,4),1);
    }
}