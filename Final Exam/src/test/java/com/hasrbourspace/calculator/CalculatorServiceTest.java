package com.hasrbourspace.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CalculatorServiceTest {


    private CalculatorService calculatorService;

    @BeforeEach
    public void setup() {
        calculatorService = new CalculatorService();
    }

    @Test
    public void testSum() {
        // Arrange
        List<Integer> numbers = List.of(1, 2, 3);

        // Act
        int result = calculatorService.sum(numbers);

        // Assert
        Assertions.assertEquals(6, result);
    }

    @Test
    public void testMultiply() {
        // Arrange
        List<Integer> numbers = List.of(1, 2, 3);

        // Act
        int result = calculatorService.multiply(numbers);

        // Assert
        Assertions.assertEquals(6, result);
    }

    @Test
    public void testSumWithNullList() {

        // Act
        int result = calculatorService.sum(null);

        // Assert
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testMultiplyWithNullList() {

        // Act
        int result = calculatorService.multiply(null);

        // Assert
        Assertions.assertEquals(0, result);
    }

}