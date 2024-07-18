package exam03;

public class Box <T>{
    private T item;

    //Box가 객체가 될 떄 T가 결정 // 지네릭 클레스의 T
    public void method1(T str1, T str2) {

    }
    // 지네릭 메서드 - 호출시의 T의 자료형이 결정된다 // 지네릭 메서드의 T
    // 지네릭 클레스의 T =/= 지네릭 메서드의 T
    public <T> void method2(T str1, T str2) {

    }
}
