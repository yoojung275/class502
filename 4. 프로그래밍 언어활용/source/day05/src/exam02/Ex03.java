package exam02;

public class Ex03 {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c instanceof C);
        System.out.println(c instanceof B);
        System.out.println(c instanceof A);
        A a = new A();
        System.out.println(a instanceof C);
    }
}
