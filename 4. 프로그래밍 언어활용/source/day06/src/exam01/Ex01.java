package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Calculator cal = new SimpleCalculator(); // 다형성이 형성되어있으므로
        int result = cal.add(10,20);
        System.out.println(result);
        System.out.println(cal.num);

    }
}
