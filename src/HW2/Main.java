package HW2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Тест 1");
        Human human2 = new Human("Тест 2");
        Human human3 = new Human("Тест 3");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.update();
    }
}
