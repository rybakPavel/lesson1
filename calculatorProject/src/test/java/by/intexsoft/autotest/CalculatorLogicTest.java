package by.intexsoft.autotest;

import org.junit.Assert;

import static org.junit.Assert.*;


public class CalculatorLogicTest {
    private CalculatorLogic calc;

    @org.junit.Before
    public void setUp() throws Exception {
        calc = new CalculatorLogic();
    }
    @org.junit.Test
    public void testSum() {
        int sum = calc.add(3, 4);
        Assert.assertEquals(7, sum);
    }
    @org.junit.Test
    public void testDivide() {
        int div = calc.div(10, 5);
        Assert.assertEquals(2, div);
    }
    @org.junit.Test
    public void testMultiply() {
        int mult = calc.mult(4, 4);
        Assert.assertEquals(8, mult);
    }
    @org.junit.Test
    public void testSubstract() {
        int sub = calc.sub(12, 2);
        Assert.assertEquals(8, sub);
    }
}