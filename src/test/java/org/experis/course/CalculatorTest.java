package org.experis.course;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Addition test")
    void addNumber() {
    float result = Calculator.addNumber(10,2);
    assertEquals(12.0f, result);
    }

    @Test
    @DisplayName("Subtract test")
    void subtractNumber() {
        float result = Calculator.subtractNumber(10,2);
        assertEquals(8.0f, result );
    }

    @Test
    @DisplayName("Division test")
    void divideNumber() {
        float result = Calculator.divideNumber(10,2);
        assertEquals(5.0f, result);
    }

    @Test
    @DisplayName("Multiply test")
    void multiplyNumber() {
        float result = Calculator.multiplyNumber(10,2);
        assertEquals(20.0f, result);
    }
}