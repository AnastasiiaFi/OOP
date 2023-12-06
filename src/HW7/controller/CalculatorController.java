package HW7.controller;

import HW7.service.CalculatorService;

public class CalculatorController {

/*
Ввод данных пользователя
Рассчет
Вывод в консоль
 */
    public void calculateFromController() {
        CalculatorService service = new CalculatorService();
        System.out.println(service.Calculates(1,2, '+'));
        System.out.println(service.Calculates(1,2, '-'));
        System.out.println(service.Calculates(4.7,10, '-'));
        System.out.println(service.Calculates(10,4, '-'));
        System.out.println(service.Calculates(1,-2.5, '/'));
        System.out.println(service.Calculates(-1,2, '*'));

    }
}
