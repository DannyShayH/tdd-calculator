package tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator instance = new Calculator();
    int[] numbers = {1,2,3};

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Add Method")
    void CalculatorAddTest1(){
        int actual = instance.add(10,10);
        int expected = 20;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Subtract Method")
    void CalculatorSubtractTest2() {
        int actual = instance.subtract(10, 5);
        int expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Multiply Method")
    void CalculatorMultiplyTest3() {
        int actual = instance.multiply(10, 5);
        int expected = 50;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Divide Method")
    void CalculatorDivideTest4() {
        int actual = instance.divide(10, 5);
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Add Method 2")
    void CalculatorAddTest5(){
        int actual = instance.add(10,10,10);
        int expected = 30;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("String Calculator W/Splitter/Parsing")
    public void StringCalculatorCommaSeperated() {
        int actual = instance.add("1,2,3");
        int expected = 6;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Add Method W/Array")
    public void CalculatorAddTest6() {
        int actual = instance.add(numbers);
        int expected = 6;
        assertEquals(expected, actual);
    }
}