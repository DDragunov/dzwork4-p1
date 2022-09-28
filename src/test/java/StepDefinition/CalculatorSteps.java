package StepDefinition;

import io.cucumber.java.ru.*;
import org.junit.Assert;

public class CalculatorSteps extends Calculator {

    private Calculator calc;
    double a;
    double b;
    double result;

    @Дано("^две цифры (\\d) и (\\d)")
    public void given(double a, double b) {
        this.a = a;
        this.b = b;
        this.calc = new Calculator();
    }

    @Тогда("^ищем сумму двух цифр")
    public void when() {
        result = calc.sum(a, b);
    }

    @Когда("^результат должен быть (\\d)")
    public void then(double res) {
        Assert.assertEquals(res, result, 0.0001);
    }
}