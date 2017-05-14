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

    @Test
    void testCalcAddXandY(){
        Calculator calculator= new Calculator();
        Assertions.assertEquals(5, calculator.add(2,3));
        Assertions.assertEquals(-3, calculator.add(0, -3));
        Assertions.assertEquals(0.402, calculator.add(0.002, 0.4));
        Assertions.assertEquals(156.226, calculator.add(122.568, 33.658));
    }

    @Test
    void testCalcMultiply2and2(){
        Calculator calculator= new Calculator();
        Assertions.assertEquals(4, calculator.Multiply(2,2));
    }

    @Test
    void testCalcMultiply2and3(){
        Calculator calculator= new Calculator();
        Assertions.assertEquals(6, calculator.Multiply(2,3));
    }

    @Test
    void testCalcMultiply0and3(){
        Calculator calculator= new Calculator();
        Assertions.assertEquals(0, calculator.Multiply(0,3));
    }

    @Test
    void testCalcMultiply3and0(){
        Calculator calculator= new Calculator();
        Assertions.assertEquals(0, calculator.Multiply(3,0));
    }

    @Test
    void testCalcMultiplyMinus2and10(){
        Calculator calculator= new Calculator();
        Assertions.assertEquals(-20, calculator.Multiply(-2,10));
    }
}

