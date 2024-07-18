package Coffee;

public interface CoffeeShop {
    CoffeeShop enter(Person person);
    CoffeeShop order();
    void exit();
    String getName();
}

