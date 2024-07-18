package exam04;

public interface Seller {
    void sell(); // public abstract가 있는데 생략된 것
    default void order() {
        System.out.println("Seller에서 주문");
    }

    public static void staticMethod() {
        System.out.println("w");
    }
}
