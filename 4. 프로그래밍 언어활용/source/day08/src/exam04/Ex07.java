package exam04;

import java.util.Objects;

public class Ex07 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.equals(s2)); // Object equals(..)
        System.out.println(Objects.equals(s1, s2)); // Objects static equals(...)
    }
}
