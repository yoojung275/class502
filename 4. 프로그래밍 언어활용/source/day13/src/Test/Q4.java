package Test;

import java.sql.SQLOutput;

public class Q4 {
    public static void main(String[] args) {
        MyDog dog = new MyDog("멍멍이", "진돗개");
        //System.out.println(dog);
        System.out.printf("%s %s", dog.name, dog.type);
    }
}
