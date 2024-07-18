package exam01;

public class Ex04 {
    public static void main(String[] args) {
        Transportation trans = Transportation.TAXI;
        String str = trans.name(); //trans.toString() 동일
        System.out.println(str);

        int ordinal = trans.ordinal(); // 상수의 위치번호 (주로 내부적으로 사용)
        System.out.println(ordinal);


    }

}
