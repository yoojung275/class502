package exam01;

public class Ex10 {
    public static void main(String[] args) {
        int num1 = 10000000;
        // byte num2 = num1;
        byte num2 = (byte)num1;
        // 명시적 형변환 : 자료가 유실되더라도 변환하겠다고 명시
        System.out.println(num2);

        int num3 = 100;
        byte num4 = (byte)num3;
        System.out.println(num4);
    }
}
