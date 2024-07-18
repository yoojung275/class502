package 같은패키지;

import 다른패키지.B;

public class Ex01 {
    public static void main(String[] args) {
        A a = new A();
        a.defaultNum = 1; // 동일 패키지(=같은패키지)에서만 접근 가능하니까
        a.publicNum = 2;
        a.protectedNum = 3; // 동일 패키지(=같은패키지)에서만 접근 가능하니까
        B b = new B();

    }
}
