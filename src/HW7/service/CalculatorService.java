package HW7.service;

import HW7.data.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CalculatorService {
//    Принимает пользовательский ввод
//    Определяет операцию
//    Выполняет операцию
//    Логирует операции

// все в одной функции

    public double Calculates (double a, double b, char symbol ){
        Operator operator;
        switch (symbol){
            case '+': {
                operator = new Add();
                break;
            }
            case '-': {
                operator = new Substract();
                break;
            }
            case '*': {
                operator = new Multiply();
                break;
            }
            case '/': {
                operator = new Divide();
                break;
            }
            default: {
                throw new IllegalStateException("Некорректрный ввод: " + symbol);
            }
        }
        System.out.println(LocalDateTime.now() + ": " + operator.getName()+ " между числами " + a + " и "+ b);
        return operator.calculate(a, b);
    }
}
