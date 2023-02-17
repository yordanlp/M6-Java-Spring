package com.hasrbourspace.calculator;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ICalculatorService {

    public int sum(List<Integer> numbers);
    public int multiply( List<Integer> numbers);
}
