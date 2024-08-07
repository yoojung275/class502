package exam02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        Class clazz = Member.class;
        Constructor constructor = clazz.getDeclaredConstructors()[0];
        Object obj = constructor.newInstance();
        Field fields = clazz.getDeclaredField("str");

        Field field = clazz.getDeclaredField("str");
        field.setAccessible(true);

        field.set(obj, "DEF");
        System.out.println(field);
    }
}
