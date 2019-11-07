package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/fib/calc")
    public int getResult(@RequestParam(value="n") int n){
        if (n > 10){
            throw new UnsupportedOperationException("Request number to big");
        }
        return fib(n);
    }

    // Calculate Fiboncci number with recursion
    private int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
}
