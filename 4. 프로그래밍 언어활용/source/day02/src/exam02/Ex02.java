package exam02;

public class Ex02 {
    public static void main(String[] args) {
        A a = new A(); // 같은 패키지 내라서 임포트 안해도 됨
        a.numAA = 10;
        a.printNum();
        a.numB = 1010;

    }
}
