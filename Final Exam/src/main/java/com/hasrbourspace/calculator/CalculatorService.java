package com.hasrbourspace.calculator;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Primary
public class CalculatorService implements ICalculatorService {
    @Override
    public int sum(List<Integer> numbers) {
        if( numbers == null )
            return 0;
        return numbers.stream().reduce((a, b) -> a + b).get();
    }

    @Override
    public int multiply(List<Integer> numbers) {
        if( numbers == null )
            return 0;
        return numbers.stream().reduce((a, b) -> a * b).get();
    }
}
