package HW1;


import java.util.List;

public class HotDrinksMachine implements HotVendingMachine {
    List<HotDrinkTemp> hotDrinkTemps;

    public HotDrinksMachine(List<HotDrinkTemp> productList) {
        this.hotDrinkTemps = productList;
    }

    @Override
    public HotDrinkTemp getProduct(String name) {
        for (HotDrinkTemp item : hotDrinkTemps) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public void addHotDrinkTemp(HotDrinkTemp hotDrink) {
        this.hotDrinkTemps.add(hotDrink);
    }
}