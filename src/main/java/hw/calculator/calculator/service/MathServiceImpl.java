package hw.calculator.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class MathServiceImpl implements MathService {

    public String calculateSum(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1+num2);
    }
    public String calculateDif(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1-num2);
    }
    public String calculateMulti(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1*num2);
    }
    public String calculateDiv(int num1, int num2) {
        if (num2 == 0) {
            return "На ноль нельзя делить.";
        }
        return num1 + " / " + num2 + " = " + (num1/num2);
    }
}
