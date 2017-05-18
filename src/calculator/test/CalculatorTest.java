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

    @Test
    void testCalcMultiplyMinus10and2(){
        Calculator calculator= new Calculator();
        Assertions.assertEquals(-20, calculator.Multiply(-10,2));
    }

    @Test
    void testCalcMultiplyXandY(){
        Calculator calculator= new Calculator();
        Assertions.assertEquals(826.2606, calculator.Multiply(12.54,65.89));
        Assertions.assertEquals(-46, calculator.Multiply(-23,2));
        Assertions.assertEquals(380, calculator.Multiply(-76,-5));
    }

    @Test
    void testCalcSub3and2(){
        Calculator calculator= new Calculator();
        Assertions.assertEquals(1, calculator.sub(3,2));
    }

    @Test
    void testCalcSub10and5(){
        Calculator calculator= new Calculator();
        Assertions.assertEquals(5, calculator.sub(10,5));
    }

    @Test
    void testCalcSubXandY(){
        Calculator calculator= new Calculator();
        Assertions.assertEquals(27, calculator.sub(22,-5));
    }

    @Test
    void testCalcDiv6and2(){
        Calculator calculator= new Calculator();
        Assertions.assertEquals(3, calculator.div(6,2));
    }

    @Test
    void testCalcDivXandY(){
        Calculator calculator= new Calculator();
        Assertions.assertEquals(5, calculator.div(10,2));
    }

    @Test
    void testCalcDivXandZero(){
        Calculator calculator= new Calculator();
        try {
            calculator.div(10,0);
        }
        catch (ArithmeticException ex){
            Assertions.assertEquals( java.lang.ArithmeticException.class, ex.getClass());
            return;
        }
        Assertions.fail("Not zero");
    }
}

