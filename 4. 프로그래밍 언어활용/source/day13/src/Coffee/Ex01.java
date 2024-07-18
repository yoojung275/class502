package Coffee;

public class Ex01 {
    public static void main(String[] args) {
        StarBucks starBucks = new StarBucks();
        CoffeeBean coffeeBean = new CoffeeBean();

        Person kim = new Person("김씨", 10000);
        Person lee = new Person("이씨", 10000);

        kim.setMenu("아메리카노");
        lee.setMenu("라떼");

        kim.setMoney(4000);
        lee.setMoney(4500);

        System.out.printf("%s는 %s에서 %d원인 %s를 샀다", "김씨", "StarBucks",4000,"아메리카노");
    }
}
