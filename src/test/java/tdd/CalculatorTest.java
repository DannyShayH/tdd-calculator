package tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator instance = new Calculator();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Add Method")
    void CalculatorAddTest1(){
        int actual = instance.Add(10,10);
        int expected = 20;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Subtract Method")
    void CalculatorSubtractTest2() {
        int actual = instance.Subtract(10, 5);
        int expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Multiply Method")
    void CalculatorMultiplyTest2() {
        int actual = instance.Multiply(10, 5);
        int expected = 50;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Divide Method")
    void CalculatorDivideTest2() {
        int actual = instance.Divide(10, 5);
        int expected = 2;
        assertEquals(expected, actual);
    }
}