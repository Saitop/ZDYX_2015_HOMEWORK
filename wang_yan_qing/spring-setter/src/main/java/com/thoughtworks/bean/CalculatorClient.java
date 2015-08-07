package com.thoughtworks.bean;

import com.thoughtworks.bean.operation.AddCalculator;
import com.thoughtworks.bean.operation.ICalculator;
import com.thoughtworks.bean.operation.PlusCalculator;
import org.springframework.stereotype.Component;

@Component
public class CalculatorClient {
    private AddCalculator addCalculator;
    private PlusCalculator plusCalculator;

    public CalculatorClient() {
    }

    public String add(String a, String b) {
        return addCalculator.add(a, b);
    }

    public String plus(String a, String b) {
        return plusCalculator.add(a, b);
    }

    public void setAddCalculator(AddCalculator addCalculator) {
        this.addCalculator = addCalculator;
    }

    public void setPlusCalculator(PlusCalculator plusCalculator) {
        this.plusCalculator = plusCalculator;
    }

    public void init() {
        System.out.println("calculatorClient bean init");
    }

    public void destroy() {
        System.out.println("calculatorClient bean destroy");
    }
}
