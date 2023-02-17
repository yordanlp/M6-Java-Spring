package com.hasrbourspace.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CalculatorController {


    public final ICalculatorService calculatorService;

    @Autowired
    public CalculatorController(ICalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    /**
     * Sums all the numbers passed as parameter. In case no number is passed it will produce a Http 400 error
     * @param numbers
     * @return The sum of the numbers in the list
     */
    @PostMapping("/api/sum")
    public Integer Sum( @RequestBody List<Integer> numbers ){
        return calculatorService.sum(numbers);
    }

    /**
     * Multiply all the numbers passed as parameter. In case no number is passed it will produce a Http 400 error
     * @param numbers
     * @return The multiplication of the numbers in the list
     */
    @PostMapping("/api/multiply")
    public Integer Multiply( @RequestBody List<Integer> numbers ){
        return calculatorService.multiply(numbers);
    }

}
