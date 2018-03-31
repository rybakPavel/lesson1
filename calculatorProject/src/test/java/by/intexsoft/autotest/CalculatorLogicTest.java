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
    public void testSumm() {
        int sum = calc.sum(3, 4);
        Assert.assertEquals(6, sum);
    }
    @org.junit.Test
    public void testSumm2() {
        int sum = calc.sum(-1, 4);
        Assert.assertEquals(3, sum);
    }
}