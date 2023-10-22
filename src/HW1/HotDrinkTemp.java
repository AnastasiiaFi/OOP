package HW1;

public class HotDrinkTemp extends HotDrink {
    private int temp;

    public HotDrinkTemp(String name, double price, int volume, int temp) {
        super(name, price, volume);
        this.temp = temp;
    }

    public int getTemperature() {
        return temp;
    }

    public void setTemperature(int temperature) {
        this.temp = temperature;
    }

    @Override
    public String toString() {
        return "Наименование: " + name + ", Цена: " + price + ", Объём: " + volume + ", Температура: " + temp;
    }
}