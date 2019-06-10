import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(4, calculator.add(3, 1), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(2, calculator.subtract(3,1), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(6, calculator.multiply(3,2), 0.01);
    }

    @Test
    public void canDivide(){
        assertEquals(1.5, calculator.divide(3,2), 0.01);
    }
}
