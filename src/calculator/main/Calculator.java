
public class Calculator {

    public double add(double x, double y) {
            return x+y;
    }

    public double Multiply(double x, double y) {
        return x*y;
    }

    public double sub(double x, double y) {
        return x-y;
    }
    public double div(double x, double y) {
        Double result=null;
        result= x / y;
        if (result == Double.POSITIVE_INFINITY ||
                result == Double.NEGATIVE_INFINITY)

            throw new ArithmeticException();


        return result;
    }
}
