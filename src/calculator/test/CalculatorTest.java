import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testNewCalculator() {
        Calculator calculator= new Calculator();
        Assertions.assertNotNull(calculator);
    }

    @Test
    public void testNewEquation(){
        Equation equation = new Equation();
        Assertions.assertNotNull(equation);
    }

    @Test
    public void testNewMatrix(){
        Matrix matrix = new Matrix();
        Assertions.assertNotNull(matrix);
    }

}

