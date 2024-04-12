package exam01;

public class Ex07 {
    public static void main(String[] args) {
        long num1 = 1000000000000000000L; // int (4바이트)
        // 자바의 동작 방식 일단 int(제일 많이 쓰니까)로 시작하고 아니면 바꿔줌
        // 그래서 처음부터 long인걸 알려주기 위해 숫자에 L을 붙여줌

        byte num2 = 100; // int -> byte

        float num3 = 100.123F; // double(8바이트)
        // 자바의 동작 방식 일단 double(제일 많이 쓰니까)로 시작하고 아니면 바꿔줌
        // 그래서 처음부터 float인걸 알려주기 위해 숫자에 F을 붙여줌
    }
}
