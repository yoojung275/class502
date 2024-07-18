package exam03;

import java.text.DecimalFormat;

public class Ex01 {
    public static void main(String[] args) {
        double num1 = 10000000000.123;
        DecimalFormat df = new DecimalFormat("0,000.00000000");
        String num1Str = df.format(num1);
        System.out.println(num1Str);

        DecimalFormat df2 = new DecimalFormat("###,###.#######"); // 비어있는게 있음 걍 무시
        String num1Str2 = df2.format(num1);
        System.out.println(num1Str2);
    }
}
