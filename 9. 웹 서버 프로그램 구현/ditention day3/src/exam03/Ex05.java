package exam03;

import java.sql.SQLOutput;

public class Ex05 {
    public static void main(String[] args) {
        A a = new C();

        System.out.println(a instanceof C);
        System.out.println(a instanceof B);
        System.out.println(a instanceof A);
    }
}
