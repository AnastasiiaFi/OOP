package HW7.data;

public class Substract implements Operator {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }

    @Override
    public String getName() {
        return "Операция вычитания";
    }
}

