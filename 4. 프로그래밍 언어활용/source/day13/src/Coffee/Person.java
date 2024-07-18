package Coffee;

public class Person {
    int money; //getter, setter
    String name; //getter(조회만)
    String menu; //getter, setter

    public Person(String name, int money) {
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
}
