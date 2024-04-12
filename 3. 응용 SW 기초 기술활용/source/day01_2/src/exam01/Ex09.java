package exam01;

public class Ex09 {
    public static void main(String[] args) {
        long num1 =100000000000000L; //8바이트
        double num2 = num1; // 정수 -> 실수 : 자동 형변환(묵시적 형변환)
        // 같은 8바이트지만 실수가 정수보다 더 많은 값 포함
        float num3 = num1;
        // 모든 실수는 정수보다 표현범위가 넓으므로 4바이트는 float가 8바이트인 long 포함 가능

        double num4 = 0.0;
        for (int i = 0; i < 1000; i++) {
            num4 +=0.1;
        }

        System.out.println(num4);
    }
}
