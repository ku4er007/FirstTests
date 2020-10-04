import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    Calculator calculatorTest = new Calculator();

    @Test
    public void sum1() {
        int expectS = 10;
        assertEquals(10, calculatorTest.sum(2,8));
    }
    @Test
    public void sum2() {
        int expectS = 909;
        assertEquals(909, calculatorTest.sum(909,0));
    }

    @Test
    public void sum3() {
        int expectS = 900;
        assertEquals(900, calculatorTest.sum(909,-9));
    }

    @Test
    public void multiply1() {
        int expectM = 10;
        assertEquals(10, calculatorTest.multiply(2,5));

    }
    @Test
    public void multiply2() {
        int expectM = 0;
        assertEquals(0, calculatorTest.multiply(20,0));

    }
    @Test
    public void multiply3() {
        int expectM = -1064;
        assertEquals(-1064, calculatorTest.multiply(-2,532));
    }
}