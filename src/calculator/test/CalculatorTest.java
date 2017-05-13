import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public final void newCalculator() {
        Calculator calculator= new Calculator();
        Assertions.assertNotNull(calculator);
    }
}

