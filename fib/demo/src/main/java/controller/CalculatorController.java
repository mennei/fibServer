package controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/fib/calc")
    @CrossOrigin
    public int getResult(@RequestParam(value="n") int n){
        return fib(n);
    }

    // Calculate fibonacci number with loop
    private int fib(int n)
    {
        int n1 = 0, n2 = 1, n3 = 1;
        if (n == 0){
            return n1;
        }
        if (n == 1){
            return n2;
        }
        for(int i = 2; i < n; i++) {
            n3 = n1 + n2;
            if (n3 < Integer.MAX_VALUE) {
                n1 = n2;
                n2 = n3;
            }
            else {
                return  Integer.MAX_VALUE;
            }
        }
        return n3;
    }
}
