package exam01;

public class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("두 날개로 날아간다");
    }

    public void hatching() {
        System.out.println("알을 품어서 새끼를 부화시킨다");
    }
}
