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

    @Test
    public void testNewIntegrator(){
        Integrator integrator = new Integrator();
        Assertions.assertNotNull(integrator);
    }

    @Test
    void testCalcAdd2and2(){
        Calculator calculator= new Calculator();
        Assertions.assertEquals(4, calculator.add(2,2));
    }


    @Test
    void testCalcAdd2and3(){
        Calculator calculator= new Calculator();
        Assertions.assertEquals(5, calculator.add(2,3));
    }

}

