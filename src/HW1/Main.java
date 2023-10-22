package HW1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HotDrinkTemp hotDrink1 = new HotDrinkTemp("Americano", 25, 200, 90);
        HotDrinkTemp hotDrink2 = new HotDrinkTemp("GreenTea", 25, 200, 60);
        HotDrinkTemp hotDrink3 = new HotDrinkTemp("BlackTea", 35, 100, 80);
        HotDrinkTemp hotDrink4 = new HotDrinkTemp("Latte", 135, 150, 70);
        HotDrinkTemp hotDrink5 = new HotDrinkTemp("Cocoa", 50, 150, 80);

        HotDrinksMachine hotDrinksMachine = new HotDrinksMachine(new ArrayList<>());
        hotDrinksMachine.addHotDrinkTemp(hotDrink1);
        hotDrinksMachine.addHotDrinkTemp(hotDrink2);
        hotDrinksMachine.addHotDrinkTemp(hotDrink3);
        hotDrinksMachine.addHotDrinkTemp(hotDrink4);
        hotDrinksMachine.addHotDrinkTemp(hotDrink5);
        System.out.println(hotDrinksMachine.getProduct("Cocoa"));
        System.out.println(hotDrinksMachine.getProduct("BlackTea"));
        System.out.println(hotDrinksMachine.getProduct("Americano"));
    }

}
