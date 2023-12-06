package HW7.data;

public class Divide implements Operator {
    @Override
    public double calculate(double a, double b) {
        if (b == 0){
            throw new IllegalStateException("на ноль делить нельзя");
        }
        return a / b;
    }

    @Override
    public String getName() {
        return "Операция деления";
    }

}
